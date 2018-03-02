package com.internexa.dynamics.pageObjects;

import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;
import com.internexa.dynamics.toolBox.Utilidad;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class Prd70InternexaIPAccessNGEditarPage extends PageObject {
	GuardarCerrarToolBox guardarCerrarToolBox;
	Utilidad utilidad;
	LlenarPropiedades llenarPropiedades;
	
	public void encontrarOportunidad(String propiedadCapacidad, 
									 String propiedadCiudadA,
									 String propiedadSitioA) {
		 String element = new String();
	      String valorElemento = new String();
	      
		 try {
			 
			 if (propiedadSitioA.contentEquals("")) {
				 getDriver().switchTo().frame("contentIFrame1");
			 }
			 else {
				 getDriver().switchTo().frame("contentIFrame0");
			 }
			
	        waitFor(2).seconds();
	     
	        HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
	       
	        int i=1;
	        do {
                element = find(By.xpath("//*[@id=\'gridBodyTable\']/tbody/tr["+i+"]/td[4]/div")).getTextValue();
               valorElemento = find(By.xpath("//*[@id=\'gridBodyTable\']/tbody/tr["+i+"]/td[3]/div")).getTextValue();

               if (element.equals("Sí") && valorElemento.isEmpty() ) {                               
            	   //System.out.println(element+"Cambiar");
            	   ActualizarPropiedadesProducto(i,propiedadCapacidad, propiedadCiudadA,propiedadSitioA);
            	   if (propiedadSitioA.contentEquals("")) {
      				 	getDriver().switchTo().frame("contentIFrame1");
		      		}
		      			 else {
		      				 getDriver().switchTo().frame("contentIFrame0");
		      			 		}
            	   HtmlTable TheTable1 = new HtmlTable(find(By.id("gridBodyTable")));
            	   TheTable=TheTable1;
            	   i++;
               } else { 
            	   i++;                              
               }                   
	        }while(i<=TheTable.getRowElements().size());
			        waitFor(1).second();
		            getDriver().switchTo().defaultContent();
		            waitFor(1).seconds();
		            guardarCerrarToolBox.btnGuardarCerrar();
		            Serenity.takeScreenshot();
		            waitFor(2).seconds();
		 	}catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
			 }
	 	}
	 
	 
	 /**LMMS
	 * @param intColumna
	 * @param propiedadCapacidad
	 * @param propiedadCiudadA
	 
	 * //ingresa los valores de cada una de las Propiedades faltantes en el producto
	   //Tener en cuenta que los nombres de Ciudades tienen que tener tildes si corresponde
	        	
	 */
	public void ActualizarPropiedadesProducto(Integer intColumna,
											  String propiedadCapacidad, 
											  String propiedadCiudadA, 
											  String propiedadSitioA) {
	        try {  

	        	String strXpathDobleClick;
	        	strXpathDobleClick="//*[@id='gridBodyTable']/tbody/tr["+intColumna+"]/td[4]/div";
	        	//Funcion que da doble click sobre SI
	        	utilidad.dobleClick(strXpathDobleClick);
	        	waitFor(3).second();
	        	if (intColumna == 1) {
	        		llenarPropiedades.Capacidad(propiedadCapacidad);
	        		}
	            else if (intColumna==5 ) {
	             	
	            		llenarPropiedades.Ciudad(propiedadCiudadA);
	            	}
	           	else if (intColumna==9) {     
	            			llenarPropiedades.Sitio(propiedadSitioA);
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
