package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.LoginDynamicsPage;


import net.thucydides.core.annotations.Step;

public class LoginDynamicsSteps {

	LoginDynamicsPage loginDynamicsPage;
	
	@Step
	public void login_dynamics(String strUsuario, String strPass) {
		//Paso Comun Admin-otrosUsarios
		loginDynamicsPage.open();
		loginDynamicsPage.inputUsuario(strUsuario);
		//Solo admin
		loginDynamicsPage.btnsiguiente();
		//Otros Usuarios
		loginDynamicsPage.btnCuentaProfesionaloEducativa();
		//
		loginDynamicsPage.inputPass(strPass);
		loginDynamicsPage.btnIniciar();
		loginDynamicsPage.btnMantenerSecion();
		loginDynamicsPage.btnMsjeCorreo();
		loginDynamicsPage.chkActivo();
		loginDynamicsPage.btnContinuar();
	}
	
	
		
}