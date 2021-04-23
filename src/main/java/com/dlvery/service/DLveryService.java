package com.dlvery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlvery.model.Controversy;
import com.dlvery.model.DeliveryExecutive;
import com.dlvery.model.Inventory;
import com.dlvery.repo.ControversyRepo;
import com.dlvery.repo.DeliveryExRepo;
import com.dlvery.repo.InventoryRepo;

@Service
public class DLveryService {
	@Autowired
	private InventoryRepo ir;
	@Autowired
	private DeliveryExRepo dr;
	@Autowired 
	private ControversyRepo cr;
	
	public Inventory addInventory(Inventory i) {
		return ir.save(i);
	}
	
	public DeliveryExecutive addExecutive(DeliveryExecutive de) {
			return dr.save(de);
	}
	
	public Controversy addControversy(Controversy c) {
			return cr.save(c);
	}
	public List<Inventory> getAllInventory() {
		return ir.findAll();
	}
	
	public List<DeliveryExecutive> getAllExecutive(){
		return dr.findAll();
	}

	public void deleteInventory(String del) {
		// ir.deleteById(del);
	}	

}
