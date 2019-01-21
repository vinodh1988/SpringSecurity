package com.rest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="departments")
@Entity
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
  int dno;
@Column
  String dname;

@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
Set<Employee> eset;


public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department( String dname) {
	super();
	this.dname = dname;
}



public Set<Employee> getEset() {
	return eset;
}

public void setEset(Set<Employee> eset) {
	this.eset = eset;
}

public int getDno() {
	return dno;
}
public void setDno(int dno) {
	this.dno = dno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}


  
  
}
