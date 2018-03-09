package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.BuscarProductoPage;
import com.internexa.dynamics.pageObjects.FactibilidadPage;
import com.internexa.dynamics.pageObjects.Producto40LASTMILENACIONALEditarPage;

import net.thucydides.core.annotations.Step;


public class FactibilidadSteps  {
	FactibilidadPage factibilidadPage;
	BuscarProductoPage buscarProductoPage;
	Producto40LASTMILENACIONALEditarPage producto40LASTMILENACIONALEditarPage;
	
	
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
	
	public void enviarSolitudFactibilidad() {
		
		factibilidadPage.EnviarFactibilidad();
		//factibilidadPage.ProductoEvaluación();
		factibilidadPage.SolicitarFactibilidad();
	}
	public void buscarUltimoCorreo() {
		
		factibilidadPage.buscarCorreoAprobar();
	}
	public void evaluacionAprFactibilidad(String Dato01) {
		
		factibilidadPage.productoEvaluacion();
		buscarProductoPage.seleccionProdFact(Dato01);
		//producto40LASTMILENACIONALEditarPage.encontrarOportunidad("", "", "", "", Dato01);
		factibilidadPage.cambioEstadoFactibilidad();
		
	}
	
	
	
	
}
