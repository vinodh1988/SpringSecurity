package com.inheritance.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="pg")
public class PGStudent extends Student{
@Column
	  private double ugscore;
@Column
	  private String  course;
	public PGStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PGStudent(int sno, String name,double ugscore,String course) {
		super(sno, name);
		this.ugscore=ugscore;
		this.course=course;
		// TODO Auto-generated constructor stub
	}
	public double getUgscore() {
		return ugscore;
	}
	public void setUgscore(double ugscore) {
		this.ugscore = ugscore;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	  
	  
}
