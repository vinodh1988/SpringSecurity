package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="jobs")
public class Jobs {
@Id
	String job_id;
@Column
	String job_title;
@Column
	int min_salary;
@Column
	int max_salary;

public String getJob_id() {
	return job_id;
}
public void setJob_id(String job_id) {
	this.job_id = job_id;
}
public String getJob_title() {
	return job_title;
}
public void setJob_title(String job_title) {
	this.job_title = job_title;
}
public int getMin_salary() {
	return min_salary;
}
public void setMin_salary(int min_salary) {
	this.min_salary = min_salary;
}
public int getMax_salary() {
	return max_salary;
}
public void setMax_salary(int max_salary) {
	this.max_salary = max_salary;
}


	
	
}
