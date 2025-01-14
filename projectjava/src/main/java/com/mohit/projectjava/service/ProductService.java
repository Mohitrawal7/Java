package com.mohit.projectjava.service;

import com.mohit.projectjava.model.Product;
import com.mohit.projectjava.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{

    @Autowired
private ProductRepo repo;

    public List<Product> getAllProducts() {
    return repo.findAll();
    }
}
