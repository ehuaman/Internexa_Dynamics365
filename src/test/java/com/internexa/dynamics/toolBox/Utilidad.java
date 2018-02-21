package com.internexa.dynamics.toolBox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.log.Log;
import com.internexa.dynamics.HtmlTable;

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
	}
	
	public void buscarEnGrid(String strBuscar) {
		 String element = new String();
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
	
	
}
