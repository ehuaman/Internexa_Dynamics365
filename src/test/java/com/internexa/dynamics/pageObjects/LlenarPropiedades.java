package com.internexa.dynamics.pageObjects;

import static org.junit.Assert.fail;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;


public class LlenarPropiedades extends PageObject {
	
	public void ValorDecimal(String datoPropiedad) {
	    try {        
	    	
	    	find(By.xpath("//*[@id='itx_valordecimal']/div[1]")).click();
	    	  waitFor(1).seconds();
	    	getDriver().findElement(By.xpath("//INPUT[@id='itx_valordecimal_i']")).sendKeys(datoPropiedad);
	    	Serenity.takeScreenshot();
	 
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	           fail();
	    }
	}
	
	public void Ciudad(String datoPropiedad) {
	    try {    
	    	
	    	waitFor(3).seconds();
	    	find(By.xpath("//*[@id='itx_valorciudadid']/div[1]")).click();
	      	getDriver().findElement(By.xpath("//INPUT[@id='itx_valorciudadid_ledit']")).sendKeys(datoPropiedad);
	        getDriver().findElement(By.id("itx_valorciudadid_ledit")).sendKeys(Keys.ENTER);
	        waitFor(2).seconds();
	         getDriver().findElement(By.xpath("//*[@id='itx_valorciudadid_IMenu']/li/a[contains(.,'"+datoPropiedad.toUpperCase()+"')]")).click();
	     
	        Serenity.takeScreenshot();
	       
	        waitFor(1).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	           fail();
	    }
	}
	
	public void ValorPropiedad(String datoPropiedad) {
	    try {    
	    	
	    	find(By.xpath("//*[@id='itx_valorpropiedad']/div[1]")).click();
	    	  waitFor(1).seconds();
	    	getDriver().findElement(By.xpath("//INPUT[@id='itx_valorpropiedad_i']")).sendKeys(datoPropiedad);
	    	Serenity.takeScreenshot();
	    	
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	           fail();
	    }
	}
	public void Sitio(String datoSitio) {
	    try {    
	    	//*[@id="itx_valorsitioid"]/div[1]
	    	waitFor(3).seconds();
	    	find(By.xpath("//*[@id='itx_valorsitioid']/div[1]")).click();
	      	getDriver().findElement(By.xpath("//INPUT[@id='itx_valorsitioid_ledit']")).sendKeys(datoSitio);
	        getDriver().findElement(By.id("itx_valorsitioid_ledit")).sendKeys(Keys.ENTER);
	        waitFor(2).seconds();
	      //*[@id="itx_valorsitioid_IMenu"]/li/a[2][contains(.,'ICA')]
 	
	        getDriver().findElement(By.xpath("//*[@id='itx_valorsitioid_IMenu']/li/a[contains(.,'"+datoSitio.toUpperCase()+"')]")).click();
	     
	        Serenity.takeScreenshot();
	       
	        waitFor(1).seconds();
	    	
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	           fail();
	    }
	}
	

	public void ValorListaPropiedad(String datoPropiedad) {
	    try {    
	    	//*[@id="itx_valorsitioid"]/div[1]
	    	waitFor(3).seconds();
	    	find(By.xpath("//*[@id=\"itx_valorlistapropiedadid\"]/div[1]")).click();
	    	
	      	getDriver().findElement(By.xpath("//INPUT[@id=\"itx_valorlistapropiedadid_ledit\"]")).sendKeys(datoPropiedad);
	        getDriver().findElement(By.id("itx_valorlistapropiedadid_ledit")).sendKeys(Keys.ENTER);
	        waitFor(2).seconds();
	      //*[@id="itx_valorsitioid_IMenu"]/li/a[2][contains(.,'ICA')]
 	
	        getDriver().findElement(By.xpath("//*[@id=\"itx_valorlistapropiedadid_IMenu\"]/li/a[contains(.,'"+datoPropiedad+"')]")).click();
	     
	        Serenity.takeScreenshot();
	       
	        waitFor(1).seconds();
	    	
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	           fail();
	    }
	}
	
	
	public void ValorEntero(String datoPropiedad) {
	    try {        
	    	
	    	find(By.xpath("//*[@id=\"itx_valorentero\"]/div[1]")).click();
	    	  waitFor(1).seconds();
	    	getDriver().findElement(By.xpath("//INPUT[@id='itx_valorentero_i']")).sendKeys(datoPropiedad);
	    	Serenity.takeScreenshot();
	 
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	           fail();
	    }
	}
}
