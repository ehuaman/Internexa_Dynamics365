package com.internexa.dynamics.pageObjects;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;


public class LlenarPropiedades extends PageObject {

	public void Capacidad(String datoPropiedad) {
	    try {        
	    	//*[@id="itx_valorciudadid"]/div[1]
	    	find(By.xpath("//*[@id='itx_valordecimal']/div[1]")).click();
	    	  waitFor(1).seconds();
	    	getDriver().findElement(By.xpath("//INPUT[@id='itx_valordecimal_i']")).sendKeys(datoPropiedad);
	    	Serenity.takeScreenshot();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}

	public void Ciudad(String datoPropiedad) {
	    try {    
	    	//*[@id="itx_valorciudadid"]/div[1]
	    	//*[@id="itx_valorciudadid"]/div[1]/span
	    	waitFor(3).seconds();
	    	find(By.xpath("//*[@id='itx_valorciudadid']/div[1]")).click();
	      	getDriver().findElement(By.xpath("//INPUT[@id='itx_valorciudadid_ledit']")).sendKeys(datoPropiedad);
	        getDriver().findElement(By.id("itx_valorciudadid_ledit")).sendKeys(Keys.ENTER);
	        waitFor(2).seconds();
	        getDriver().findElement(By.id("itx_valorciudadid_ledit")).sendKeys(Keys.ENTER); 
	      //*[@id="item34"]/a[2]
	        //*[@id="item7"]
	        /**waitFor(3).seconds();
	        find(By.xpath("//*[@id='item7']")).waitUntilVisible();
	        find(By.xpath("//*[@id='item7']")).waitUntilEnabled();
	        getDriver().findElement(By.xpath("//*[@id='item7'")).click();
	        */
	        Serenity.takeScreenshot();
	       
	        waitFor(1).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}
}
