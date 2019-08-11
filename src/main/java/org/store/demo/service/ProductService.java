package org.store.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.store.demo.domain.Product;
import org.store.demo.dto.ProductDto;
import org.store.demo.repository.ProductRepository;

import java.util.List;

import static org.store.demo.mapper.ProductMapper.*;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = false) //blokuje rekord do zmiany przez innych uzytkownikow
    public void createProduct(ProductDto productDto){

        Product product = toEntity(productDto);
                this.productRepository.save(product);
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Transactional(readOnly = false)
    public void deleteProductById(Long id) {
        this.productRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Product getById(Long id) {
        return productRepository.getOne(id);
    }

    @Transactional
    public void updateProduct(ProductDto productDto) {
        productRepository.save(toEntity(productDto));
    }
}