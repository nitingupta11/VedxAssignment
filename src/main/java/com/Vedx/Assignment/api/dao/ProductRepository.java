package com.Vedx.Assignment.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vedx.Assignment.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
