package com.rest.jsonentities;

public class Contact {
  Integer eno;
  String city;
  String street;
  Integer zip;
  
public Contact(Integer eno, String city, String street, Integer zip) {
	super();
	this.eno = eno;
	this.city = city;
	this.street = street;
	this.zip = zip;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public Integer getZip() {
	return zip;
}
public void setZip(Integer zip) {
	this.zip = zip;
}
  
}
