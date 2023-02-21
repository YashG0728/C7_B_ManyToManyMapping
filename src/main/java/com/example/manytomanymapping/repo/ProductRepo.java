package com.example.manytomanymapping.repo;

import com.example.manytomanymapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,String>{
}
