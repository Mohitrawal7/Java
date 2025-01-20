package com.mohit.projectjava.repo;

import com.mohit.projectjava.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepo extends JpaRepository<Product, Integer> {

}
