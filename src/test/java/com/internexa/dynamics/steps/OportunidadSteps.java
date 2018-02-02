package com.internexa.dynamics.steps;
import com.internexa.dynamics.pageObjects.OportunidadPage;
import net.thucydides.core.annotations.Step;

public class OportunidadSteps {
	OportunidadPage oportunidadPage;
	
		
		@Step
		public void oportunidad_producto(String productoRegistrar) {
			oportunidadPage.agregarProducto();
			oportunidadPage.registrarProducto(productoRegistrar);
			oportunidadPage.verificarEstadoProducto();
		}
}