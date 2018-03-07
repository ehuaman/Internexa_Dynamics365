package com.internexa.dynamics.definitions;


import com.internexa.dynamics.steps.FactibilidadSteps;
import com.internexa.dynamics.steps.GanarPerderOfertaSteps;
import com.internexa.dynamics.steps.LoginDynamicsSteps;
import com.internexa.dynamics.steps.MenuActividadesSteps;
import com.internexa.dynamics.steps.MenuOportunidadSteps;
import com.internexa.dynamics.steps.OportunidadesAbiertasSteps;
import com.internexa.dynamics.steps.ProductoEditarSteps;
import com.internexa.dynamics.steps.NuevoOportunidadSteps;
import com.internexa.dynamics.steps.OportunidadSteps;
import com.internexa.dynamics.steps.CerrarSesionSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDynamicsDefinition {
	
	
	@Steps
	LoginDynamicsSteps loginDynamicsSteps;
	
	@Steps
	MenuOportunidadSteps menuOportunidadSteps;
	
	@Steps
	OportunidadesAbiertasSteps oportunidadesAbiertasSteps;
	
	@Steps
	NuevoOportunidadSteps nuevoOportunidadSteps;
	
	@Steps
	OportunidadSteps oportunidadSteps;
	
	@Steps
	ProductoEditarSteps productoEditarSteps;
	
	@Steps
	FactibilidadSteps factibilidadSteps;
	
	@Steps
	CerrarSesionSteps cerrarSesionSteps;
	
	@Steps 
	MenuActividadesSteps menuActividadesSteps;
	
	@Steps
	GanarPerderOfertaSteps ganarPerderOfertaSteps;
	
	@Given("^me logueo al aplicativo Dynamics como \"([^\"]*)\" con pass \"([^\"]*)\"$")
	public void me_logueo_al_aplicativo_Dynamics_como_con_pass(String strUsuario, String strPass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginDynamicsSteps.login_dynamics(strUsuario, strPass);
	}

	@Given("^elijo Ventas luego Oportunidades$")
	public void elijo_Ventas_luego_Oportunidades() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		menuOportunidadSteps.ingresarCrearOportunidad();
	}

	@When("^selecciono NUEVO$")
	public void selecciono_NUEVO() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		oportunidadesAbiertasSteps.nuevaOportunidad();
	}
	
	@Then("^se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta \\\"([^\\\"]*)\\\" el nombre \\\"([^\\\"]*)\\\" el tipo de venta \\\"([^\\\"]*)\\\" fecha estimada de venta \\\"([^\\\"]*)\\\" probabilidad de exito \\\"([^\\\"]*)\\\" fecha estimada de ingreso \\\"([^\\\"]*)\\\" tipo de oportunidad \\\"([^\\\"]*)\\\" contrato a meses \\\"([^\\\"]*)\\\" y se guarda la oportunidad$")
	public void se_presenta_la_pantalla_de_Nuevo_Oportunidad(String cuenta, String nombre, String tipoVenta, String fechaEstVenta, String probabilidadExito, String fechaEstIngreso, String tipoOport, String contratoMeses ) throws Throwable {
		nuevoOportunidadSteps.crearNuevaOportunidad(cuenta, nombre, tipoVenta, fechaEstVenta, probabilidadExito, fechaEstIngreso, tipoOport, contratoMeses);
		//oportunidadSteps.oportunidad_producto();
	}
	 
	@Then("^se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto \\\"([^\\\"]*)\\\"$")
	public void se_ingresa_a_la_oportunidad_y_se_elige_la_opcion_y_se_ingresa_el_producto(String productoRegistrar) throws Throwable {
		oportunidadSteps.oportunidad_producto(productoRegistrar);
	}	
	
	@Then("^se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad \"([^\"]*)\" ciudad a \"([^\"]*)\" ciudad b \"([^\"]*)\" dirección \"([^\"]*)\"$")
	public void se_ingresa_a_la_pagina_de_propiedades_del_producto_se_elige_las_instancias_requeridas_y_que_posean_campo_de_valor_propiedad_vacio_se_valida_el_tipo_de_dato_y_se_ingresa_para_agregar_valor_propiedad_capacidad_ciudad_a_ciudad_b_dirección(String propiedadCapacidad, String propiedadCiudadA, String propiedadCiudadB, String propiedadDireccion) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    productoEditarSteps.editar_producto_oportunidad (propiedadCapacidad, propiedadCiudadA,  propiedadCiudadB, propiedadDireccion);
	}
	@Then("^se ingresa la factibilidad$")
	public void se_ingresa_la_factibilidad() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	factibilidadSteps.ingresaFactibilidad();
	}
	
//////////////////////////////////////////////////////////////////
@Then("^se detallan datos de factibilidad IPS \"([^\"]*)\" Observacion \"([^\"]*)\"$")
public void se_detallan_datos_de_factibilidad_IPS_Observacion(String strIPS, String strObservacion) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	factibilidadSteps.llenarIPS(strIPS);
	factibilidadSteps.llenarObservacion(strObservacion);
	}
////////////////////////////////////////////////////////////////////
	@Then("^se envia solicitud factibilidad$")
	public void se_envia_solicitud_factibilidad() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.enviarSolitudFactibilidad();
	}
	
	@Then("^se cierra sesión de Gerente Cuenta$")
	public void se_cierra_sesión_de_Gerente_Cuenta() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cerrarSesionSteps.cerrarSeccionUsuario();
	}
	
	@When("^elijo Ventas luego Actividades$")
	public void elijo_Ventas_luego_Actividades() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    menuOportunidadSteps.ingresarActividad();
	}
	
	@Then("^se busca correo de solicitud de factibilidad$")
	public void se_busca_correo_de_solicitud_de_factibilidad() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		menuActividadesSteps.ingresarTodosLosMensajes();
	}
	
	@Then("^se seleccion el correo que necesita aprobacion$")
	public void se_seleccion_el_correo_que_necesita_aprobacion() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.buscarUltimoCorreo();
	}
	
	@Then("^se ingresa y se llenan datos requeridos, Sitio A \"([^\"]*)\"$")
	public void se_ingresa_y_se_llenan_datos_requeridos_Sitio_A(String Dato01) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.evaluacionAprFactibilidad(Dato01);
	}

@When("^elijo Ventas luego Factibilidad$")
public void elijo_Ventas_luego_Factibilidad() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	menuOportunidadSteps.ingresarFactibilidad();
}

@Then("^se busca factibilidad estado Finalizada$")
public void se_busca_factibilidad_estado_Finalizada() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ganarPerderOfertaSteps.buscarFactibilidad();
}

@Then("^generar Oferta$")
public void generar_Oferta() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ganarPerderOfertaSteps.generarOferta();
}

@Then("^Ingresar datos de IPS \"([^\"]*)\" y Contacto Tecnico \"([^\"]*)\"$")
public void ingresar_datos_de_IPS_y_Contacto_Tecnico(String strIPS, String strTecnico) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ganarPerderOfertaSteps.IngresarIPSyTecnico(strIPS,strTecnico);
}

@Then("^se ingresa \"([^\"]*)\" con Motivo:\"([^\"]*)\" y Descripcion: \"([^\"]*)\"$")
public void se_ingresa_con_Motivo_y_Descripcion(String strGanarPerder, String strMotivo, String strDescrip) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ganarPerderOfertaSteps.seleccionarGanarPerder( strGanarPerder,  strMotivo,  strDescrip);
}



	
}
