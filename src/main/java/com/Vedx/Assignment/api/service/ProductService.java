package com.Vedx.Assignment.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Vedx.Assignment.api.dao.ProductRepository;
import com.Vedx.Assignment.api.model.Product;

@Component
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
}
