package com.example.manytomanymapping;

import com.example.manytomanymapping.model.Category;
import com.example.manytomanymapping.model.Product;
import com.example.manytomanymapping.repo.CategoryRepo;
import com.example.manytomanymapping.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ManyToManyMappingApplication {
    @Autowired
    private static CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyMappingApplication.class, args);


    }

}
