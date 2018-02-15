package com.internexa.dynamics.toolBox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class Utilidad extends PageObject {
	
	public void dobleClick(String XpathElemento) { 
		
		Actions action = new Actions(getDriver());
		WebElement btn = getDriver().findElement(By.xpath(XpathElemento));
		action.doubleClick(btn).perform();	
	}
	
	
}
