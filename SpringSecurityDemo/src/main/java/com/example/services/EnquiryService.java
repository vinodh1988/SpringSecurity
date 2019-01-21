package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EnquiryDAO;
import com.example.entity.Enquiry;

@Service
public class EnquiryService {
@Autowired
	EnquiryDAO dao;
  public List<Enquiry> getEnquires(){
	return  (List<Enquiry>)dao.findAll();
  }
}
