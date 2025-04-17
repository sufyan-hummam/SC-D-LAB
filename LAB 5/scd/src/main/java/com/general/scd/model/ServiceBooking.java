package com.general.scd.model;

import java.time.LocalDate;

public class ServiceBooking {
    private Long id;
    private String model;
    private String registrationNumber;
    private String serviceType;
    private LocalDate preferredDate;

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getServiceType() {
        return serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public LocalDate getPreferredDate() {
        return preferredDate;
    }
    public void setPreferredDate(LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }
}
