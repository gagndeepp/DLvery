package com.dlvery.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dlvery.model.Controversy;

@Repository
public interface ControversyRepo extends MongoRepository<Controversy, String> {

}
