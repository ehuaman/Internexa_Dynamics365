package com.internexa.dynamics.pageObjects;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://crmitxprb.crm2.dynamics.com/main.aspx#593850187")
public class LoginDynamicsPage extends PageObject{
	
		
	public void inputUsuario(String strUsuario) {
		find(By.name("loginfmt")).sendKeys(strUsuario);
	}
	
	public void btnsiguiente() {
		find(By.id("idSIButton9")).waitUntilClickable();
		find(By.id("idSIButton9")).click();
	}
	
	public void inputPass(String strPass) {
		find(By.name("passwd")).sendKeys(strPass);
		waitFor(3).seconds();
	}

	public void btnIniciar() {
		find(By.id("idSIButton9")).waitUntilClickable();
		find(By.id("idSIButton9")).click();			
	}
	
	public void chkActivo() {
		find(By.id("KmsiCheckboxField")).waitUntilClickable();
		find(By.id("KmsiCheckboxField")).click();		
	}
	
	public void btnContinuar() {
		find(By.id("idSIButton9")).waitUntilClickable();
		find(By.id("idSIButton9")).click();			
	}

}