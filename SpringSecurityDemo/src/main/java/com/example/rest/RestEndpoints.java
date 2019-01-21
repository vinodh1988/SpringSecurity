package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Enquiry;
import com.example.entity.Reviews;
import com.example.services.EnquiryService;
import com.example.services.ReviewService;

@RestController
@RequestMapping("/secured-api")
public final class RestEndpoints {
	@Autowired
	EnquiryService eservice;
	
	@Autowired
	ReviewService rservice;

	@RequestMapping("/enquiries")
	   public List<Enquiry> getEnquires(){
		return eservice.getEnquires();
	}
	
	@RequestMapping("/reviews")
		public List<Reviews> getReviews(){
			return rservice.getReviews();
	}
	
	
}
