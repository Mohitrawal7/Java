package com.mohit.projectjava.controller;

import com.mohit.projectjava.model.Product;
import com.mohit.projectjava.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @RequestMapping("/")
 public String greet(){
     return "HEllosdn";
 }

 @GetMapping("/products")
 public List<Product> getAllProducts(){
        return service.getAllProducts();
 }

}
