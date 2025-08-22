package com.cwc.mask.data.services;

import com.cwc.mask.data.entity.Customer;
import com.cwc.mask.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }


    public Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "User not found with this id " + id));
    }

}
