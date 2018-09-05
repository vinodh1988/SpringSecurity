package com.relations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
@Id
 private Integer eno;
@Column 
 private String email;
@Column
 private String mobile;

@OneToOne
@PrimaryKeyJoinColumn
 Employee employee;
 
 
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}

public Contact(Integer eno, String email, String mobile, Employee employee) {
	super();
	this.eno = eno;
	this.email = email;
	this.mobile = mobile;
	this.employee = employee;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

public Integer getEno() {
	return eno;
}

public void setEno(Integer eno) {
	this.eno = eno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
 
 
}
