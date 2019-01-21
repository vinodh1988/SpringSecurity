package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.PGStudentDAO;
import com.app.messaging.Sender;
import com.app.model.PGStudent;
import com.app.model.Student;

@RestController
@RequestMapping("/messages")
public class FirstController {
   @Autowired
     Sender sender;
   
   @Autowired
     PGStudentDAO pdao;
   
   @RequestMapping("/first")
   public String success(){
	   sender.send("############firstMessage$$$$$$$$$$$$$");
	   return  "Success";
   }
   
   @RequestMapping("/studentadd")
   public ResponseEntity<Student> addStudent(@RequestBody PGStudent student){
	  try{
	   pdao.save(student);
	   return new ResponseEntity(student,HttpStatus.OK);
	  }
	  catch(Exception e)
	  {
		 return new ResponseEntity(student,HttpStatus.INTERNAL_SERVER_ERROR);
	  }
   }
}
