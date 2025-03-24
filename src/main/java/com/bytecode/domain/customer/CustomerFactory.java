package com.bytecode.domain.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerFactory {
    private static final Logger logger = LoggerFactory.getLogger(CustomerFactory.class);

    private final ICustomerRepository customerRepository;

    @Autowired
    public CustomerFactory(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer createCustomer(Customer customer) {
        logger.info("Creating customer: " + customer);
        return customerRepository.save(customer);
    }
}
