package com.happyfresh.learn.controller;

import com.happyfresh.learn.model.Customer;
import com.happyfresh.learn.repository.CustomerRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es")
@Log4j2
public class ElasticsearchController {

    public CustomerRepository customerRepository;

    public ElasticsearchController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping("/add/{name}")
    public Customer addNewCustomer(@PathVariable String name){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setId("1");
        customer.setCardNumber("12345");
        customer.setLastItemBought("TV");

        log.info("Saving to ES: {}" , customer.toString());
        customerRepository.save(customer);
        return customer;
    }

}


