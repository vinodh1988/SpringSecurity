package com.app.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="testplayer")
@AttributeOverrides({
	@AttributeOverride(name="shirtno", column=@Column(name="shirtno")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class TestPlayer extends Player{
	@Column
	private int truns;
	@Column
	private int tsixes;
	@Column
	private int tfours;
	public int getTruns() {
		return truns;
	}
	public void setTruns(int truns) {
		this.truns = truns;
	}
	public int getTsixes() {
		return tsixes;
	}
	public void setTsixes(int tsixes) {
		this.tsixes = tsixes;
	}
	public int getTfours() {
		return tfours;
	}
	public void setTfours(int tfours) {
		this.tfours = tfours;
	}
	
	
	
	
}
