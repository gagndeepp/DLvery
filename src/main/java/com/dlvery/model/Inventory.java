package com.dlvery.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "inventory")
public class Inventory {

	@Id
	public String productId;
	@Field
	public String productName;
	@Field
	public String priority;
	
	public Inventory() {
		super();
	}

	public Inventory(String productId, String productName, String priority, String productCategory, Date checkInDate,
			Date checkOutDate, String customerAddress, String contactNumber, String status,
			DeliveryExecutive executive) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.priority = priority;
		this.productCategory = productCategory;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.customerAddress = customerAddress;
		this.contactNumber = contactNumber;
		this.status = status;
		this.executive = executive;
	}

	@Field
	public String productCategory;
	@Field
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public Date checkInDate;
	@Field
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public Date checkOutDate;
	@Field
	public String customerAddress;
	@Field
	public String contactNumber;
	@Field
	public String status;

	public DeliveryExecutive getExecutive() {
		return executive;
	}

	public void setExecutive(DeliveryExecutive executive) {
		this.executive = executive;
	}

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

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", productName=" + productName + ", priority=" + priority
				+ ", productCategory=" + productCategory + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", customerAddress=" + customerAddress + ", contactNumber=" + contactNumber
				+ ", status=" + status + ", executive=" + executive + "]";
	}

	

}
