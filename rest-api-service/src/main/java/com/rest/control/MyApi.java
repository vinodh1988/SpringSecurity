package com.rest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dao.PersonDAO;
import com.rest.jsonentities.Department;
import com.rest.entity.Person;
import com.rest.services.DataService;
import com.rest.services.DepartmentService;

@RestController
@RequestMapping("/rest-api")
public class MyApi {
	@Autowired
	DataService ds;
	@Autowired
	PersonDAO pdao;
	@Autowired
	DepartmentService dservice;
@RequestMapping("/greet")
	public String home(){
		return "First Service";
	}

@RequestMapping("/names")
   public String[] getNames(){
	   return ds.getName();
   }

@RequestMapping(value="/people")
   public List<Person> getPeople(){
	   return (List<Person>)pdao.findAll();
    }

@RequestMapping("/departments")
	public List<Department> getDepartment()
{
	  return dservice.getDepartments();
}

@RequestMapping(value="/people",method=RequestMethod.POST)
   public ResponseEntity<Person> addPerson(@RequestBody Person p){
	   try{
	   pdao.save(p);
	   return new ResponseEntity<Person>(p,HttpStatus.OK);
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   return new ResponseEntity<Person>(p,HttpStatus.INTERNAL_SERVER_ERROR);   
	   }
   } 

@RequestMapping(value="/people/{sno}")
public ResponseEntity<Person> getPerson(@PathVariable("sno") int sno)
{
   Person p=pdao.findPersonById(sno);
   if(p!=null)
   return new ResponseEntity<Person>(p,HttpStatus.OK);	
   else
   return new ResponseEntity<Person>(p,HttpStatus.NO_CONTENT);	
}
}



