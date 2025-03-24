package com.bytecode.controller;

import com.bytecode.controller.requests.CustomerRequest;
import com.bytecode.domain.customer.Customer;
import com.bytecode.domain.customer.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;


    @RestController
    @RequestMapping("/customers")
    public class CustomerController {

        private final CustomerFactory customerFactory;
        @Autowired
        public CustomerController(CustomerFactory customerFactory) {
            this.customerFactory = customerFactory;

        }
        @PostMapping
        public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest request) {
            Customer customer = new Customer();
            customer.setName(request.getName());
            customer.setCreditProfile(request.getCreditProfile());
            customer.setDocumentType(request.getType());
            Customer.Document document = new Customer.Document();
            document.setType(request.getDocument().getType());
            document.setCode(request.getDocument().getCode());
            customer.setLegalDocument(document);



            customerFactory.createCustomer(customer);
            UUID customerId = UUID.randomUUID();
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("customerId", customerId));
        }
    }

