package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.Producto40LASTMILENACIONALEditarPage;

import net.thucydides.core.annotations.Step;

public class ProductoEditarSteps {
	Producto40LASTMILENACIONALEditarPage producto40LASTMILENACIONALEditarPage;
	
	@Step
	public void editar_producto_oportunidad(String propiedadCapacidad, String propiedadCiudadA, String propiedadCiudadB, String propiedadDireccion) {
		producto40LASTMILENACIONALEditarPage.encontrarOportunidad(propiedadCapacidad, propiedadCiudadA,  propiedadCiudadB, propiedadDireccion,"");
	}
}
