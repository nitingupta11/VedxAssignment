package com.Vedx.Assignment.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vedx.Assignment.api.dto.OrderDto;
import com.Vedx.Assignment.api.model.Order;
import com.Vedx.Assignment.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/fetchAllOrders")
	public ResponseEntity<List<OrderDto>> fetchAllOrders(){
		return ResponseEntity.status(HttpStatus.OK).body(orderService.fetchAllOrders());
		
	}
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Order> placeOrder(@RequestBody Order order){
		return ResponseEntity.status(HttpStatus.OK).body(orderService.placeOrder(order));
	}
	
	@PutMapping("/updateOrderStatus")
	public ResponseEntity<Order> updateorderStatus(@RequestBody Order order){
		return ResponseEntity.status(HttpStatus.OK).body(orderService.updateStatus(order));	
	}
	
	
}
