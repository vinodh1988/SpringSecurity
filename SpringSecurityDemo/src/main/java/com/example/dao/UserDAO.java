package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.User;

public interface UserDAO extends CrudRepository<User, Long> {

	User findByUsername(String userId);

}
