package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Reviews;



public interface ReviewDAO extends CrudRepository<Reviews, Long>{

}