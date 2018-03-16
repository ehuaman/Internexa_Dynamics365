package com.internexa.dynamics.pageObjects;

import static org.junit.Assert.fail;

import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;
import com.internexa.dynamics.toolBox.Utilidad;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class Prd300IaaSPage extends PageObject {

	GuardarCerrarToolBox guardarCerrarToolBox;
	Utilidad utilidad;
	LlenarPropiedades llenarPropiedades;
	
	public void encontrarOportunidad(String strCiudadPrincipal, 
									 String strCapacidad, 
									 String strMemoriaRAM, 
									 String strCategoria, 
									 String strObstervacion,
									 String strNomAplicativo,
									 String strNumUsuarios) {
		 String element = new String();
	      String valorElemento = new String();
	      
		 try {
			
			 if (strNumUsuarios.equals("")) {
				 getDriver().switchTo().frame("contentIFrame"+"1");
			 }
			 else
			 {
				 getDriver().switchTo().frame("contentIFrame"+"0");
			 }
			 //utilidad.buscarIngresarFrame("contentIFrame");
			
	        waitFor(2).seconds();
	     
	        HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
	       
	        int i=1;
	        do {
	        	
	        	element = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[4]/div")).getTextValue();
	        	
                valorElemento = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[3]/div")).getTextValue();
             
               if ((element.equals("Sí")|| element.equals("Sim") ) && valorElemento.isEmpty() ) {                               
            	   //System.out.println(element+"Cambiar");
            	   ActualizarPropiedadesProducto(i, strCiudadPrincipal,  strCapacidad,  strMemoriaRAM,  strCategoria,  strObstervacion,strNomAplicativo,strNumUsuarios);
            	   
            	   if (strNumUsuarios.equals("")) {
      				 getDriver().switchTo().frame("contentIFrame"+"1");
      			 }
      			 else
      			 {
      				 getDriver().switchTo().frame("contentIFrame"+"0");
      			 }
            	   //utilidad.buscarIngresarFrame("contentIFrame");
            	   
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
		        fail();
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
											  String strCiudadPrincipal, 
											  String strCapacidad, 
											  String strMemoriaRAM, 
											  String strCategoria, 
											  String strObstervacion,
											  String strNomAplicativo,
											  String strNumUsuarios) {
	        try {  

	        	String strXpathDobleClick;
	        	strXpathDobleClick="//*[@id='gridBodyTable']/tbody/tr["+intColumna+"]/td[4]/div";
	        	//Funcion que da doble click sobre SI
	        	utilidad.dobleClick(strXpathDobleClick);
	        	waitFor(3).second();
	        	if (intColumna == 1) {
	        		llenarPropiedades.Ciudad(strCiudadPrincipal);
	        		}
	            else if (intColumna==2 ) {
	             	
	            		llenarPropiedades.ValorDecimal(strCapacidad);
	            	}
	            	else if (intColumna==4) {     
	            		llenarPropiedades.ValorDecimal(strMemoriaRAM);
	            	}
	            		else if (intColumna==7) {     
	            			llenarPropiedades.ValorListaPropiedad(strCategoria);
	            		}
	            		else if (intColumna==8) {     
	            			llenarPropiedades.ValorPropiedad(strObstervacion);
	            		}
		            		else if (intColumna==14) {     
		            			llenarPropiedades.ValorPropiedad(strNomAplicativo);
		            		}
			            		else if (intColumna==16) {     
			            			llenarPropiedades.ValorEntero(strNumUsuarios);
			            		}
			        	
	        	
	               waitFor(1).second();
	               getDriver().switchTo().defaultContent();
	               waitFor(1).seconds();
	               guardarCerrarToolBox.btnGuardarCerrar();
	               waitFor(3).seconds();
	               
	        }catch (Exception ex) {
	               System.out.println(ex.getMessage() + "");
	               fail();
	        }
	  }
	 
	
	
}
