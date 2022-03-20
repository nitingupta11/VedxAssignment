package com.Vedx.Assignment.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Vedx.Assignment.api.dao.CustomerRepository;
import com.Vedx.Assignment.api.model.Customer;

@Component
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
}
