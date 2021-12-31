package com.example.demomicro.services;

import java.util.List;

import com.example.demomicro.entities.Customer;
import com.example.demomicro.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public List<Customer> getAll(){
       return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        
        return (Customer) customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
