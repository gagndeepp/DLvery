package com.dlvery.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "executive")
public class DeliveryExecutive {

	@Field
	public String exName;
	@Id
	public String exId;
	@Field
	public String exContact;

	public String getExName() {
		return exName;
	}

	public DeliveryExecutive(String exId, String exName, String exContact) {
		super();
		this.exName = exName;
		this.exId = exId;
		this.exContact = exContact;
	}

	public DeliveryExecutive() {
		super();
	}

	public void setExName(String exName) {
		this.exName = exName;
	}

	public String getExId() {
		return exId;
	}

	public void setExId(String exId) {
		this.exId = exId;
	}

	public String getExContact() {
		return exContact;
	}

	public void setExContact(String exContact) {
		this.exContact = exContact;
	}

	@Override
	public String toString() {
		return "DLveryExecutive [exName=" + exName + ", exId=" + exId + ", exContact=" + exContact + "]";
	}

}
