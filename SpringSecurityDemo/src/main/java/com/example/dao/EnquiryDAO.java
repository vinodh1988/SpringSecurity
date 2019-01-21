package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Enquiry;



public interface EnquiryDAO extends CrudRepository<Enquiry, Long>{

}