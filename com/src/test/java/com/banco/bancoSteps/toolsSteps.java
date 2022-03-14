package com.banco.bancoSteps;

import com.banco.bancoPO.toolsPO;

import net.thucydides.core.annotations.Step;

public class toolsSteps {
	
	toolsPO toolpg;
	
	@Step
	public void ingresarAlNavegador() {
		
		toolpg.open();
	}
	@Step
	public void txtFirtName(String primerN) {
		
		toolpg.txtFirtName(primerN);
	}
//	@Step
//	public void ingresarAlNavegador() {
//		
//		toolpg.open();
//	}
//	@Step
//	public void ingresarAlNavegador() {
//		
//		toolpg.open();
//	}
	

}
