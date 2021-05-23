package com.dlvery.controller;

import java.util.List;

import com.dlvery.model.UserAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dlvery.model.Inventory;
import com.dlvery.service.DLveryService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class DLveryController {
	@Autowired
	private DLveryService ds;

	/*
	 * public InventoryController(inventoryService i) { // TODO Auto-generated
	 * constructor stub this.is = i; }
	 */

	@GetMapping("/inventory/all")
	public List<Inventory> getAllInventory() {
		System.out.println("Inventory GetAllInventory - " + ds.getAllInventory().toString());
		return ds.getAllInventory();
	}

	@PostMapping("/inventory/add")
	public Inventory addInventory(@RequestBody Inventory i) {
		System.out.println("Inventory Added - " + i.toString());
		return ds.addInventory(i);
	}

	@PostMapping("/inventory/batchAdd")
	public void addBatchInv(@RequestBody List<Inventory> list) {
		ds.addBatchInv(list);
	}
	
	@GetMapping("/executive/getMyInventory")
	public List<Inventory> getMyInventory(@RequestParam String contact){
		return ds.getMyInventory(contact);
	}
	
	@PutMapping("/executive/assignExecutive")	
	public void assignExecutives(@RequestBody List<Inventory> selected) {
//			return null;
				ds.assignExecutives(selected);
	}

	@PostMapping("/user/signup")
	public void performSignUp(@RequestBody UserAccounts ua){
		ds.performSignUp(ua);
	}

	@GetMapping("/users/all")
	public List<UserAccounts> getAllUsers(){
		return ds.getAllUsers();
	}
	
	

}
