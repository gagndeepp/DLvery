package com.dlvery.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dlvery.model.Inventory;

@Repository
public interface IRepo extends MongoRepository<Inventory, String> {

}
