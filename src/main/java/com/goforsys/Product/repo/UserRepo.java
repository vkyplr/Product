package com.goforsys.Product.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.goforsys.Product.model.User;

public interface UserRepo extends MongoRepository<User, String>{
	User findByEmail(String email);
}
