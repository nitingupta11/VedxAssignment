package com.Vedx.Assignment.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Vedx.Assignment.api.dao.CustomerRepository;
import com.Vedx.Assignment.api.dao.OrderRepository;
import com.Vedx.Assignment.api.dao.ProductRepository;
import com.Vedx.Assignment.api.dao.StatusRepository;
import com.Vedx.Assignment.api.dto.OrderDto;
import com.Vedx.Assignment.api.model.Customer;
import com.Vedx.Assignment.api.model.Order;
import com.Vedx.Assignment.api.model.Product;
import com.Vedx.Assignment.api.model.Status;

@Component
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private StatusRepository statusRepo;
	
	public List<OrderDto> fetchAllOrders(){
		List<Order> orders = orderRepo.findAll();
		List<OrderDto> orderDto = new ArrayList<>();
		orders.forEach((Order order) -> {
			Customer customer = customerRepo.getById(order.getCustomer_id());
			Product product = productRepo.getById(order.getProduct_id());
			Status status = statusRepo.getById(order.getStatus_id());
			orderDto.add(new OrderDto(order.getOrder_id(), customer.getCustomer(), customer.getCountry(), customer.getAddress(), product.getProduct_title(), product.getProduct_description(), order.getDate(), status.getName()));
		});
		return orderDto;
	}
	
	public Order placeOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public Order updateStatus(Order order) {
		return orderRepo.save(order);
	}

}
