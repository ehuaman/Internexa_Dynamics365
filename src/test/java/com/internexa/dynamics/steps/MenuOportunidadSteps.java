package com.internexa.dynamics.steps;


import com.internexa.dynamics.pageObjects.MenuOportunidadPage;

import net.thucydides.core.annotations.Step;

public class MenuOportunidadSteps {

	MenuOportunidadPage menuOportunidadPage;
	
	@Step
	public void ingresarCrearOportunidad() {
		menuOportunidadPage.venta();
		menuOportunidadPage.oportunidad();
	}
	
	public void ingresarActividad() {
		menuOportunidadPage.venta();
		menuOportunidadPage.actividades();
	}
	public void ingresarFactibilidad() {
		menuOportunidadPage.venta();
		menuOportunidadPage.factibilidad();
	}
}
