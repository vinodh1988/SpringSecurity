package com.rest.jsonentities;

public class Employee {
  Integer eno;
  String ename;
  String designation;
  Integer dno;
  
  Contact contact;
  
public Employee(Integer eno, String ename, String designation,Integer dno) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.designation = designation;
	this.dno=dno;
}
public Contact getContact() {
	return contact;
}
public void setContact(Contact contact) {
	this.contact = contact;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Integer getDno() {
	return dno;
}
public void setDno(Integer dno) {
	this.dno = dno;
}
  
  
}
