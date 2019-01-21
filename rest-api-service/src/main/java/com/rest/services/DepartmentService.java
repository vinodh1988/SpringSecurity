package com.rest.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.DepartmentDAO;
import com.rest.jsonentities.Contact;
import com.rest.jsonentities.Department;
import com.rest.jsonentities.Employee;

@Service
public class DepartmentService {

	@Autowired 
	DepartmentDAO ddao;
	
	public List<Department> getDepartments(){
		List<com.rest.entity.Department> l= (List<com.rest.entity.Department>)ddao.findAll();
		List<Department> list=new ArrayList<Department> ();
		for(com.rest.entity.Department x:l){
			Department d=new Department(x.getDno(),x.getDname());
			System.out.println("##########"+x.getDno()+"###################");
			Set<Employee> eset=new HashSet<Employee>();
			for(com.rest.entity.Employee e:x.getEset()){
				Employee temp=new Employee(e.getEno(),e.getEname(),e.getDesignation(),e.getDepartment().getDno());
			    com.rest.entity.Contact c=e.getContact();
			    System.out.println("############"+null+"#######################");
			    if(c!=null)
			    {  
			    Contact ctemp=new Contact(c.getEno(),c.getStreet(),c.getCity(),c.getZip());
			    temp.setContact(ctemp);
			    }
			    else
			    temp.setContact(null);
                eset.add(temp);
			}
		 d.setElist(eset);	
		 list.add(d);
		}
		return list;
	}
	
	
}
