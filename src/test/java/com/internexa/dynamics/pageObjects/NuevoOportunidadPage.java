package com.internexa.dynamics.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.log.Log;
import com.internexa.dynamics.HtmlTable;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class NuevoOportunidadPage extends PageObject {
	
	String idOportunidad= new String();
		
	public void inputCuenta(String strCuenta) {
		try{ 
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
            //getDriver().findElement(By.xpath("//*[@id=\"parentaccountid\"]/div[1]")).click();
            //waitFor(1).seconds();
            getDriver().findElement(By.xpath("//input[@id='parentaccountid_ledit']")).sendKeys(strCuenta);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
           }
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }
	}
	
	
	public void inputNombre(String strNombre) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
            getDriver().findElement(By.xpath("//*[@id=\"name\"]/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='name_i']")).sendKeys(strNombre);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
           }
	}


	public void listTipoVenta(String strTipoVenta) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(2).seconds();
			getDriver().findElement(By.xpath("//*[@id='itx_tipodeventa']/div[1]")).click();
	        waitFor(1).seconds();
	        new Select(getDriver().findElement(By.id("itx_tipodeventa_i"))).selectByVisibleText(strTipoVenta);
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
	
			}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");
           }
		}
	

	public void inputFechaEstimadaVenta(String strFechaEstimadaVenta) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
            getDriver().findElement(By.xpath("//*[@id='estimatedclosedate']/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='estimatedclosedate_iDateInput']")).sendKeys(strFechaEstimadaVenta);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
           }
	}

	public void listProbabilidadExito(String strProbabilidadExito) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(2).seconds();
			getDriver().findElement(By.xpath("//*[@id=\"itx_probabilidaddeexito\"]/div[1]")).click();
	        waitFor(1).seconds();
	        new Select(getDriver().findElement(By.id("itx_probabilidaddeexito_i"))).selectByVisibleText(strProbabilidadExito);
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
			}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");
           }
	}
	
	
	public void inputFechaEstimadaIngreso(String strFechaEstimadaIngreso) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
            getDriver().findElement(By.xpath("//*[@id=\"itx_fechaestimadaingreso\"]/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='itx_fechaestimadaingreso_iDateInput']")).sendKeys(strFechaEstimadaIngreso);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");
           }
	}
	
	
	public void listTipoOportunidad(String strlistTipoOportunidad) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(2).seconds();
			getDriver().findElement(By.xpath("//*[@id=\"itx_tipooportunidad\"]/div[1]")).click();
	        waitFor(1).seconds();
	        new Select(getDriver().findElement(By.id("itx_tipooportunidad_i"))).selectByVisibleText(strlistTipoOportunidad);
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
	
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
           }
	}
	
	public void inputContratoMeses(String strContratoMeses) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
            getDriver().findElement(By.xpath("//*[@id=\"itx_contratoameses\"]/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='itx_contratoameses_i']")).sendKeys(strContratoMeses);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
           }
		}
	
	public String btnGuardar() {
        try{
           getDriver().findElement(By.xpath("//SPAN[@tabindex='-1'][text()=' Guardar ']")).click();
           waitFor(4).seconds();
           while (idOportunidad==null||idOportunidad.isEmpty()) {             
                  getDriver().switchTo().frame("contentIFrame1");
                  waitFor(1).seconds();
                  getDriver().findElement(By.xpath("//*[@id=\"itx_idoportunidad\"]/div[1]")).click();
                  waitFor(1).seconds();
                  idOportunidad=getDriver().findElement(By.xpath("//*[@id=\"itx_idoportunidad\"]/div[1]/label[1]")).getText();                           
                  getDriver().switchTo().defaultContent();
                  waitFor(1).seconds();
	               }  
	        }
	        catch(Exception ex){                    
	        	System.out.println(ex.getMessage()+"");               
	        }
	        return idOportunidad;
		  }

	
	public void btnGuardarYCerrar() {
		getDriver().findElement(By.xpath("//SPAN[@tabindex='-1'][text()=' Guardar y cerrar ']")).click();
		
	}
	
	//Función a parte para tener el cuenta el frame, si se hace en una misma ralentiza aun mas la carga
	public int conocerTamaño(){
		getDriver().switchTo().frame("contentIFrame0");//La tabla esta dentro del iFrame0
        waitFor(1).seconds();
		HtmlTable theTable = new HtmlTable(find(By.xpath("//*[@id=\"gridBodyTable\"]"))); //Tabla
		int tamaño = theTable.getRowElements().size(); //Se conoce el tamaño.
		getDriver().switchTo().defaultContent();
        waitFor(1).seconds();
        return tamaño; // Retorna el valor a usar en la siguiente funcion.
	}
	
    public void encontrarOportunidad(String idOportunidad) {
		 String element = new String();
		 try {
		        find(By.id("contentIFrame0")).waitUntilVisible();
		        getDriver().switchTo().frame("contentIFrame0");
		        waitFor(1).seconds();
		        WebElement table = getDriver().findElement(By.id("gridBodyTable"));                     
		        HtmlTable TheTable = new HtmlTable(table);
		        int i=1;
		        boolean found = true;
		        do {
		               // Campo ID DE OPORTUNIDAD
		               System.out.println("row " +i);
		               element = find(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[2]/nobr/span")).getText();
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
		        waitFor(1).seconds();
		        getDriver().switchTo().defaultContent();
		        waitFor(1).seconds();
		 } catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
		 }
}


	
}
