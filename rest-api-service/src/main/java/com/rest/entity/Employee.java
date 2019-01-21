package com.rest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 	int eno;
 @Column
    String ename;
 @Column
   String designation;

 
 
 
 @ManyToOne(fetch=FetchType.LAZY)
 @JoinColumn(name="dno",nullable=false)
 Department department;
 
 @OneToOne(mappedBy="employee",cascade=CascadeType.ALL)
 Contact contact;
 
 
 

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(String ename, String designation) {
	super();
	
	this.ename = ename;
	this.designation = designation;
}



public Contact getContact() {
	return contact;
}

public void setContact(Contact contact) {
	this.contact = contact;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public int getEno() {
	return eno;
}
public void setEno(int eno) {
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
 
 
}
