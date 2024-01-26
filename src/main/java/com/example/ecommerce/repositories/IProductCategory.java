package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.pivots.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductCategory extends JpaRepository<ProductCategory, Long>{


}
