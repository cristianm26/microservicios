package com.example.demomicro.services;

import java.util.List;

import com.example.demomicro.entities.Employee;

public interface IEmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    void remove(Long id);
    void save(Employee employee); 
}
