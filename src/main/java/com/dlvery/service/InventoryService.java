package com.dlvery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlvery.model.Inventory;
import com.dlvery.repo.IRepo;

@Service
public class InventoryService {
	@Autowired
	private IRepo ir;

	public Inventory addInventory(Inventory i) {
		return ir.save(i);
	}

	public List<Inventory> getAllInventory() {
		return ir.findAll();
	}

	public void deleteInventory(String del) {
		// ir.deleteById(del);
	}

}
