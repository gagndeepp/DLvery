package com.dlvery.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dlvery.model.DeliveryExecutive;

@Repository
public interface DeliveryExRepo extends MongoRepository<DeliveryExecutive, String>{

}
