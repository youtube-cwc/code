package com.cwc.mask.data.controller;


import com.cwc.mask.data.entity.Customer;
import com.cwc.mask.data.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllCustomer()
    {

        return ResponseEntity.ok(customerService.getAllCustomer());
    }


    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id)
    {

        return ResponseEntity.ok(customerService.getCustomer(id));
    }

}
