package com.internexa.dynamics.toolBox;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class GuardarCerrarToolBox extends PageObject {
	Utilidad utilidad;
	public void btnGuardarCerrar() {
		//getDriver().findElement(By.xpath("//SPAN[@tabindex='-1'][text()=' Guardar y cerrar ']")).click();
		
		getDriver().findElement(By.xpath("//*[@id='crmRibbonManager']/div/ul/li[2]")).click();
		//getDriver().findElement(By.xpath("//*[@id='quote|NoRelationship|Form|Mscrm.Form.quote.SaveAndClose']")).click();
		utilidad.esperaDesaparecer();
	}
	public void btnGuardar() {
		getDriver().findElement(By.xpath("//*[@id='crmRibbonManager']/div/ul/li[1]")).click();
		utilidad.esperaDesaparecer();
	}
	
}

