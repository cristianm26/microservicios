package com.example.demomicro.repository;

import com.example.demomicro.entities.Supplier;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long>{
    
}
