package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.BuscarProductoPage;
import com.internexa.dynamics.pageObjects.FactibilidadPage;
import com.internexa.dynamics.pageObjects.Producto40LASTMILENACIONALEditarPage;
import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;

import net.thucydides.core.annotations.Step;


public class FactibilidadSteps  {
	FactibilidadPage factibilidadPage;
	BuscarProductoPage buscarProductoPage;
	Producto40LASTMILENACIONALEditarPage producto40LASTMILENACIONALEditarPage;
	GuardarCerrarToolBox guardarCerrarToolBox;
	
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
	public void enviarSolitudFactibilidad300(String Dato01, String Dato02) {
		
		factibilidadPage.EnviarFactibilidad();
		factibilidadPage.verificarAntesFactibilidad();
		buscarProductoPage.seleccionProdFact(Dato01,Dato02);
		 guardarCerrarToolBox.btnGuardarCerrar();
		//factibilidadPage.ProductoEvaluación();
		factibilidadPage.SolicitarFactibilidad();
	}
	public void buscarUltimoCorreo() {
		
		factibilidadPage.buscarCorreoAprobar();
	}
	public void evaluacionAprFactibilidad(String Dato01, String Dato02) {
		
		factibilidadPage.productoEvaluacion();
		buscarProductoPage.seleccionProdFact(Dato01,Dato02);
		factibilidadPage.cambioEstadoFactibilidad();
		
	}
	
	
	
	
}
