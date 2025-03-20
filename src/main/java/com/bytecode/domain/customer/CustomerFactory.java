package com.bytecode.domain.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerFactory {
    public Customer createCustomer(Customer customer) {
        System.out.println("Creating customer: " + customer);


        return customer;
    }
}
