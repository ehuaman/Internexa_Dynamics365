package com.internexa.dynamics.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.internexa.dynamics.HtmlTable;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.Keys; 

import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;
import com.internexa.dynamics.toolBox.Utilidad;

public class ProductoEditarPage extends PageObject {

	GuardarCerrarToolBox guardarCerrarToolBox;
	Utilidad utilidad;
	LlenarPropiedades llenarPropiedades;
	
	 public void encontrarOportunidad() {
		 String element = new String();
	      String valorElemento = new String();
	      
		 try {
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(2).seconds();
	        //find(By.xpath("//*[@id=\"contentIFrame1\"]")).waitUntilVisible();
	        //getDriver().switchTo().frame("contentIFrame1");
	        //waitFor(1).seconds();
	       
	        HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
	       
	        int i=1;
	        do {
               System.out.println("row " +i);
             
               element = find(By.xpath("//*[@id=\'gridBodyTable\']/tbody/tr["+i+"]/td[4]/div")).getTextValue();
               valorElemento = find(By.xpath("//*[@id=\'gridBodyTable\']/tbody/tr["+i+"]/td[3]/div")).getTextValue();
               
              //&& valorElemento.equals("")
               if (element.equals("Sí") && valorElemento.isEmpty() ) {                               
            	   System.out.println(element+"Cambiar");
            	   ActualizarPropiedadesProducto(i);
            	   getDriver().switchTo().frame("contentIFrame1");
            	   HtmlTable TheTable1 = new HtmlTable(find(By.id("gridBodyTable")));
            	   TheTable=TheTable1;
            	   i++;
               } else { 
            	   i++;                              
               }                   
	        }while(i<=TheTable.getRowElements().size());
	        	System.out.println(element+"NO cambiar");
		 	}catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
			 }
	 	}
	 
	 
	 public void ActualizarPropiedadesProducto(Integer intColumna) {
	        try {  
	        	
	        	
	        	String strXpathDobleClick;
	        	strXpathDobleClick="//*[@id='gridBodyTable']/tbody/tr["+intColumna+"]/td[4]/div";
	        	//Funcion que da doble click sobre SI
	        	utilidad.dobleClick(strXpathDobleClick);
	        	waitFor(3).second();
	        	if (intColumna == 1) {
	        		llenarPropiedades.Capacidad("100");
	        	}
	            else if (intColumna==5) {
	             	
	            	llenarPropiedades.Ciudad("Lima");
	                  
	        	}
	        	
	               waitFor(1).second();
	               getDriver().switchTo().defaultContent();
	               waitFor(1).seconds();
	               guardarCerrarToolBox.btnGuardarCerrar();
	               waitFor(3).seconds();
	               
	        }catch (Exception ex) {
	               System.out.println(ex.getMessage() + "");
	        }
	  }
	 
	



}

