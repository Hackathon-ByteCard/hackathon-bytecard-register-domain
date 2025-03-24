package com.bytecode.domain.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerFactory {

    private final ICustomerRepository customerRepository;

    @Autowired
    public CustomerFactory(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer createCustomer(Customer customer) {
        System.out.println("Creating customer: " + customer);
        return customerRepository.save(customer);
    }
}
