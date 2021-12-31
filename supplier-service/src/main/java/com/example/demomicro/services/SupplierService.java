package com.example.demomicro.services;

import java.util.List;

import com.example.demomicro.entities.Supplier;
import com.example.demomicro.repository.SupplierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService implements ISupplierService{

    @Autowired
    private SupplierRepository supplierRepository;
    
    @Override
    public List<Supplier> getAll(){
       return (List<Supplier>) supplierRepository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        
        return (Supplier) supplierRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }
}
