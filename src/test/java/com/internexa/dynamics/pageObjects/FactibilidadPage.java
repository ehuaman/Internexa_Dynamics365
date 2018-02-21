package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.Serenity;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.internexa.dynamics.toolBox.Utilidad;
import org.openqa.selenium.JavascriptExecutor;

import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.pageObjects.MenuOportunidadPage;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class FactibilidadPage extends PageObject {
Utilidad utilidad;
MenuOportunidadPage menuOportunidad;
public String numeroFactibilidad;
	
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
	    	Robot robot = new Robot();
            
            getDriver().switchTo().frame("NavBarGloablQuickCreate");
            
           
            find(By.xpath("//*[@id='rofContainer']")).waitUntilVisible();
            findBy("//*[@id='itx_systemuserid']/div[1]/span/div[2]").click();
            waitFor(1).second();
            robot.keyPress(KeyEvent.VK_F2);
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
	    	find(By.xpath("//*[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']")).click();
	        Serenity.takeScreenshot(); 
	        utilidad.esperaDesaparecer();
	        waitFor(2).seconds();
	        getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
	        find(By.xpath("//*[@id='factibilidades_divDataArea']")).waitUntilVisible();
			find(By.xpath("//*[@id='factibilidades_divDataArea']")).waitUntilEnabled();
			find(By.xpath("//*[@id='factibilidades_divDataArea']")).click();
			
	        numeroFactibilidad=find(By.xpath("//*[@id='gridBodyTable']/tbody/tr/td[2]/div")).getTextValue();
	      
	        Serenity.takeScreenshot();
	        getDriver().switchTo().defaultContent();
	        
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}
	
	public void EnviarFactibilidad() {
	    try {    
	    	menuOportunidad.venta();
	    	
	    	menuOportunidad.factibilidad();
	    	
	    	Serenity.takeScreenshot();
	    	
	    	utilidad.buscarEnGrid(numeroFactibilidad);
	    	
	    	
	    	
	    //NavBarGloablQuickCreate
	    	//find(By.xpath("//*[@id=\"itx_factibilidad|NoRelationship|Form|itx.itx_factibilidad.Button.EnviarSolicitudFactibilidad\"]")).click();
	    	//BUTTON[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']
	        Serenity.takeScreenshot();
	        
	        
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    

	}
	
	public void ProductoEvaluación() {
		
		String element = new String();
		 try {
			 find(By.id("contentIFrame0")).waitUntilVisible();
		        getDriver().switchTo().frame("contentIFrame0");
		        
		        waitFor(1).seconds();
		        find(By.className("editableGrid wj-control wj-flexgrid wj-content")).waitUntilVisible();
				find(By.className("editableGrid wj-control wj-flexgrid wj-content")).waitUntilEnabled();
				
		        find(By.xpath("//*[@id=\"Gridccc5e8fd-d591-a054-a518-cf9e23a1302a_component\"]/div/div[1]/div[1]/div[4]/span")).click();;
		      //*[@id="Gridccc5e8fd-d591-a054-a518-cf9e23a1302a_component"]/div/div[1]
		      //*[@id="Gridccc5e8fd-d591-a054-a518-cf9e23a1302a_component"]/div/div[1]/div[1]/div[1]
		      //*[@id="Gridccc5e8fd-d591-a054-a518-cf9e23a1302a_component"]/div/div[1]/div[1]/div[4]/div[1]/div/div/div/input
		        
		        //WebElement table = getDriver().findElement(By.id("gridBodyTable")); 
			 
			/* if (idOportunidad.substring(0, 4)=="OPR" || idOportunidad.substring(0, 4)=="FAC" ){
				
				 find(By.xpath("//*[@id='crmGrid_findCriteria']")).sendKeys(idOportunidad);
				
				 find(By.xpath("//*[@id='gridBodyTable']/tbody/tr/td[2]/nobr")).click();
				 dobleClick("//*[@id='gridBodyTable']/tbody/tr/td[2]/nobr");
			 }
			 else
			 {
		        HtmlTable TheTable = new HtmlTable(table);
		        int i=1;
		        boolean found = true;
		        do {
		               // Campo ID DE OPORTUNIDAD
		               System.out.println("row " +i);
		               element = find(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[2]/nobr/span")).getText();
		               							//*[@id="gridBodyTable"]/tbody/tr[1]/td[3]/nobr
		               							//*[@id="gridBodyTable_primaryField_{8FE6C5F0-6E16-E811-810E-E0071B6E8DC1}_0"]
		           
		               							//*[@id="gridBodyTable"]/tbody/tr[1]/td[2]/nobr/span
		               if (element.equals(idOportunidad)) {                               
		                      found=false;
		               } else { 
		            	   i++;                              
		               }                   
		        }while(i<=TheTable.getRowElements().size() && found );
		        
		        // Actions recibe un web element al que se le ejecutara una accion.
		        Actions act = new Actions(getDriver()); 
		        // Se selecciona la primer columna de la tabla (CHECKBOX) para realizar doble click
		        WebElement checkItem = getDriver().findElement(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[1]")); 
		        checkItem.click();                
		        // Accion dobleclic se le envia el webElement               
		        act.doubleClick(checkItem).build().perform();
			 }*/
		        waitFor(1).seconds();
		        getDriver().switchTo().defaultContent();
		        waitFor(1).seconds();
		 } catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
		 }
	}
	
	
	
	public void SolicitarFactibilidad() {
	    try {    
	    
	    	find(By.xpath("//*[@id=\"itx_factibilidad|NoRelationship|Form|itx.itx_factibilidad.Button.EnviarSolicitudFactibilidad\"]")).click();
	    	waitFor(2).seconds();
	        Serenity.takeScreenshot();
	        getDriver().switchTo().alert().accept();
	        waitFor(2).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    
	}
}
	

