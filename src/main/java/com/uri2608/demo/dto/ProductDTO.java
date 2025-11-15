package com.uri2608.demo.dto;

import com.uri2608.demo.projections.ProductProjection;

public class ProductDTO {
    private Double maxPrice;
    private Double minPrice;

    //A ideia que temos no projection será a mesma ideia aqui no dto

    public ProductDTO(Double maxPrice, Double minPrice) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    public ProductDTO(ProductProjection projection){
        maxPrice = projection.getMaxPrice();
        minPrice = projection.getMinPrice();
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }
}
