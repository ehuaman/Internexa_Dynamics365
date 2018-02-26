package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.Serenity;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;
import com.internexa.dynamics.toolBox.Utilidad;
import org.openqa.selenium.JavascriptExecutor;

import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.pageObjects.MenuOportunidadPage;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;


public class FactibilidadPage extends PageObject {
Utilidad utilidad;
MenuOportunidadPage menuOportunidad;

Producto40LASTMILENACIONALEditarPage producto40LASTMILENACIONALEditarPage;
GuardarCerrarToolBox guardarCerrarToolBox;

String nombreFrame = "contentIFrame";
String contineFactibilidades ="//*[@id='titleContainer_factibilidades']";
String btnFactibilidad ="//*[@id='factibilidades_addImageButtonImage']";
//IPS
String ipsFrame="NavBarGloablQuickCreate";
String contenedorIPS="//*[@id='rofContainer']";
String lblContieneIPS="//*[@id='itx_systemuserid']/div[1]/span/div[2]";
String lblDigitaIPS="//INPUT[@id='itx_systemuserid_ledit']";
//Observaciones
String solitudObservaciones="//*[@id='itx_observacionessolicitud']/div[1]";
String editarsolitudObservaciones="//TEXTAREA[@id='itx_observacionessolicitud_i']";
//GuaradarFactibilidad
String btnGrabarFactibilidad="//*[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']";
String divAreaFactibilidad ="//*[@id='factibilidades_divDataArea']";
String divDatoNumFactibilidad="//*[@id='gridBodyTable']/tbody/tr/td[2]/div";

public String numeroFactibilidad;
	
	public void AgregarFactibilidad() {
		try{ 
            getDriver().switchTo().frame(nombreFrame+"1");
            waitFor(2).seconds();
			find(By.xpath(contineFactibilidades)).waitUntilVisible();
			find(By.xpath(contineFactibilidades)).waitUntilEnabled();
			find(By.xpath(contineFactibilidades)).click();
			
			waitFor(1).seconds();
            getDriver().findElement(By.xpath(btnFactibilidad)).click();
          //hasta que desaparesca
	        utilidad.esperaDesaparecer();
            //waitFor(2).seconds();
            getDriver().switchTo().defaultContent();
            
           }
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	public void SeleccionarIPS(String nombreIPS) {
		
	    try {
	    	Robot robot = new Robot();
            
            getDriver().switchTo().frame(ipsFrame);

            find(By.xpath(contenedorIPS)).waitUntilVisible();
            findBy(lblContieneIPS).click();
            waitFor(1).second();
            robot.keyPress(KeyEvent.VK_F2);
            find(By.xpath(lblDigitaIPS)).typeAndEnter(nombreIPS);

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
	    	 waitFor(2).seconds();
            find(By.xpath(solitudObservaciones)).click();
	    	waitFor(2).seconds();
	    	find(By.xpath(editarsolitudObservaciones)).type(txtObservacion);
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
	    	
	    	
	    	find(By.xpath(btnGrabarFactibilidad)).click();
	        Serenity.takeScreenshot(); 
	        utilidad.esperaDesaparecer();
	        waitFor(2).seconds();
	        getDriver().switchTo().frame(nombreFrame+"1");
            waitFor(2).seconds();
	        find(By.xpath(divAreaFactibilidad)).waitUntilVisible();
			find(By.xpath(divAreaFactibilidad)).waitUntilEnabled();
			find(By.xpath(divAreaFactibilidad)).click();
			
	        numeroFactibilidad=find(By.xpath(divDatoNumFactibilidad)).getTextValue();
	      
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
	
	public void productoEvaluacion() {
		
		String element = new String();
		 try {
			 
			 ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
			 getDriver().switchTo().window(tabs2.get(1));
			 //getDriver().close();
			 //getDriver().switchTo().window(tabs2.get(0));
			 
			 find(By.id(nombreFrame+"0")).waitUntilVisible();
		        getDriver().switchTo().frame(nombreFrame+"0");
		        
		        waitFor(1).seconds();
		        
		        find(By.xpath("//*[@id='crmCCDataSet_productosevaluacion']/div/div[5]/div/div[1]/div[1]")).click();
				element=find(By.xpath("//*[@id='crmCCDataSet_productosevaluacion']/div/div[5]//div/div[1]/div[1]/div/div[1]")).getTextValue();
				
				if (element.contentEquals("No")) {
					find(By.xpath("//*[@id=\"crmCCDataSet_productosevaluacion\"]/div/div[5]//div/div[1]/div[1]/div/div[4]")).click();
					utilidad.dobleClick("//*[@id=\"crmCCDataSet_productosevaluacion\"]/div/div[5]//div/div[1]/div[1]/div/div[4]");
					waitFor(2).seconds();
					//Web Detalles generales
					find(By.xpath("//*[@id=\"itx_instanciaproductoid_lookupValue\"]")).click();
					getDriver().switchTo().defaultContent();
					//*[@id="contentIFrame0"]
					
					
				}
				
		       
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
	
	public void buscarCorreoAprobar() {
	    try {    
	    	getDriver().navigate().refresh();
			getDriver().switchTo().frame(nombreFrame+"0");
	        waitFor(2).seconds();
	    	find(By.xpath("//*[@id='crmGrid_gridBar']/tbody/tr/th[7]/table/tbody/tr/td[1]/a/nobr/label")).click();
	    	waitFor(2).seconds();
	    	find(By.xpath("//*[@id='crmGrid_gridBar']/tbody/tr/th[7]/table/tbody/tr/td[1]/a/nobr/label")).click();
	    	waitFor(2).seconds();
	    	HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
            String element = new String();
            
	    	int i=1;
	    	int intCatidadElementos;
	    	String salirDo="No";
	    	do {
	    		
	    		find(By.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[2]/nobr")).click();
		    	utilidad.dobleClick("//*[@id='gridBodyTable']/tbody/tr[1]/td[2]/nobr");
		    	getDriver().switchTo().defaultContent();
		    	
                element = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[4]/nobr")).getText();
                intCatidadElementos=TheTable.getRowElements().size();
                
                if (element.equals(MenuOportunidadPage.NombreOportunidad)) {
                      // System.out.println(find(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[8]")).getText());
                       find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[4]/nobr")).click();
                       salirDo="OK";
                       waitFor(3).second();
                }            
                i++;
         }while(i<=intCatidadElementos && salirDo.equals("No")) ;
	    	
	    	
	    	getDriver().switchTo().frame(nombreFrame+"1");
	    		find(By.xpath("//*[@id=\"Email_content\"]/div[1]/div[2]")).click();
	    	Serenity.takeScreenshot();
	    	
	    	find(By.id("//*[@id=\"contentIFrame1\"]")).setWindowFocus();
	    	getDriver().switchTo().frame("descriptionIFrame");
	    	  	find(By.xpath("/html/body/p[7]/span/a")).click();
	    	getDriver().switchTo().parentFrame();
	    	getDriver().switchTo().defaultContent();
	        
	        waitFor(2).seconds();
	       
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    
	}
	
	public void cambioEstadoFactibilidad() {
	    try {    
	    	getDriver().switchTo().frame(nombreFrame+"0");
	        waitFor(2).seconds();
	      //*[@id='itx_estadodelproducto']/div[1]
	        find(By.xpath("//*[@id='itx_estadodelproducto']/div[1]")).click();
	        getDriver().findElement(By.xpath("//*[@id='itx_estadodelproducto_i']/option[2]")).click();
	        waitFor(2).seconds(); 
	        getDriver().switchTo().defaultContent();
	        
	    	guardarCerrarToolBox.btnGuardarCerrar();

	        waitFor(2).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    
	}
	
	
}
	

