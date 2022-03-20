package com.Vedx.Assignment.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vedx.Assignment.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
