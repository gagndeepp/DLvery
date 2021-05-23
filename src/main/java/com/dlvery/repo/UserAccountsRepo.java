package com.dlvery.repo;

import com.dlvery.model.UserAccounts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountsRepo extends MongoRepository<UserAccounts, String>{

}
