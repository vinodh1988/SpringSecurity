package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ReviewDAO;
import com.example.entity.Reviews;

@Service
public class ReviewService {

	 @Autowired
	 ReviewDAO rdao;
	 
	 public List<Reviews> getReviews(){
		return (List<Reviews>) rdao.findAll();
	 }
}
