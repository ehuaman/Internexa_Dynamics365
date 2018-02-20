package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys; 
import com.internexa.dynamics.toolBox.Utilidad;

public class FactibilidadPage extends PageObject {
Utilidad utilidad;
	
	public void AgregarFactibilidad() {
		try{ 
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
			find(By.xpath("//*[@id='titleContainer_factibilidades']")).waitUntilVisible();
			find(By.xpath("//*[@id='titleContainer_factibilidades']")).waitUntilEnabled();
			find(By.xpath("//*[@id='titleContainer_factibilidades']")).click();
			
			waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id='factibilidades_addImageButtonImage']")).click();
          //hasta que desaparesca
	        utilidad.esperaDesaparecer();
            //waitFor(2).seconds();
            getDriver().switchTo().defaultContent();
            
           }
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	//find(By.xpath("//*[@id='rofContainer']")).waitUntilVisible();
	//*[@id="Observaciones de la solicitud_label"]
	//*[@id="itx_observacionessolicitud"]
	
	public void SeleccionarIPS(String nombreIPS) {
	    try {
	    	 getDriver().switchTo().frame("NavBarGloablQuickCreate");
	    	 
	    	 waitFor(2).seconds();
	    	 find(By.xpath("//*[@id='rofContainer']")).waitUntilVisible();
	    	 //getDriver().findElement(By.xpath("//UL[@class='ms-crm-InlineLookupEdit']")).click();
	    	 //css=div.ms-crm-Floating-Div
	    	 getDriver().findElement(By.xpath("//*[@id='itx_systemuserid']/div[1]/span/div[2]")).click();
	    	 getDriver().findElement(By.xpath("//*[@id='itx_systemuserid_cl_span']")).click();
	    	
	    	 find(By.cssSelector("div.ms-crm-Floating-Div")).click();
	    	 //*[@id='itx_systemuserid_cl_span']
	    	 	    	 
	    	     	 //id=itx_systemuserid_ledit
	    	 find(By.xpath("//INPUT[@id='itx_systemuserid_ledit']")).clear();
	    	 find(By.xpath("//INPUT[@id='itx_systemuserid_ledit']")).typeAndEnter(nombreIPS);
	    	
	    	 waitFor(2).seconds();
	        
	         getDriver().findElement(By.xpath("//*[@id='itx_systemuserid_IMenu']/li/a[contains(.,'"+nombreIPS.toUpperCase()+"')]")).click();
	   	        Serenity.takeScreenshot();
	       
	        waitFor(1).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}
	
	public void LlenarObservacionSolicitud(String txtObservacion) {
	    try {    
	    	//getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
            //
	    	find(By.xpath("//*[@id='itx_observacionessolicitud']/div[1]")).click();
	    	waitFor(2).seconds();
	    	//getDriver().findElement(By.xpath("//TEXTAREA[@id='itx_observacionessolicitud_i']")).sendKeys(txtObservacion);
	    	find(By.xpath("//TEXTAREA[@id='itx_observacionessolicitud_i']")).type(txtObservacion);
	    	
	    	 //getDriver().findElement(By.xpath("//*[@id='itx_opportunityid_cl']")).sendKeys(Keys.ENTER);
	    	waitFor(1).seconds();
	        Serenity.takeScreenshot();
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
	        GuardarFactibilidad();
	        waitFor(1).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	    
	    
	}
	
	public void GuardarFactibilidad() {
	    try {    
	    //NavBarGloablQuickCreate
	    	find(By.xpath("//*[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']")).click();
	    	//BUTTON[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']
	        Serenity.takeScreenshot();
	        
	        
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	    
	    
	}
}
