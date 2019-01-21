package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class MobileFactory implements Factory {
	Design ui;
	
	Design circuit;
	
	Produce produce;
	
	@Autowired	
	QualityCheck mquality;
	
	public Design getUi() {
		return ui;
	}


	public void setUi(Design ui) {
		this.ui = ui;
	}


	public Design getCircuit() {
		return circuit;
	}


	public void setCircuit(Design circuit) {
		this.circuit = circuit;
	}


	public Produce getProduce() {
		return produce;
	}


	public void setProduce(Produce produce) {
		this.produce = produce;
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("XYZ Mobile Factory");
		ui.designProduct();
		circuit.designProduct();
		produce.produce();
		mquality.checkQuality();

	}

}
