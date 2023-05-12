package com.example.jpawith_dto.services;

import com.example.jpawith_dto.model.dto.ProductDto;
import com.example.jpawith_dto.model.entities.Product;
import com.example.jpawith_dto.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        var list = productRepository.findAll();
        list.forEach(p -> p.setPrice(BigDecimal.valueOf(1000)));
        return list;
    }

    public List<ProductDto> getAllDto() {
        var list = productRepository.findAllDto();
        list.forEach(p -> p.setPrice(BigDecimal.valueOf(1000)));
        return list;
    }

}
