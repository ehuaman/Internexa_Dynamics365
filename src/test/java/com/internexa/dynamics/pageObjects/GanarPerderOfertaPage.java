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
	
	String btnGanar="//*[@id='crmRibbonManager']/div/ul/li[5]";
	String btnGeneraDoc="//*[@id='TabNode_tab0Tab']/a/span/span";
	String btnDocumentos="//*[@id='Node_navSPDocuments']";
	String idframeContenedor="areaSPDocumentsFrame";
				
	String btnCargarDoc="//*[@id=\"commandContainer0\"]/ul/li[2]";
	String seleccionArchivo="//*[@id='userFile']";
	String idframeCargaArchivo="InlineDialog_Iframe";
	
	String btnTresPuntos="//*[@id='crmRibbonManager']/div/ul/li[10]";
	String btnAsociarContrato="//*[@id='moreCommandsList']/li[2]";
	
	String contContrato="//*[@id='itx_contratoid']/div[1]";
	String editContrato="//input[@id=\"itx_contratoid_ledit\"]";
	String contCompania="//*[@id=\"itx_companiaitxid\"]/div[1]";
	String editCompania="//input[@id=\"itx_companiaitxid_ledit\"]";
	String btnGuardarPant ="//*[@id='globalquickcreate_save_button_NavBarGloablQuickCreate']";
	
	String btnPerder="//*[@id='crmRibbonManager']/div/ul/li[6]";
	String ipsFrame="NavBarGloablQuickCreate";
	String strContenedorNotivo ="//*[@id='itx_motivodecierreid']/div[1]";
	String strInputMotivo ="//input[@id='itx_motivodecierreid_ledit']";
	
    String strContenedorDescrip="//*[@id='itx_descripciondecierre']/div[1]";
	String strTextareaDescrip="//textarea[@id='itx_descripciondecierre_i']";
	String strContenedorNotivoGana="";
	
	
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
	    	 waitFor(5).second();
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
				GanarOferta(strMotivo,strDescrip);
			}
			else if (strGanarPerder.equals("Perder")) {
				PerderOferta(strMotivo,strDescrip);
				
					}
			}
            
           
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	public void GanarOferta(String strMotivoGanar, String strDescripGanar) {
		try{ 
			Robot robot = new Robot();

			utilidad.esperaDesaparecer();
		    waitFor(2).second();
		    
			//Generar Documentos
		    		    
		    findBy(btnGeneraDoc).click();
		    waitFor(1).second();
		    findBy(btnDocumentos).click();
		    waitFor(2).second();
		    utilidad.esperaDesaparecer();
		    //
		    getDriver().switchTo().frame(nombreFrame+"1");
		   
		    find(By.id("areaSPDocuments")).click();
		    find(By.id(nombreFrame+"1")).setWindowFocus();
		 
	    	getDriver().switchTo().frame(idframeContenedor);
	    	
	    		findBy(btnCargarDoc).click();
	    		waitFor(1).second();	
	    	getDriver().switchTo().parentFrame();
	    	getDriver().switchTo().defaultContent();
	    	////Agregar Archivo
	    	getDriver().switchTo().frame(idframeCargaArchivo);
	    		getDriver().findElement(By.xpath(seleccionArchivo)).sendKeys("C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento orden de servicio.txt");
	    		findBy("//*[@id='butBegin']").click();
	    		waitFor(3).second();
	    		utilidad.esperaDesaparecer();
	    		waitFor(3).second();
	    	getDriver().switchTo().defaultContent();
	    	
	    	
	    	findBy("//*[@id='TabNode_tab0Tab-main']/a/span/span").click();
	    	
	    	findBy(btnTresPuntos).click();
	    	findBy(btnAsociarContrato).click();	    	
			///
	    	////////////////////// Actualizar Contrato
	    	utilidad.esperaDesaparecer();
	    	getDriver().switchTo().frame(ipsFrame);
	    	waitFor(3).second();
	          
	    	
	    	find(By.xpath(contContrato)).click();
			robot.keyPress(KeyEvent.VK_F2);
            find(By.xpath(editContrato)).sendKeys(Keys.ENTER);
            getDriver().findElement(By.xpath("//*[@id='Dialog_itx_contratoid_IMenu']/div[2]/ul/li[1]")).click();
          
            //find(By.xpath(contCompania)).click();
			robot.keyPress(KeyEvent.VK_F2);
            find(By.xpath(editCompania)).sendKeys(Keys.ENTER);
            getDriver().findElement(By.xpath("//*[@id='Dialog_itx_companiaitxid_IMenu']/div[2]/ul/li[1]/a[2]")).click();
          //*[@id="item6"]/a[2]
            getDriver().switchTo().defaultContent();
            
            Serenity.takeScreenshot();
            
            getDriver().findElement(By.xpath(btnGuardarPant)).click();
            
            waitFor(2).seconds();
	        getDriver().switchTo().alert().accept();
	        waitFor(2).seconds();
	        getDriver().switchTo().alert().accept();
	        waitFor(2).seconds();

	    	//Ganar Oferta
			findBy(btnGanar).click();
			
			//Motivo de oferta
			PantallaCierreOferta (strMotivoGanar, strDescripGanar);
			//utilidad.esperaDesaparecer();
			waitFor(5).seconds();
			getDriver().switchTo().alert().accept();
	        waitFor(2).seconds();
	        Serenity.takeScreenshot();
	        waitFor(1).seconds();
	       /* getDriver().close();
	        getDriver().switchTo().frame(nombreFrame+"1");
	        	getDriver().findElement(By.xpath("//*[@id='Administracion_Expander']")).click();
	        	waitFor(1).seconds();
	        	getDriver().findElement(By.xpath("//*[@id='Administracion_content']/div/div[1]")).click();
	        getDriver().switchTo().defaultContent();*/
	        
		}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}
	
	public void PerderOferta(String strMotivoPerder, String strDescripPerder) {
		try{ 
			
		    Serenity.takeScreenshot();
		    utilidad.esperaDesaparecer();
		    waitFor(2).second();
			findBy(btnPerder).click();
			//utilidad.esperaDesaparecer();
			waitFor(3).second();
			utilidad.esperaDesaparecer();
			//PANTALLA PARA LLENAR
			PantallaCierreOferta ( strMotivoPerder, strDescripPerder);	
				  //waitFor(2).seconds();
			  waitFor(5).seconds();
		        Serenity.takeScreenshot();
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
	
	public void PantallaCierreOferta(String strMotivoCierre, String strDescripCierre) {
		try{ 
			Robot robot = new Robot();
			waitFor(1).second();
	getDriver().switchTo().frame(ipsFrame);
	waitFor(1).second();
   
	find(By.xpath(strContenedorNotivo)).waitUntilVisible();
	find(By.xpath(strContenedorNotivo)).waitUntilEnabled();
	find(By.xpath(strContenedorNotivo)).click();
	robot.keyPress(KeyEvent.VK_F2);
    find(By.xpath(strInputMotivo)).sendKeys(Keys.ENTER);
				
	getDriver().findElement(By.xpath("//*[@id=\"itx_motivodecierreid_IMenu\"]/li["+strMotivoCierre+"]")).click();
	
	waitFor(1).second();
	
	find(By.xpath(strContenedorDescrip)).click();
	find(By.xpath(strTextareaDescrip)).typeAndEnter(strDescripCierre);
	
	getDriver().switchTo().defaultContent();
	
	getDriver().findElement(By.xpath(btnGuardarPant)).click();
	waitFor(5).second();
	  //utilidad.esperaDesaparecer();
		}
        
        
        catch(Exception ex){
     	   System.out.println(ex.getMessage()+"");  
        }	
		}
	
	
}
