package com.example.demomicro.controllers;

import java.util.List;

import com.example.demomicro.entities.Employee;
import com.example.demomicro.services.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getAll(){
       return employeeService.getAll();
    }

    @GetMapping("/api/employees/{id}")
    public Employee getById(@PathVariable String id){
        return employeeService.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/employees/{id}")
    public void remove(@PathVariable String id ){
        employeeService.remove(Long.parseLong(id));
    }

    @PostMapping("/api/employees")
    public void save(@RequestBody Employee employee) {
        employeeService.save(employee);
    }
}
