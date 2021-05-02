package com.dlvery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dlvery.model.DeliveryExecutive;
import com.dlvery.model.Inventory;
import com.dlvery.service.DLveryService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class DLveryController {
	@Autowired
	private DLveryService is;

	/*
	 * public InventoryController(inventoryService i) { // TODO Auto-generated
	 * constructor stub this.is = i; }
	 */

	@GetMapping("/inventory/all")
	public List<Inventory> getAllInventory() {
		System.out.println("Inventory GetAllInventory - " + is.getAllInventory().toString());
		return is.getAllInventory();
	}

	@PostMapping("/inventory/add")
	public Inventory addInventory(@RequestBody Inventory i) {
		System.out.println("Inventory Added - " + i.toString());
		return is.addInventory(i);
	}
	
	@PostMapping("/executive/add")
	public DeliveryExecutive addExecutive(@RequestBody DeliveryExecutive de) {
		return is.addExecutive(de);
	}
	
	@GetMapping("/executive/all")
	public List<DeliveryExecutive> getAllExecutive(){
			return is.getAllExecutive();
	}
	
	@PutMapping("/executive/assignExecutive")	
	public void assignExecutives(@RequestBody List<Inventory> selected) {
//			return null;
				is.assignExecutives(selected);
	}
	
	

}
