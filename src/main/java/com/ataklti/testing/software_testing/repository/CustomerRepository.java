package com.ataklti.testing.software_testing.repository;


import com.ataklti.testing.software_testing.customer.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {

}
