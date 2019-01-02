package com.goforsys.Product.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.goforsys.Product.model.Role;

public interface RoleRepo extends MongoRepository<Role, String>{
	Role findByRole(String role);
}
