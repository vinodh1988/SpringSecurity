package com.rest.jsonentities;

import java.util.List;
import java.util.Set;

public class Department {
  Integer dno;
  String name;
  Set<Employee> elist;
  
  
public Department(Integer dno, String name) {
	super();
	this.dno = dno;
	this.name = name;
}
public Set<Employee> getElist() {
	return elist;
}
public void setElist(Set<Employee> elist) {
	this.elist = elist;
}
public Integer getDno() {
	return dno;
}
public void setDno(Integer dno) {
	this.dno = dno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
  
}
