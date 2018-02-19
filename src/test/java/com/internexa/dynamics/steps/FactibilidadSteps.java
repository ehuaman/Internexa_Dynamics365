package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.FactibilidadPage;

import net.thucydides.core.annotations.Step;


public class FactibilidadSteps  {
	FactibilidadPage factibilidadPage;
	
	@Step
	public void ingresaFactibilidad() {
		factibilidadPage.AgregarFactibilidad();
	}
	
	public void llenarIPS(String strNombreIPS) {
		factibilidadPage.SeleccionarIPS(strNombreIPS);
	}
	public void llenarObservacion(String strLlenaObservacion) {
		factibilidadPage.LlenarObservacionSolicitud(strLlenaObservacion);
	}
	
}
