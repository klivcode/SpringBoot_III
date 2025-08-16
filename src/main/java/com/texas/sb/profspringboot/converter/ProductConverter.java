package com.texas.sb.profspringboot.converter;

import com.texas.sb.profspringboot.dto.ProductDto;
import com.texas.sb.profspringboot.model.Product;

import java.util.List;

public class ProductConverter extends AbstractConverter<ProductDto, Product> {

    @Override
    public ProductDto toDto(Product product) {
        return null;
    }

    @Override
    public List<ProductDto> toDtoList(List<Product> entity) {
        return List.of();
    }

    @Override
    public Product toEntity(ProductDto productDto) {
        return null;
    }
}
