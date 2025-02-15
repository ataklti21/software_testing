package com.ataklti.testing.software_testing.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/customer-registration")
public class CustomerRegistrationController {
    @PutMapping
    public void registerNewCustomer(
            @Valid @RequestBody CustomerRegistrationRequest registrationRequest) {

    }
}
