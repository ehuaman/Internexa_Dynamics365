package com.internexa.dynamics.toolBox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//FECHA
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidad extends PageObject {
	String imgEsperar = "//*[@id='DialogLoadingDivImg']";
	
	public void dobleClick(String XpathElemento) { 
		
		Actions action = new Actions(getDriver());
		WebElement btn = getDriver().findElement(By.xpath(XpathElemento));
		action.doubleClick(btn).perform();	
	}
	
	public void esperaDesaparecer() {
		waitForAbsenceOf(imgEsperar);
	}	
	
	public void mouseClickByLocator( String cssLocator ) {
	     String locator = cssLocator;
	     WebElement el = getDriver().findElement( By.cssSelector( locator ) );
	     Actions builder = new Actions(getDriver());
	     builder.moveToElement( el ).click( el );
	     builder.perform();
	}
	
	public void cerrarSesion() {
		
		find(By.xpath("//*[@id='navTabButtonChangeProfileImageLink']")).click();
    	waitFor(2).seconds();
    	find(By.xpath("//*[@id='navTabButtonUserInfoSignOutId']")).waitUntilVisible();
		find(By.xpath("//*[@id='navTabButtonUserInfoSignOutId']")).waitUntilEnabled();
    	Serenity.takeScreenshot();
    	find(By.xpath("//*[@id='navTabButtonUserInfoSignOutId']")).click();
    	waitFor(2).seconds();
    	getDriver().quit();
	}
	
	public void buscarEnGrid(String strBuscar) {
		 
		 try {
			 //ENVIAR UN F5
			 
			 getDriver().navigate().refresh();
			 waitFor(2).seconds();
			 find(By.id("contentIFrame0")).waitUntilVisible();
		        getDriver().switchTo().frame("contentIFrame0");
	
				 find(By.xpath("//*[@id='crmGrid_findCriteria']")).sendKeys(strBuscar);
				 getDriver().findElement(By.id("crmGrid_findCriteria")).sendKeys(Keys.ENTER);
				 
				 Serenity.takeScreenshot();
				 
				 find(By.xpath("//*[@id='gridBodyTable']/tbody/tr/td[2]/nobr")).click();
				 dobleClick("//*[@id='gridBodyTable']/tbody/tr/td[2]/nobr");
			
		        waitFor(1).seconds();
		        getDriver().switchTo().defaultContent();
		        waitFor(1).seconds();
		       
		 } catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
		 }
	}
	//*[@id="itx_factibilidad"]
	public String fechaHHmmss () {
		
		Date date = new Date();
		//Caso 1: obtener la hora y salida por pantalla con formato:
		//DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		//System.out.println("Hora: "+hourFormat.format(date));
		//Caso 2: obtener la fecha y salida por pantalla con formato:
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println("Fecha: "+dateFormat.format(date));
		//Caso 3: obtenerhora y fecha y salida por pantalla con formato:
		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		return hourdateFormat.format(date);

		}
	public void esperarObjeto (WebElement  xpathElemento) {
		
		try{ 
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.visibilityOf(xpathElemento));
		}
        
        catch(Exception ex){                    
        	 System.out.println(ex.getMessage()+"");  
        }
		
		}
	public void buscarIngresarFrame (String nombreFrame) {
		
		try{ 
			getDriver().switchTo().frame(nombreFrame+"1");
		}
        
        catch(Exception ex){                    
        	getDriver().switchTo().frame(nombreFrame+"0");
        }
		
		}
	public void focusFrame (String nombreFrame) {
		
		try{ 
			find(By.id(nombreFrame+"1")).setWindowFocus();
		}
        
        catch(Exception ex){                    
        	find(By.id(nombreFrame+"0")).setWindowFocus();
        }
		
		}
}
