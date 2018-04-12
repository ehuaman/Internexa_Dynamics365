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
	
	@Given("^me logueo al aplicativo Dynamics como ([^\"]*) con pass ([^\"]*)$")
	public void me_logueo_al_aplicativo_Dynamics_como_con_pass(String strUsuario, String strPass) {
	    // Write code here that turns the phrase above into concrete actions
		loginDynamicsSteps.login_dynamics(strUsuario, strPass);
	}
	

	@Given("^elijo Ventas luego Oportunidades$")
	public void elijo_Ventas_luego_Oportunidades() {
	    // Write code here that turns the phrase above into concrete actions
		menuOportunidadSteps.ingresarCrearOportunidad();
	}

	@When("^selecciono NUEVO$")
	public void selecciono_NUEVO()  {
	    // Write code here that turns the phrase above into concrete actions
		oportunidadesAbiertasSteps.nuevaOportunidad();
	}
	
	@Then("^se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta ([^\"]*) el nombre ([^\"]*) el tipo de venta ([^\"]*) fecha estimada de venta ([^\"]*) probabilidad de exito ([^\"]*) fecha estimada de ingreso ([^\"]*) tipo de oportunidad ([^\"]*) contrato a meses ([^\"]*) y se guarda la oportunidad$")
	public void se_presenta_la_pantalla_de_Nuevo_Oportunidad(String cuenta, String nombre, String tipoVenta, String fechaEstVenta, String probabilidadExito, String fechaEstIngreso, String tipoOport, String contratoMeses ) throws Throwable {
		nuevoOportunidadSteps.crearNuevaOportunidad(cuenta, nombre, tipoVenta, fechaEstVenta, probabilidadExito, fechaEstIngreso, tipoOport, contratoMeses);
		//oportunidadSteps.oportunidad_producto();
	}
	 
	@Then("^se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto ([^\"]*)$")
	public void se_ingresa_a_la_oportunidad_y_se_elige_la_opcion_y_se_ingresa_el_producto(String productoRegistrar) throws Throwable {
		oportunidadSteps.oportunidad_producto(productoRegistrar);
	}	
	
	@Then("^se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad ([^\"]*) ciudad a ([^\"]*) ciudad b ([^\"]*) dirección ([^\"]*)$")
	public void se_ingresa_a_la_pagina_de_propiedades_del_producto_se_elige_las_instancias_requeridas_y_que_posean_campo_de_valor_propiedad_vacio_se_valida_el_tipo_de_dato_y_se_ingresa_para_agregar_valor_propiedad_capacidad_ciudad_a_ciudad_b_dirección(String propiedadCapacidad, String propiedadCiudadA, String propiedadCiudadB, String propiedadDireccion) {
    // Write code here that turns the phrase above into concrete actions
    productoEditarSteps.editar_producto_oportunidad (propiedadCapacidad, propiedadCiudadA,  propiedadCiudadB, propiedadDireccion);
	}
	///////////////////////////////////////////////
	@Then("^se ingresa la factibilidad$")
	public void se_ingresa_la_factibilidad() {
    // Write code here that turns the phrase above into concrete actions
	factibilidadSteps.ingresaFactibilidad();
	}
	
	@Then("^se detallan datos de factibilidad IPS ([^\"]*) Observacion ([^\"]*)$")
	public void se_detallan_datos_de_factibilidad_IPS_Observacion(String strIPS, String strObservacion) {
    // Write code here that turns the phrase above into concrete actions
	factibilidadSteps.llenarIPS(strIPS);
	factibilidadSteps.llenarObservacion(strObservacion);
	}

	@Then("^se envia solicitud factibilidad$")
	public void se_envia_solicitud_factibilidad() {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.enviarSolitudFactibilidad();
	}
@Then("^se envia solicitud factibilidad verificar Nombre Aplicativo ([^\"]*) Cuantos Usuarios acceden ([^\"]*)$")
	public void se_envia_solicitud_factibilidad_verificar_Nombre_Aplicativo_Cuantos_Usuarios_acceden(String Dato01, String Dato02) {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.enviarSolitudFactibilidad300(Dato01,Dato02);
	}
	
	@Then("^se cierra sesión de Gerente Cuenta$")
	public void se_cierra_sesión_de_Gerente_Cuenta() {
	    // Write code here that turns the phrase above into concrete actions
		cerrarSesionSteps.cerrarSeccionUsuario();
	}
	
	@Then("^elijo Ventas luego Actividades$")
	public void elijo_Ventas_luego_Actividades() {
	    // Write code here that turns the phrase above into concrete actions
	    menuOportunidadSteps.ingresarActividad();
	}
	
	@Then("^se busca correo de solicitud de factibilidad$")
	public void se_busca_correo_de_solicitud_de_factibilidad() {
	    // Write code here that turns the phrase above into concrete actions
		menuActividadesSteps.ingresarTodosLosMensajes();
	}
	
	@Then("^se seleccion el correo que necesita aprobacion$")
	public void se_seleccion_el_correo_que_necesita_aprobacion() {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.buscarUltimoCorreo();
	}
	
	@Then("^se ingresa y se llenan datos requeridos, Sitio A ([^\"]*) Sitio B ([^\"]*)$")
	public void se_ingresa_y_se_llenan_datos_requeridos_Sitio_A_Sitio_B(String Dato01, String Dato02) {
	    // Write code here that turns the phrase above into concrete actions
		factibilidadSteps.evaluacionAprFactibilidad(Dato01,Dato02);
	}

	@Then("^se ingresa y se llenan datos requeridos, Nombre Aplicativo ([^\"]*) Cuantos Usuarios acceden ([^\"]*)$")
	public void se_ingresa_y_se_llenan_datos_requeridos_Nombre_Aplicativo_Cuantos_Usuarios_acceden(String Dato01, String Dato02) {
    // Write code here that turns the phrase above into concrete actions
    factibilidadSteps.evaluacionAprFactibilidad(Dato01,Dato02);
	}


	@Then("^elijo Ventas luego Factibilidad$")
	public void elijo_Ventas_luego_Factibilidad() {
	    // Write code here that turns the phrase above into concrete actions
		menuOportunidadSteps.ingresarFactibilidad();
	}
	
	@Then("^se busca factibilidad estado Finalizada$")
	public void se_busca_factibilidad_estado_Finalizada() {
	    // Write code here that turns the phrase above into concrete actions
		ganarPerderOfertaSteps.buscarFactibilidad();
	}
	
	@Then("^generar Oferta$")
	public void generar_Oferta() {
	    // Write code here that turns the phrase above into concrete actions
		ganarPerderOfertaSteps.generarOferta();
	}
	
	@Then("^Ingresar datos de IPS ([^\"]*) y Contacto Tecnico ([^\"]*)$")
	public void ingresar_datos_de_IPS_y_Contacto_Tecnico(String strIPS, String strTecnico) {
	    // Write code here that turns the phrase above into concrete actions
		ganarPerderOfertaSteps.IngresarIPSyTecnico(strIPS,strTecnico);
	}
	
	@Then("^se ingresa ganarPerder ([^\"]*) con Motivo:([^\"]*) y Descripcion: Ofera ([^\"]*)$")
	public void se_ingresa_ganarPerder_Ganar_con_Motivo_y_Descripcion_Ofera(String strGanarPerder, String strMotivo, String strDescrip) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  // ganarPerderOfertaSteps.seleccionarGanarPerder( strGanarPerder,  strMotivo,  strDescrip);
	}
	
	@Then("^se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Sitio A ([^\"]*) Sitio B ([^\"]*) ingresa datos de IPS ([^\"]*) y Contacto Tecnico ([^\"]*)$" )
	public void se_ingresa_a_crear_la_oferta_Express_se_ingresa_y_se_llenan_datos_requeridos_Sitio_A_Sitio_B_ingresa_datos_de_IPS_y_Contacto_Tecnico_ganar_con_Motivo_y_Descripcion(String strSitioA, String strSitioB, String strIPS, String strContactoTec) {
    // Write code here that turns the phrase above into concrete actions
    ganarPerderOfertaSteps.ganarPerderExpress( strSitioA, strSitioB, strIPS,  strContactoTec);
	}
	
@Then("^se ingresa informacion de contrato: Modo de Venta ([^\"]*), Modo de facturación: ([^\"]*),Cuenta Facturacion: ([^\"]*)$")
	public void se_ingresa_informacion_de_contrato_Modo_de_Venta_Modo_de_facturación_Cuenta_Facturacion(String strModoVenta, String strModFactura, String strCtaFacturacion) {
    // Write code here that turns the phrase above into concrete actions
	ganarPerderOfertaSteps.llenarContrato(strModoVenta, strModFactura, strCtaFacturacion);
	}

@Then("^se ingresa ganar o perder ([^\"]*) con Motivo:([^\"]*) y Descripcion: ([^\"]*), Si se gana Nombre Documento a cargar: ([^\"]*)$")

public void se_ingresa_ganar_o_perder_con_Motivo_y_Descripcion_Si_se_gana_Nombre_Documento_a_cargar(String strGanarPerder, String strMotivo, String strDescrip, String strNomDocumento)  {
    // Write code here that turns the phrase above into concrete actions
	ganarPerderOfertaSteps.eligeGanarPerder(strGanarPerder, strMotivo, strDescrip, strNomDocumento);
}
	
	@Then("^se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad Ciudad principal ([^\"]*) capacidad ([^\"]*) MemoriaRAM ([^\"]*) Categoría ([^\"]*) Observación ([^\"]*) Tipo de nube ([^\"]*)$")
	public void se_ingresa_a_la_pagina_de_propiedades_del_producto_se_elige_las_instancias_requeridas_y_que_posean_campo_de_valor_propiedad_vacio_se_valida_el_tipo_de_dato_y_se_ingresa_para_agregar_valor_propiedad_Ciudad_principal_capacidad_MemoriaRAM_Categoría_Observación_Tipo_de_nube(String strCiudadPrincipal, String strCapacidad, String strMemoriaRAM, String strCategoria, String strObstervacion, String strTipoNube) {
    // Write code here that turns the phrase above into concrete actions
	productoEditarSteps.editar_producto_300IaaS(strCiudadPrincipal, strCapacidad,  strMemoriaRAM, strCategoria, strObstervacion, strTipoNube);
		
}	
	
	@Then("^se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Nombre Aplicativo ([^\"]*) Cuantos Usuarios acceden ([^\"]*) ingresa datos de IPS ([^\"]*) y Contacto Tecnico ([^\"]*)$")
	public void se_ingresa_a_crear_la_oferta_Express_se_ingresa_y_se_llenan_datos_requeridos_Nombre_Aplicativo_Cuantos_Usuarios_acceden_ingresa_datos_de_IPS_y_Contacto_Tecnico(String strNomAplicativo, String strNumUsuarios, String strIPS, String strContactoTec) {
	    // Write code here that turns the phrase above into concrete actions
		ganarPerderOfertaSteps.ganarPerderExpress300(strNomAplicativo, strNumUsuarios, strIPS, strContactoTec);
	}
	
	

	
}
