package com.uri2608.demo;

import com.uri2608.demo.dto.ProductDTO;
import com.uri2608.demo.projections.ProductProjection;
import com.uri2608.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        List<ProductProjection> list = repository.search();

        List<ProductDTO> result = list.stream().map(x-> new ProductDTO(x.getMaxPrice(), x.getMinPrice())).collect(Collectors.toList());

        for (ProductDTO obj : result){
            System.out.println(obj.getMaxPrice() + " " + obj.getMinPrice());
        }
    }
}
