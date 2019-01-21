package com.app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value="ug")
public class UGStudent extends Student{
	@Column
    private double pucscore;
	@Column
    private String branch;
	
	public UGStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UGStudent(int sno, String name,double pucscore,String branch) {
		super(sno, name);
		this.pucscore=sno;
		this.branch=branch;
		// TODO Auto-generated constructor stub
	}
	public double getPucscore() {
		return pucscore;
	}
	public void setPucscore(double pucscore) {
		this.pucscore = pucscore;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
    
	
    
    
}
