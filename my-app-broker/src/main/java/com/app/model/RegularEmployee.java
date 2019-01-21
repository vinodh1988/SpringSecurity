package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regularemp")
@PrimaryKeyJoinColumn(name="eid")
public class RegularEmployee extends Employee {
   @Column
	private String desig;

public String getDesig() {
	return desig;
}

public void setDesig(String desig) {
	this.desig = desig;
}
   
   
}
