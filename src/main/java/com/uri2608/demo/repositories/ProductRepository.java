package com.uri2608.demo.repositories;

import com.uri2608.demo.entities.Product;
import com.uri2608.demo.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT MAX(price) AS max_price, MIN(price) AS min_price " +
            "FROM products " )
    List<ProductProjection> search();
}

