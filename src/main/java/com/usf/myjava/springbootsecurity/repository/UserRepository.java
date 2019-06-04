package com.usf.myjava.springbootsecurity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.usf.myjava.springbootsecurity.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	Optional<User> findByUsername(String username);
}
