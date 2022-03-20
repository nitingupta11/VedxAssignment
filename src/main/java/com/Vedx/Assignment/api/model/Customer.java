package com.Vedx.Assignment.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	Long customer_id;
	@Column(name="customer")
	String customer;
	@Column(name="country")
	String country;
	@Column(name="address")
	String address;
	
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Customer() {
		
	}
	
	public Customer(Long customer_id, String customer, String country, String address) {
		super();
		this.customer_id = customer_id;
		this.customer = customer;
		this.country = country;
		this.address = address;
	}
	
	
}
