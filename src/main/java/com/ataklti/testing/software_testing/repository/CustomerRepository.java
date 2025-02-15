package com.ataklti.testing.software_testing.repository;


import com.ataklti.testing.software_testing.customer.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
    /**
     * Retrieves a customer based on the provided phone number.

     * This method executes a native SQL query to select the `id`, `customerName`,
     * and `phoneNumber` from the `Customer` table where the `phoneNumber` matches
     * the given parameter.
     *
     * @param phone_Number The phone number used to search for the customer.
     * @return An {@link Optional} containing the {@link Customer} if found, or empty if no match is found.
     */
    @Query(value = "SELECT id, customerName, phoneNumber FROM Customer WHERE phoneNumber = :phoneNumber",
            nativeQuery = true)
    Optional<Customer> selectCustomerByPhoneNumber(@Param("phoneNumber") String phone_Number);
}
