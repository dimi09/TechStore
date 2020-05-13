package com.techStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.techStore.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
