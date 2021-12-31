package com.example.demomicro.services;

import java.util.List;

import com.example.demomicro.entities.Employee;
import com.example.demomicro.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
        public List<Employee> getAll(){
            return (List<Employee>) employeeRepository.findAll();
        }
        
        public Employee getById(Long id){
            return (Employee) employeeRepository.findById(id).orElse(null);
        }
        
        public void remove(Long id){
            employeeRepository.deleteById(id);
        }
        
        public void save(Employee employee){
            employeeRepository.save(employee);
        }
    
}
