package com.internexa.dynamics.pageObjects;

import com.internexa.dynamics.HtmlTable;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys; 

public class OportunidadPage extends PageObject{
	static String codigoProductoRegistar;
	
	public void agregarProducto() {
		try{ 
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(2).seconds();
			find(By.xpath("//*[@id=\"titleContainer_opportunityproductsGrid\"]")).waitUntilVisible();
			find(By.xpath("//*[@id=\"titleContainer_opportunityproductsGrid\"]")).waitUntilEnabled();
			find(By.xpath("//*[@id=\"titleContainer_opportunityproductsGrid\"]")).click();
			waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id=\"opportunityproductsGrid_addImageButton\"]")).click();
            waitFor(2).seconds();
            find(By.id("ExistingProduct")).click();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
           }
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
           }	
		}

	public void registrarProducto(String productoRegistrar) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(2).seconds();
	        find(By.id("lookup_opportunityproductsGrid_ledit")).setWindowFocus();
	        
	        codigoProductoRegistar=productoRegistrar;
	        getDriver().findElement(By.id("lookup_opportunityproductsGrid_ledit")).sendKeys(productoRegistrar);
	        
	        //::Audy Ch: 201/02/02:: Tomar Evidencias
	        Serenity.takeScreenshot();
	        
	        getDriver().findElement(By.id("lookup_opportunityproductsGrid_ledit")).sendKeys(Keys.ENTER); 
	        find(By.xpath("//*[@id=\"item0\"]/a[2]")).waitUntilVisible();
	        find(By.xpath("//*[@id=\"item0\"]/a[2]")).waitUntilEnabled();
	        getDriver().findElement(By.xpath("//*[@id=\"item0\"]/a[2]")).click();
			waitFor(3).seconds();
			      
	        getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			
		}catch(Exception ex){
	 	   System.out.println(ex.getMessage()+"");
	    }
		
	}
	
	//propiedades producto
	public void verificarEstadoProducto() {
        try {        
               getDriver().switchTo().frame("contentIFrame1");
               waitFor(1).seconds();             
               HtmlTable TheTable = new HtmlTable(find(By.id("gridBodyTable")));
               String element = new String();
              
               int i=1;
               int intCatidadElementos;
               do {
                      element = find(By.xpath("//*[@id='gridBodyTable']/tbody/tr["+i+"]/td[4]/div[1]")).getText();
                      intCatidadElementos=TheTable.getRowElements().size();
                     
                      if (element.equals("No") || element.equals("Não") ) {
                            // System.out.println(find(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[8]")).getText());
                             find(By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr["+i+"]/td[8]/nobr/a/li/span/span/span[2]")).click();
                             waitFor(3).second();
                      }            
                      i++;
               }while(i<=intCatidadElementos) ;
               getDriver().switchTo().defaultContent();
               waitFor(1).seconds();
        }catch (Exception ex) {
               System.out.println(ex.getMessage() + "");
        }
  }

	
}
