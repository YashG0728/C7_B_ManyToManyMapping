package com.example.manytomanymapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_repository")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private String category_id;
    private String title;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

}
