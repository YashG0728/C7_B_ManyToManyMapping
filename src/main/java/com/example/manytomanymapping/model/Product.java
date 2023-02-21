package com.example.manytomanymapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String product_Id;
    private String productName;
    @ManyToMany(mappedBy = "products")
    private List<Category> categories = new ArrayList<>();
}
