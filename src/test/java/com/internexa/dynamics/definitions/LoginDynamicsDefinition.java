package com.internexa.dynamics.definitions;


import com.internexa.dynamics.steps.FactibilidadSteps;
import com.internexa.dynamics.steps.LoginDynamicsSteps;
import com.internexa.dynamics.steps.MenuOportunidadSteps;
import com.internexa.dynamics.steps.OportunidadesAbiertasSteps;
import com.internexa.dynamics.steps.ProductoEditarSteps;
import com.internexa.dynamics.steps.NuevoOportunidadSteps;
import com.internexa.dynamics.steps.OportunidadSteps;

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

@Then("^se detallan datos de factibilidad$")
	public void se_detallan_datos_de_factibilidad() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	factibilidadSteps.llenarIPS("Sebastian Orozco");
	factibilidadSteps.llenarObservacion("Pruebas factibilidad 12233");
}

/*@When("^selecciono oportunidad que requiere aprobación$")
public void selecciono_oportunidad_que_requiere_aprobación() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Se aprueba Factibilidad$")
public void se_aprueba_Factibilidad() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
	

	}	*/
	
}
