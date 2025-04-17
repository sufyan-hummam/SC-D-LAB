package com.general.scd.controller;

import com.general.scd.exception.ApplicationNotFoundException;
import com.general.scd.model.JobApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/job-applications")
public class JobApplicationController {

    // In-memory storage for demo purposes
    private final Map<Long, JobApplication> applications = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    // Upload a job application
    @PostMapping("/upload")
    public JobApplication uploadApplication(@RequestParam("applicantName") String applicantName,
                                            @RequestParam("file") MultipartFile file) {
        long id = idCounter.incrementAndGet();
        JobApplication application = new JobApplication();
        application.setId(id);
        application.setApplicantName(applicantName);
        application.setFileName(file.getOriginalFilename());
        application.setUploadDate(LocalDate.now());
        // For this lab, file content is not stored.
        applications.put(id, application);
        return application;
    }

    // List all job applications
    @GetMapping
    public List<JobApplication> getAllApplications() {
        return new ArrayList<>(applications.values());
    }

    // Delete an application
    @DeleteMapping("/{id}")
    public String deleteApplication(@PathVariable Long id) {
        if (applications.remove(id) == null) {
            throw new ApplicationNotFoundException("Application not found with id: " + id);
        }
        return "Application with id " + id + " deleted successfully.";
    }

    // Exception handling for not found applications
    @ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
    @ExceptionHandler(ApplicationNotFoundException.class)
    public Map<String, String> handleNotFound(ApplicationNotFoundException ex) {
        return Collections.singletonMap("error", ex.getMessage());
    }
}
