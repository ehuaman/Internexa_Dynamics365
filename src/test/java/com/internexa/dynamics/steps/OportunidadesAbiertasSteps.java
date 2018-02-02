package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.OportunidadesAbiertasPage;

import net.thucydides.core.annotations.Step;

public class OportunidadesAbiertasSteps {

	OportunidadesAbiertasPage oportunidadesAbiertasPage;
	
	@Step
	public void nuevaOportunidad() {
		oportunidadesAbiertasPage.nuevaOportunidad();
	}
}
