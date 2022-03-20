package com.Vedx.Assignment.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vedx.Assignment.api.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
