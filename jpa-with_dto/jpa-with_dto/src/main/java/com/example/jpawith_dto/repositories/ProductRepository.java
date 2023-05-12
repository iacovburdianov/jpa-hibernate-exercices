package com.example.jpawith_dto.repositories;

import com.example.jpawith_dto.model.dto.ProductDto;
import com.example.jpawith_dto.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("""
        SELECT p FROM Product p 
    """)
    List<Product> findAll(); //taking entities and putting them in jpa context

    @Query("""
            SELECT new com.example.jpawith_dto.model.dto.ProductDto(p.id, p.name, p.price) FROM Product p        
            """)
    List<ProductDto> findAllDto(); // taking objects and putting outside of the context

}
