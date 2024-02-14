/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ogl.devtest.customer;

import java.util.HashMap;
import java.util.Optional;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jackw
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> findById(@PathVariable("id") long id) {
        final Optional<Customer> customer = customerRepository.findById(id);

        return customer.isPresent() ? ResponseEntity.of(customer) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping(value = "/citygrouping", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HashMap<String, Integer>> customerCountByCity() {

        HashMap<String, Integer> cityCustomerCounts = new HashMap<>();
        Iterable<Customer> customers = customerRepository.findAll();

        for (Customer customer : customers) {
            if (customer.getCity() != null && customer.getCity().trim().length() > 0) {
                String city = customer.getCity().trim();
                cityCustomerCounts.put(city, cityCustomerCounts.getOrDefault(city, 0) + 1);
            }
        }

        return ResponseEntity.ok(cityCustomerCounts);
    }
}
