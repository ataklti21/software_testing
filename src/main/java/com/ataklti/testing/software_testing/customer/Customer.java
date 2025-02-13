package com.ataklti.testing.software_testing.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


import java.util.UUID;
@Entity
//A customer Model that represents the customer
public class Customer {
    @Id
    private UUID id;
    @NotBlank
    private String customerName;
    @NotBlank
    private String phoneNumber;

    public Customer() {
    }

    public Customer(UUID id, String customerName, String phoneNumber) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
