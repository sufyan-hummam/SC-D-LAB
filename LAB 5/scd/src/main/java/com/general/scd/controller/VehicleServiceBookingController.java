package com.general.scd.controller;

import com.general.scd.exception.BookingNotFoundException;
import com.general.scd.model.ServiceBooking;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/vehicle-service-bookings")
public class VehicleServiceBookingController {

    // In-memory storage for demo purposes
    private final Map<Long, ServiceBooking> bookings = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    // Create a new service booking (existing endpoint)
    @PostMapping
    public ServiceBooking createBooking(@RequestBody ServiceBooking booking) {
        long id = idCounter.incrementAndGet();
        booking.setId(id);
        bookings.put(id, booking);
        return booking;
    }

    // Upload a new service booking record (similar to teacher's uploadRecord)
    @PostMapping("/upload")
    public ServiceBooking uploadBookingRecord(@RequestBody ServiceBooking booking) {
        long id = idCounter.incrementAndGet();
        booking.setId(id);
        bookings.put(id, booking);
        return booking;
    }

    // Upload a file containing service booking details (similar to teacher's uploadFile)
    @PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("File is empty. Please upload a valid file.");
        }
        // Simulate file processing (e.g., reading file contents and processing booking data)
        String response = "File uploaded and processed successfully.";
        return ResponseEntity.ok(response);
    }

    // Retrieve all service bookings
    @GetMapping
    public List<ServiceBooking> getAllBookings() {
        return new ArrayList<>(bookings.values());
    }

    // Retrieve a booking by ID
    @GetMapping("/{id}")
    public ServiceBooking getBookingById(@PathVariable Long id) {
        ServiceBooking booking = bookings.get(id);
        if (booking == null) {
            throw new BookingNotFoundException("Booking not found with id: " + id);
        }
        return booking;
    }

    // Update booking details
    @PutMapping("/{id}")
    public ServiceBooking updateBooking(@PathVariable Long id, @RequestBody ServiceBooking updatedBooking) {
        ServiceBooking booking = bookings.get(id);
        if (booking == null) {
            throw new BookingNotFoundException("Booking not found with id: " + id);
        }
        booking.setModel(updatedBooking.getModel());
        booking.setRegistrationNumber(updatedBooking.getRegistrationNumber());
        booking.setServiceType(updatedBooking.getServiceType());
        booking.setPreferredDate(updatedBooking.getPreferredDate());
        return booking;
    }

    // Delete a booking
    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id) {
        if (bookings.remove(id) == null) {
            throw new BookingNotFoundException("Booking not found with id: " + id);
        }
        return "Booking with id " + id + " deleted successfully.";
    }

    // Exception handling for not found bookings
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(BookingNotFoundException.class)
    public Map<String, String> handleNotFound(BookingNotFoundException ex) {
        return Collections.singletonMap("error", ex.getMessage());
    }
}