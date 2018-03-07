package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.NuevoOportunidadPage;
import com.internexa.dynamics.pageObjects.OportunidadPage;

import net.thucydides.core.annotations.Step;
import com.internexa.dynamics.HtmlTable;

public class NuevoOportunidadSteps {
	NuevoOportunidadPage nuevoOportunidadPage;
	OportunidadPage oportunidadPage;
	
	@Step
    public void crearNuevaOportunidad(String cuenta, String nombre, String tipoVenta, String fechaEstimadaVenta, String probabilidadExito, String fechaEstimadaIngreso, String tipoOportunidad, String contratoMeses) {
		nuevoOportunidadPage.inputCuenta(cuenta);
		nuevoOportunidadPage.inputNombre(nombre); 
		nuevoOportunidadPage.listTipoVenta(tipoVenta);
		nuevoOportunidadPage.inputFechaEstimadaVenta(fechaEstimadaVenta);
		nuevoOportunidadPage.listProbabilidadExito(probabilidadExito);
		nuevoOportunidadPage.inputFechaEstimadaIngreso(fechaEstimadaIngreso);
		nuevoOportunidadPage.listTipoOportunidad(tipoOportunidad);
		nuevoOportunidadPage.inputContratoMeses(contratoMeses);
		String idOport =nuevoOportunidadPage.btnGuardar();
		//nuevoOportunidadPage.btnGuardarYCerrar();
		//nuevoOportunidadPage.encontrarOportunidad(idOport);
	
    }

}
