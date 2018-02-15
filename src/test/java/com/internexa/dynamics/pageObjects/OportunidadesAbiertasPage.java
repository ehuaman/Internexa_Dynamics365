package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OportunidadesAbiertasPage extends PageObject{
	
	public void nuevaOportunidad() {
        
        try{
        	//*[@id="navBarOverlay"]
        	
        	        	//aaa=getDriver().findBy("//*[@id='navBarOverlay']").getClass().getComponentType();
        	
        	/**if(findBy("//*[@id='navBarOverlay']").isPresent() && find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).isCurrentlyEnabled())
			{
        	//	find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).click();
        		find(By.id("//*[@id='navBarOverlay']")).click();
			}
			*/
               find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).waitUntilVisible();
               find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).waitUntilEnabled();
                find(By.id("crmTopBar")).setWindowFocus();
               find(By.id("opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord")).click();
        }
        catch(Exception ex){                    
               System.out.println(ex.getMessage()+"");               
        }
        
  }

}