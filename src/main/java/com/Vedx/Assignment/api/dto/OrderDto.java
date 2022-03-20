package com.Vedx.Assignment.api.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderDto {
	Long order_id;
    String customer;
    String country;
    String address;
    String product_title;
    String product_description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    LocalDate date;
    String status;
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
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
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OrderDto(Long order_id, String customer, String country, String address, String product_title,
			String product_description, LocalDate date, String status) {
		super();
		this.order_id = order_id;
		this.customer = customer;
		this.country = country;
		this.address = address;
		this.product_title = product_title;
		this.product_description = product_description;
		this.date = date;
		this.status = status;
	}
    
    
}
