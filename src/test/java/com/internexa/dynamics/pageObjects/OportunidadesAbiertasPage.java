package com.internexa.dynamics.pageObjects;

import static org.junit.Assert.fail;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OportunidadesAbiertasPage extends PageObject{
	
	public void nuevaOportunidad() {
        
        try{
        	
        	getDriver().navigate().refresh();
        	 waitFor(2).seconds();
               find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).waitUntilVisible();
               find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).waitUntilEnabled();
                find(By.id("crmTopBar")).setWindowFocus();
               find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).click();
        }
        catch(Exception ex){                    
               System.out.println(ex.getMessage()+"");  
               fail();
        }
        
  }

}