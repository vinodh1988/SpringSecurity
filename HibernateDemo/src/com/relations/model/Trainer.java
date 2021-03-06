package com.relations.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer{
@Id
  private int trainer_id;
@Column
  private String name;

@ManyToMany(mappedBy="trainers",cascade=CascadeType.ALL)
  Set<Course> courses;
  
  
public Set<Course> getCourses() {
	return courses;
}


public void setCourses(Set<Course> courses) {
	this.courses = courses;
}


public int getTrainer_id() {
	return trainer_id;
}


public void setTrainer_id(int trainer_id) {
	this.trainer_id = trainer_id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}


public Trainer(int trainer_id, String name) {
	super();
	this.trainer_id = trainer_id;
	this.name = name;
}


  
}
