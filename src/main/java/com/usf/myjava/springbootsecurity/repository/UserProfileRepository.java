package com.usf.myjava.springbootsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import com.usf.myjava.springbootsecurity.model.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, Integer>{

}
