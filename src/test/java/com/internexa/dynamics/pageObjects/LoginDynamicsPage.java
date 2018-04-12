package com.internexa.dynamics.pageObjects;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://crmitxprb.crm2.dynamics.com/main.aspx#593850187")
public class LoginDynamicsPage extends PageObject{
	String lblInicioSecion = "//div[@id='loginHeader']";
	String btnSiguientePass= "idSIButton9";
	String btlCuentaProfEdu="aadTile";
	String lblPassOtros="//*[@id='passwordInput']";
	String btnSiguienteIngreso="//*[@id='submitButton']";
	String btnCerrarMensaje="//*[@id='butBegin']";
	String btnActivo= "KmsiCheckboxField";
	String imgUsuarioActivo="//*[@id='navTabButtonChangeProfileImageLink']/img";
		
	public void inputUsuario(String strUsuario) {

		if(findBy(lblInicioSecion).isCurrentlyVisible())
			{
				find(By.name("loginfmt")).sendKeys(strUsuario);
				Serenity.takeScreenshot();
			}
	
	}
	
	public void btnsiguiente() {
		if(find(By.id(btnSiguientePass)).isCurrentlyVisible()){	
			find(By.id("idSIButton9")).waitUntilClickable();
			find(By.id("idSIButton9")).click();
		}
	}
	//Para cuentas que no son de administrador ingresar por esta opción 
	public void btnCuentaProfesionaloEducativa () {
		if(find(By.id(btlCuentaProfEdu)).isCurrentlyVisible()) {
			find(By.id("aadTile")).waitUntilClickable();
			find(By.id("aadTile")).click();
		}
		
		
	}
	public void inputPass(String strPass) {
		
		
		if(findBy(lblPassOtros).isCurrentlyVisible()) {
			find(By.xpath(lblPassOtros)).sendKeys(strPass);
			waitFor(2).seconds();
			Serenity.takeScreenshot();	
		}
		
		else
		{
			find(By.name("passwd")).sendKeys(strPass);
			waitFor(2).seconds();
			Serenity.takeScreenshot();
		}
	}

	public void btnIniciar() {
		if(findBy(lblPassOtros).isCurrentlyVisible()) {
			find(By.xpath(btnSiguienteIngreso)).waitUntilClickable();
			find(By.xpath(btnSiguienteIngreso)).click();
		}
		else
		{	
			find(By.id("idSIButton9")).waitUntilClickable();
			find(By.id("idSIButton9")).click();
		}
	}
	
	public void btnMantenerSecion() {
	
		if(find(By.id(btnSiguientePass)).isCurrentlyVisible()){
			find(By.id("idSIButton9")).waitUntilClickable();
			find(By.id("idSIButton9")).click();
		}
	
	}
	
	//id="butBegin"
	/*public void btnMsjeCorreo() {

		if(findBy("//*[@id='InlineDialog']").isCurrentlyVisible()){
			getDriver().switchTo().frame("InlineDialog_Iframe");
			
			find(By.xpath(btnCerrarMensaje)).click();
		}
	
	}
	public void chkActivo() {
		if(find(By.id(btnActivo)).isCurrentlyVisible()){
			find(By.id("KmsiCheckboxField")).waitUntilClickable();
			find(By.id("KmsiCheckboxField")).click();	
		}
	}
	
	public void btnContinuar() {
		if(find(By.id(btnSiguientePass)).isCurrentlyVisible()){
			find(By.id("idSIButton9")).waitUntilClickable();
			find(By.id("idSIButton9")).click();	
		}
	}*/



}