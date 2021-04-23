package com.dlvery.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class  Controversy {
		public String contactNumber;
		public Inventory inventory;
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public Inventory getInventory() {
			return inventory;
		}
		public void setInventory(Inventory inventory) {
			this.inventory = inventory;
		}
		@Override
		public String toString() {
			return "Controversy [contactNumber=" + contactNumber + ", inventory=" + inventory + "]";
		}
		
		
}
