package com.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="contacts")
public class Contact {

	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator
	(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="employee"))
	   
	   int eno;
	@Column
	   String street;
	@Column
	   String city;
	@Column
		int zip;
	@OneToOne
	@PrimaryKeyJoinColumn
	Employee employee;
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(int eno, String street, String city, int zip) {
		super();
		this.eno = eno;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
}
