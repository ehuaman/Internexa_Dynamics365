package com.internexa.dynamics.steps;

//import com.internexa.dynamics.pageObjects.Producto40LASTMILENACIONALEditarPage;

import net.thucydides.core.annotations.Step;
import com.internexa.dynamics.pageObjects.BuscarProductoPage;

public class ProductoEditarSteps {
	BuscarProductoPage buscarProductoPage;
	
	@Step
	public void editar_producto_oportunidad(String Dato1, String Dato2, String Dato3, String Dato4) {
		
		buscarProductoPage.seleccionarProducto(Dato1, Dato2, Dato3, Dato4,"");
		
	}
	public void editar_producto_300IaaS(String Dato1, String Dato2, String Dato3, String Dato4, String Dato5) {
		
		buscarProductoPage.seleccionarProducto(Dato1, Dato2, Dato3, Dato4, Dato5);
		
	}
}
