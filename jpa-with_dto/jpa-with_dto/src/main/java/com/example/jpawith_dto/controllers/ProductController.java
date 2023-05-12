package com.example.jpawith_dto.controllers;

import com.example.jpawith_dto.model.dto.ProductDto;
import com.example.jpawith_dto.model.entities.Product;
import com.example.jpawith_dto.services.ProductService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAll() {
       return productService.getAll();
    }

    @GetMapping("/alldtos")
    public List<ProductDto> getAllDto() {
        return productService.getAllDto();
    }
}
