package com.Vedx.Assignment.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Product")
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "product_id")
	Long product_id;
	
	@Column(name= "product_title")
	String product_title;
	@Column(name= "product_description")
	String product_description;
	public Product() {
		
	}
	
	public Product(Long product_id, String product_title, String product_description) {
		super();
		this.product_id = product_id;
		this.product_title = product_title;
		this.product_description = product_description;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
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
	
	
	
}
