package com.internexa.dynamics.pageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;

import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.toolBox.Utilidad;
import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;



public class GanarPerderOfertaPage extends PageObject {
	
	NuevoOportunidadPage nuevoOportunidadPage;
	Utilidad utilidad;
	GuardarCerrarToolBox guardarCerrarToolBox;
	String buscarFactibilidad="//*[@id='crmGrid_SavedNewQuerySelector']";
	String vistaSistema="//*[@id='Dialog_0']/div/ul/li[5]";
	String nombreFrame = "contentIFrame";
	String botonCreaOferta ="//*[@id='itx_factibilidad|NoRelationship|Form|itx_factibilidad.Button.CrearOferta']";
	String oportunidadOfertaRel="//*[@id='tab_6_Expander']";
	String ofertasArea="//*[@id=\"Ofertas_divDataArea\"]";
			
			
	String ofertaSeleccionada="//*[@id='gridBodyTable']/tbody/tr/td[3]/nobr";
	
	String botonPresentar="//*[@id='crmRibbonManager']/div/ul/li[4]";
	String lblContieneIPS="//*[@id='itx_usuarioipsid']/div[1]";
	String lblDigitaIPS = "//input[@id='itx_usuarioipsid_ledit']";
	String lblContieneTecnico="//*[@id='itx_contactotecnicoid']/div[1]";
	String lblDigitaTEcnico = "//input[@id='itx_contactotecnicoid_ledit']";
								
	
	public void buscarOferta() {
		try{ 
			getDriver().navigate().refresh();
			waitFor(1).seconds();
			getDriver().switchTo().frame(nombreFrame+"0");
			find(By.xpath(buscarFactibilidad)).waitUntilVisible();
			find(By.xpath(buscarFactibilidad)).waitUntilEnabled();
			find(By.xpath(buscarFactibilidad)).click();
			waitFor(1).seconds();
			find(By.xpath(vistaSistema)).click();
			
						
	        waitFor(2).seconds();
	    	
	    	HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
            String element = new String();
                     
	    	int i=1;
	    	int intCatidadElementos;
	    	String salirDo="No";
	    	do {
	    			    		
	    		find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[2]/nobr")).setWindowFocus();
		    	
                element = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[4]/nobr")).getText();
               
                intCatidadElementos=TheTable.getRowElements().size();
                
                if (element.equals(NuevoOportunidadPage.NombreOportunidad)) {
                       utilidad.dobleClick("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[2]/nobr");
                       salirDo="OK";
                       waitFor(3).second();
                }            
                i++;
         }while(i<=intCatidadElementos && salirDo.equals("No")) ;
	    	
	    	getDriver().switchTo().defaultContent();
			}
            
           
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	public void CrearOferta() {
	    try {    
	    
	    	find(By.xpath(botonCreaOferta)).click();
	    	waitFor(5).seconds();
	        Serenity.takeScreenshot();
	        waitFor(5).seconds();
	        getDriver().switchTo().alert().accept();
	        
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    
	}
	
	public void OportunidadOfertaRelacionada() {
	    try { 
	    	waitFor(3).seconds();
	    	getDriver().switchTo().frame(nombreFrame+"1");
	    	
	    	find(By.xpath(oportunidadOfertaRel)).click();
	    	waitFor(3).seconds();
	    	
	    	//*[@id="Ofertas_divDataArea"]
	    	
	    	find(By.xpath(ofertasArea)).waitUntilVisible();
			find(By.xpath(ofertasArea)).waitUntilEnabled();
			find(By.xpath(ofertasArea)).click();
			waitFor(3).seconds();
			find(By.xpath("//*[@id='Ofertas_divDataArea']/div/table/tbody/tr")).click();
						   //*[@id="gridBodyTable"]/tbody/tr[5]
			//*[@id="gridBodyTable"]/tbody/tr
			
			waitFor(2).seconds();
			find(By.xpath("//*[@id='Ofertas_divDataArea']/div/table/tbody/tr/td[3]/nobr")).click();
			
			utilidad.esperaDesaparecer();
			
	    	getDriver().switchTo().defaultContent();
	    	
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    
	}
	

	public void SeleccionarIPS(String nombreIPS) {
		
	    try {
	    	//Robot robot = new Robot();
            
            getDriver().switchTo().frame(nombreFrame+"1");

            findBy(lblContieneIPS).click();
            waitFor(1).second();
            find(By.xpath(lblDigitaIPS)).typeAndEnter(nombreIPS);

            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id='itx_usuarioipsid_IMenu']/li/a[contains(.,'"+nombreIPS.toUpperCase()+"')]")).click();
   	        
            getDriver().switchTo().defaultContent();
            
            guardarCerrarToolBox.btnGuardar();
           
            
	        waitFor(1).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}

	public void SeleccionarContactoTecnico(String nombreContactoTecnico) {
		
	    try {
	    	Robot robot = new Robot();
	    	 waitFor(2).second();
            getDriver().switchTo().frame(nombreFrame+"1");

            findBy(lblContieneTecnico).click();
            waitFor(1).second();
            robot.keyPress(KeyEvent.VK_F2);
            find(By.xpath(lblDigitaTEcnico)).typeAndEnter(nombreContactoTecnico);

            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id='itx_contactotecnicoid_IMenu']/li/a[contains(.,'"+nombreContactoTecnico.toUpperCase()+"')]")).click();

            getDriver().switchTo().defaultContent();
            
	        waitFor(1).seconds();
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }
	}
	
	public void Presentar() {
	    try {    
	    	find(By.xpath(botonPresentar)).click();
	    	waitFor(1).seconds();
	       
	    }catch (Exception ex) {
	           System.out.println(ex.getMessage() + "");
	    }    
	}
	
	public void EligeGanarPerder(String strGanarPerder, String strMotivo, String strDescrip) {
		try{ 
            
			if (strGanarPerder.equals("Ganar")) {
				GanarOferta();
			}
			else if (strGanarPerder.equals("Perder")) {
				PerderOferta(strMotivo,strDescrip);
				
					}
			}
            
           
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	public void GanarOferta() {
		try{ 
			//*[@id="crmRibbonManager"]/div/ul/li[5]
			
			}
            
           
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	public void PerderOferta(String strMotivoPerder, String strDescripPerder) {
		try{ 
			String btnPerder="//*[@id='crmRibbonManager']/div/ul/li[6]";
			String ipsFrame="NavBarGloablQuickCreate";
			String strContenedorNotivo ="//*[@id='itx_motivodecierreid']/div[1]";
		    String strInputMotivo ="//input[@id='itx_motivodecierreid_ledit']";
		    String strContenedorDescrip="//*[@id='itx_descripciondecierre']/div[1]";
			String strTextareaDescrip="//textarea[@id='itx_descripciondecierre_i']";
			String btnGuardarPant ="//*[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']";
			
		    Robot robot = new Robot();
		    Serenity.takeScreenshot();
		    utilidad.esperaDesaparecer();
		    waitFor(2).second();
			findBy(btnPerder).click();
			//utilidad.esperaDesaparecer();
			waitFor(3).second();
			utilidad.esperaDesaparecer();
			//PANTALLA PARA LLENAR
				getDriver().switchTo().frame(ipsFrame);
				waitFor(1).second();
		       
				find(By.xpath(strContenedorNotivo)).waitUntilVisible();
				find(By.xpath(strContenedorNotivo)).waitUntilEnabled();
				find(By.xpath(strContenedorNotivo)).click();
				robot.keyPress(KeyEvent.VK_F2);
	            find(By.xpath(strInputMotivo)).sendKeys(Keys.ENTER);
							
				getDriver().findElement(By.xpath("//*[@id=\"itx_motivodecierreid_IMenu\"]/li["+strMotivoPerder+"]")).click();
				
				//*[@id="item25"]/a[2]/span/nobr/span[contains.,"Perdido por cliente canceló proyecto"]
				
				find(By.xpath(strContenedorDescrip)).click();
				find(By.xpath(strTextareaDescrip)).typeAndEnter(strDescripPerder);
				
				getDriver().switchTo().defaultContent();
				
				getDriver().findElement(By.xpath(btnGuardarPant)).click();
			
				  utilidad.esperaDesaparecer();
				  //waitFor(2).seconds();
			  waitFor(3).seconds();
		        Serenity.takeScreenshot();
		       waitFor(2).seconds();
		        getDriver().switchTo().alert().accept();
		        waitFor(1).seconds();
		        getDriver().switchTo().frame(nombreFrame+"1");
		        	getDriver().findElement(By.xpath("//*[@id='Administracion_Expander']")).click();
		        	waitFor(1).seconds();
		        	getDriver().findElement(By.xpath("//*[@id='Administracion_content']/div/div[1]")).click();
		        getDriver().switchTo().defaultContent();
			
			}
            
           
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
}
