package com.ataklti.testing.software_testing.service;

import com.ataklti.testing.software_testing.controller.CustomerRegistrationRequest;
import com.ataklti.testing.software_testing.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerRegistrationService {
    //Dependency Injection for the repository
    private  final CustomerRepository customerRepository;

    @Autowired
    public CustomerRegistrationService(CustomerRepository repository) {
        this.customerRepository = repository;
    }

    public void registerNewCustomer(CustomerRegistrationRequest request) {

    }
}
