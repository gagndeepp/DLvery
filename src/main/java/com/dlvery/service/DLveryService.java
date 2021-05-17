package com.dlvery.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

	@Autowired
	public MongoOperations mongoOp;

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

	public List<DeliveryExecutive> getAllExecutive() {
		return dr.findAll();
	}

	public void deleteInventory(String del) {
		// ir.deleteById(del);
	}
	
	public List<Inventory> getMyInventory(String execId){
			
		List<Inventory> res;
		Query q = new Query();
		q.addCriteria(Criteria.where("executive.exId").is(execId));
		
		res = mongoOp.find(q, Inventory.class);
		
		System.out.println(res);
		Collections.sort(res, (a,b) -> a.getPriority().compareTo(b.getPriority()));
		return res;
	}

	public void assignExecutives(@RequestBody List<Inventory> selected) {
//		return null;
		System.out.println("Service Layer AssignExecutive - \n \n " + selected.toString());
//		 mongoOp.updateMulti(null, (Update) selected, Inventory.class);
//		ir.save(selected);

		for (Inventory i : selected) {
			Query q = new Query();
			q.addCriteria(Criteria.where("productId").is((i.getProductId())));
			Update u = new Update();
			u.set("checkOutDate", i.getCheckOutDate());
			u.set("status", i.getStatus());	
			u.set("executive", i.getExecutive());
			
			System.out.println("ForLoop ---- -- -  - - -- -- " + q + " >>>> " + u);
			mongoOp.updateMulti(q,u, Inventory.class);
		}

//		Query query = new Query();
//        query.addCriteria(Criteria.where("id").is(department.getId()));
//        Update update = new Update();
//        update.set("name", department.getName());
//        update.set("description", department.getDescription());
//        return mongoOp.findAndModify(query, update, Department.class);
	}
	public void addBatchInv(List <Inventory> list)
	{
		ir.save(list);
	}

}
