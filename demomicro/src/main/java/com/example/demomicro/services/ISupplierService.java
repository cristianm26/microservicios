package com.example.demomicro.services;

import java.util.List;

import com.example.demomicro.entities.Supplier;

public interface ISupplierService {
    List<Supplier> getAll();
    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);  
}
