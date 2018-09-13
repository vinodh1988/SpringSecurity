package com.inheritance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Player {
	@Id
	private int shirtno;
	@Column
	private String name;
	public int getShirtno() {
		return shirtno;
	}
	public void setShirtno(int shirtno) {
		this.shirtno = shirtno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
