package com.inheritance.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="odiplayer")
@AttributeOverrides({
	@AttributeOverride(name="shirtno", column=@Column(name="shirtno")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class OdiPlayer extends Player{

	@Column
	private int oruns;
	@Column
	private int ofours;
	@Column
	private int osixes;
	public int getOruns() {
		return oruns;
	}
	public void setOruns(int oruns) {
		this.oruns = oruns;
	}
	public int getOfours() {
		return ofours;
	}
	public void setOfours(int ofours) {
		this.ofours = ofours;
	}
	public int getOsixes() {
		return osixes;
	}
	public void setOsixes(int osixes) {
		this.osixes = osixes;
	}
	
	
}
