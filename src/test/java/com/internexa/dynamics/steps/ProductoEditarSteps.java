package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.ProductoEditarPage;

import net.thucydides.core.annotations.Step;

public class ProductoEditarSteps {
	ProductoEditarPage productoEditarPage;
	
	@Step
	public void editar_producto_oportunidad() {
		productoEditarPage.encontrarOportunidad();
	}
}
