package com.internexa.dynamics.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.internexa.dynamics.HtmlTable;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ProductoEditarPage extends PageObject {

	 public void encontrarOportunidad() {
		 String element = new String();
		 try {
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(2).seconds();
	        //find(By.xpath("//*[@id=\"contentIFrame1\"]")).waitUntilVisible();
	        //getDriver().switchTo().frame("contentIFrame1");
	        //waitFor(1).seconds();
	        WebElement table = getDriver().findElement(By.xpath("//TABLE[@id='{8b2e65b0-d8ce-1ddb-8dee-b8e406e1d0d2}']"));                     
	        HtmlTable TheTable = new HtmlTable(table);
	        int i=1;
	        do {
               System.out.println("row " +i);
               element = find(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[4]/div")).getText();
               if (element.equals("Si")) {                               
            	   System.out.println(element+"Cambiar");
               } else { 
            	   i++;                              
               }                   
	        }while(i<=TheTable.getRowElements().size());
	        	System.out.println(element+"NO cambiar");
		 	}catch (Exception ex) {
		        System.out.println(ex.getMessage() + "");
			 }
	 	}
	}

