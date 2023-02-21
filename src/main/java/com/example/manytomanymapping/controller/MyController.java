package com.example.manytomanymapping.controller;

import com.example.manytomanymapping.model.Category;
import com.example.manytomanymapping.model.Product;
import com.example.manytomanymapping.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    CategoryRepo categoryRepo;

    @PostMapping("/post")
    public void add(){
        Product product = new Product();
        product.setProduct_Id("P11");
        product.setProductName("Iphone14promax");

        Product producttwo = new Product();
        producttwo.setProduct_Id("P12");
        producttwo.setProductName("Samsungs24");

        Product productthree = new Product();
        productthree.setProduct_Id("P13");
        productthree.setProductName("Samsung TV");

        Category category = new Category();
        category.setCategory_id("C11");
        category.setTitle("Electronics");

        Category categoryone = new Category();
        categoryone.setCategory_id("C12");
        categoryone.setTitle("Phones");

        List<Product> categoryOneProducts = category.getProducts();
        categoryOneProducts.add(product);
        categoryOneProducts.add(producttwo);
        categoryOneProducts.add(productthree);

        List<Product> categoryTwoProducts = categoryone.getProducts();
        categoryTwoProducts.add(product);
        categoryTwoProducts.add(producttwo);

        categoryRepo.save(categoryone);
        categoryRepo.save(category);
    }
}
