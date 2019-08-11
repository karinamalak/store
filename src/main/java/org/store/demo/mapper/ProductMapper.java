package org.store.demo.mapper;

import org.store.demo.domain.Product;
import org.store.demo.dto.ProductDto;

public class ProductMapper {
    public static Product toEntity(ProductDto productDto) {
        
        Product product = new Product();
        product.setId(productDto.getId());
        product.setProductName(productDto.getProductName());
        product.setCategory(productDto.getCategory());
        product.setPrice(productDto.getPrice());
        product.setAmount(productDto.getAmount());
        return product;
    }

    public static ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setProductName(product.getProductName());
        productDto.setCategory(product.getCategory());
        productDto.setPrice(product.getPrice());
        productDto.setAmount(product.getAmount());
        return productDto;
    }

}
