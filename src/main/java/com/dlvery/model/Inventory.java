package com.dlvery.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "inventory")
public class Inventory {
	
	@Id
	public String productId;
	@Field
	public String productName;
	@Field
	public String priority;
	@Field
	public String productCategory;
	@Field
	public Date checkInDate;
	@Field 
	public Date checkOutDate;
	@Field
	public String customerAddress;
	@Field
	public String contactNumber;
	@Field
	public String status;
	@Field
	public DeliveryExecutive executive;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Inventory(String productId, String productName, String priority) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.priority = priority;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "inventory [productId=" + productId + ", productName=" + productName + "]";
	}

}
