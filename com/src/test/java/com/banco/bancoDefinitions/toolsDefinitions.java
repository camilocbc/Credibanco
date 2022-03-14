package com.banco.bancoDefinitions;

import com.banco.bancoSteps.toolsSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;

public class toolsDefinitions {

	//@Step
	toolsSteps ToolsSteps;
	
	@Given("Ingresar al Navegador")
	public void ingresarAlNavegador() {
		ToolsSteps.ingresarAlNavegador();
	}
	
	
}
