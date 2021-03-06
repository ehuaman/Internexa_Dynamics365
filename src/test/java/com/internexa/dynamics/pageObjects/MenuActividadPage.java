package com.internexa.dynamics.pageObjects;

import com.internexa.dynamics.HtmlTable;
import com.internexa.dynamics.toolBox.Utilidad;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class MenuActividadPage extends PageObject {
	Utilidad utilidad;
	public void misActividades() {
		getDriver().navigate().refresh();
		getDriver().switchTo().frame("contentIFrame0");
		
        waitFor(2).seconds();
		//*[@id="crmGrid_SavedNewQuerySelector"]/span[1]
		find(By.id("crmGrid_SavedNewQuerySelector")).waitUntilVisible();
		find(By.id("crmGrid_SavedNewQuerySelector")).waitUntilEnabled();
		find(By.id("crmGrid_SavedNewQuerySelector")).click();
		getDriver().switchTo().defaultContent();
	}
	
	public void correoElectronico() {
		getDriver().switchTo().frame("contentIFrame0");
        waitFor(2).seconds();
		//*[@id="ViewSelector_email"]/a[2]/span/nobr
		find(By.id("ViewSelector_email")).waitUntilVisible();
		find(By.id("ViewSelector_email")).waitUntilEnabled();
		find(By.id("ViewSelector_email")).click();
		getDriver().switchTo().defaultContent();
	}
	public void todosLosMensajes() {
		getDriver().switchTo().frame("contentIFrame0");
        waitFor(2).seconds();
        Integer intNumElementos;
		
        find(By.xpath("//*[@id='Dialog_ViewMenu_email']/div/ul/li[8]/a[2]/span/nobr/span")).waitUntilVisible();
		find(By.xpath("//*[@id='Dialog_ViewMenu_email']/div/ul/li[8]/a[2]/span/nobr/span")).waitUntilEnabled();
		find(By.xpath("//*[@id='Dialog_ViewMenu_email']/div/ul/li[8]/a[2]/span/nobr/span")).click();
		
		//PARA PORTUGUES
		HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
		if (TheTable.getRowElements().size()==0) {
			find(By.id("crmGrid_SavedNewQuerySelector")).click();
			find(By.id("ViewSelector_email")).click();
			find(By.xpath("//*[@id='Dialog_ViewMenu_email']/div/ul/li[7]/a[2]/span/nobr/span")).click();
			
		}
		
		//PARA INGLES
		HtmlTable TheTable1 = new HtmlTable(find(By.id("gridBodyTable")));
		if (TheTable1.getRowElements().size()==0) {
			find(By.id("crmGrid_SavedNewQuerySelector")).click();
			find(By.id("ViewSelector_email")).click();
			find(By.xpath("//*[@id='Dialog_ViewMenu_email']/div/ul/li[1]/a[2]/span/nobr/span")).click();
			
		}
		
		
		
		
		getDriver().switchTo().defaultContent();
	}

}
