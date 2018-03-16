package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.Serenity;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;
import com.internexa.dynamics.toolBox.Utilidad;


import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.pageObjects.MenuOportunidadPage;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;



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
			 utilidad.buscarIngresarFrame(nombreFrame);
           
			find(By.xpath(contineFactibilidades)).waitUntilVisible();
			find(By.xpath(contineFactibilidades)).waitUntilEnabled();
			find(By.xpath(contineFactibilidades)).click();
			
			waitFor(2).seconds();
            getDriver().findElement(By.xpath(btnFactibilidad)).click();
          //hasta que desaparesca
	        utilidad.esperaDesaparecer();
            //waitFor(1).seconds();
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
	       
	        waitFor(2).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}
	
	public void LlenarObservacionSolicitud(String txtObservacion) {
	    try {    
	    	 waitFor(1).seconds();
            find(By.xpath(solitudObservaciones)).click();
	    	waitFor(1).seconds();
	    	find(By.xpath(editarsolitudObservaciones)).type(txtObservacion);
	    	waitFor(1).seconds();
	        Serenity.takeScreenshot();
	        getDriver().switchTo().defaultContent();
	        waitFor(2).seconds();
	        GuardarFactibilidad();
	        waitFor(2).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	    
	    
	}
	
	public void GuardarFactibilidad() {
	    try {
	    	
	    	waitFor(2).seconds();
	    	find(By.xpath(btnGrabarFactibilidad)).click();
	        Serenity.takeScreenshot(); 
	        utilidad.esperaDesaparecer();
	        waitFor(3).seconds();
	        utilidad.buscarIngresarFrame(nombreFrame);
            
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
	    	utilidad.esperaDesaparecer();
	    	
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

			 //find(By.id(nombreFrame+"0")).waitUntilVisible();
			 utilidad.buscarIngresarFrame(nombreFrame);
		        
		        
		      
		        find(By.xpath("//*[@id='crmCCDataSet_productosevaluacion']/div/div[5]/div/div[1]/div[1]")).click();
				element=find(By.xpath("//*[@id='crmCCDataSet_productosevaluacion']/div/div[5]//div/div[1]/div[1]/div/div[1]")).getTextValue();
				
				if (element.contentEquals("No")) {
					find(By.xpath("//*[@id=\"crmCCDataSet_productosevaluacion\"]/div/div[5]//div/div[1]/div[1]/div/div[3]")).click();
					utilidad.dobleClick("//*[@id=\"crmCCDataSet_productosevaluacion\"]/div/div[5]//div/div[1]/div[1]/div/div[3]");
					waitFor(1).seconds();
					//Web Detalles generales
					find(By.xpath("//*[@id=\"itx_instanciaproductoid_lookupValue\"]")).click();
					getDriver().switchTo().defaultContent();

				}

		        waitFor(2).seconds();
		        getDriver().switchTo().defaultContent();
		        waitFor(2).seconds();
		 } catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
		 }
	}

	public void SolicitarFactibilidad() {
	    try {    
	    	utilidad.esperaDesaparecer();
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
	    	 utilidad.buscarIngresarFrame(nombreFrame);
	        
	    	find(By.xpath("//*[@id='crmGrid_gridBar']/tbody/tr/th[7]/table/tbody/tr/td[1]/a/nobr/label")).click();
	    	waitFor(1).seconds();
	    	find(By.xpath("//*[@id='crmGrid_gridBar']/tbody/tr/th[7]/table/tbody/tr/td[1]/a/nobr/label")).click();
	    	waitFor(1).seconds();
	    	HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
            String element = new String();
            String element2 = new String();
            
	    	int i=1;
	    	int intCatidadElementos;
	    	String salirDo="No";
	    	do {
	    		
	    		find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[2]/nobr")).setWindowFocus();
		    	
                element = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[5]/nobr")).getText();
                element2 = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[2]/nobr")).getText();
                intCatidadElementos=TheTable.getRowElements().size();
             
                if (element.equals(NuevoOportunidadPage.NombreOportunidad) && element2.equals("Solicitud de factibilidad")) {
                       utilidad.dobleClick("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[2]/nobr");
                       salirDo="OK";
                       waitFor(1).second();
                }            
                i++;
         }while(i<=intCatidadElementos && salirDo.equals("No")) ;
	    	
	    	getDriver().switchTo().defaultContent();
	    	 utilidad.buscarIngresarFrame(nombreFrame);
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
	    	 utilidad.buscarIngresarFrame(nombreFrame);
	        
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
	

