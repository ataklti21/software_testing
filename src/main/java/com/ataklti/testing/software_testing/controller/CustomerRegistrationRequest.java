package com.ataklti.testing.software_testing.controller;

import com.ataklti.testing.software_testing.customer.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRegistrationRequest {
    private final Customer customer;

    public CustomerRegistrationRequest(
            @JsonProperty("customer") Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "CustomerRegistrationRequest{" +
                "customer=" + customer +
                '}';
    }
}
