package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.LoginDynamicsPage;


import net.thucydides.core.annotations.Step;

public class LoginDynamicsSteps {

	LoginDynamicsPage loginDynamicsPage;
	
	@Step
	public void login_dynamics(String strUsuario, String strPass) {
		loginDynamicsPage.open();
		loginDynamicsPage.inputUsuario(strUsuario);
		loginDynamicsPage.btnsiguiente();
		loginDynamicsPage.inputPass(strPass);
		loginDynamicsPage.btnIniciar();
		loginDynamicsPage.chkActivo();
		loginDynamicsPage.btnContinuar();
	}
	
	
		
}