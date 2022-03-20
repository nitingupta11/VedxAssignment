package com.Vedx.Assignment.api.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "order_id")
	Long order_id;
	
	@Column(name = "order_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	LocalDate date;
	
	@Column(name = "status_id")
	Long status_id;
	
	@Column(name = "product_id")
	Long product_id;
	
	@Column(name = "customer_id")
	Long customer_id;
	
//	@JoinTable(name = "Status", 
//			joinColumns =  @JoinColumn(name= "status_id", referencedColumnName= "status_id")
//	)
//	Status status;
//	
//	
//	@JoinTable(name = "Customer", 
//			joinColumns =  @JoinColumn(name= "Customer_id", referencedColumnName= "Customer_id")
//	)
//	Customer customer;
//	
//	@JoinTable(name = "Product", 
//			joinColumns =  @JoinColumn(name= "product_id", referencedColumnName= "product_id")
//	)
//	Product product;
	
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Long getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Long status_id) {
		this.status_id = status_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public Order() {
		
	}
	public Order(Long order_id, LocalDate date, Long status_id, Long product_id, Long customer_id) {
		super();
		this.order_id = order_id;
		this.date = date;
		this.status_id = status_id;
		this.product_id = product_id;
		this.customer_id = customer_id;
	}
	
	
	
}
