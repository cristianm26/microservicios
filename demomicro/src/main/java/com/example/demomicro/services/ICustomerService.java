package com.example.demomicro.services;

import java.util.List;

import com.example.demomicro.entities.Customer;

public interface ICustomerService {
    
    List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);  
}
