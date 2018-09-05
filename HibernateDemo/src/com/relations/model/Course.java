package com.relations.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
@Id
  private int course_id;
@Column
  private String name;
 
  
  
  @ManyToMany(cascade=CascadeType.ALL)
  @JoinTable(name="course_trainer",joinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"),inverseJoinColumns=@JoinColumn(name="trainer_id",referencedColumnName="trainer_id"))
  Set<Trainer> trainers;
  
  public Set<Trainer> getTrainers() {
	return trainers;
}
public void setTrainers(Set<Trainer> trainers) {
	this.trainers = trainers;
}
public Course() {
	super();
	
}
public Course(int course_id, String name) {
	super();
	this.course_id = course_id;
	this.name = name;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
