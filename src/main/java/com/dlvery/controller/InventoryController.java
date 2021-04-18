package com.dlvery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlvery.model.Inventory;
import com.dlvery.service.InventoryService;

@RestController
@RequestMapping(value = "inventory")
public class InventoryController {
	@Autowired
	private InventoryService is;

	/*
	 * public InventoryController(inventoryService i) { // TODO Auto-generated
	 * constructor stub this.is = i; }
	 */

	@GetMapping("/all")
	public List<Inventory> allInventory() {
		return is.getAllInventory();
	}

	@PostMapping("/add")
	public Inventory addAll(@RequestBody Inventory i) {
		return is.addInventory(i);
	}

}
