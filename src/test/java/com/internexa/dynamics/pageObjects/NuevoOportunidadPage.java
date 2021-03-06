package com.internexa.dynamics.pageObjects;

import static org.junit.Assert.fail;

import org.openqa.selenium.support.ui.Select;
import com.internexa.dynamics.toolBox.Utilidad;
import com.internexa.dynamics.toolBox.GuardarCerrarToolBox;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NuevoOportunidadPage extends PageObject {
	Utilidad utilidad;
	GuardarCerrarToolBox guardarCerrrarToolBox;
	
	String idOportunidad= new String();
	static String NombreOportunidad;
	@FindBy(xpath="//input[@id='parentaccountid_ledit']")
	public WebElementFacade ingresaCuenta;
	String nombreFrame="contentIFrame";
		
	public void inputCuenta(String strCuenta) {
		try{ 
			
			utilidad.buscarIngresarFrame(nombreFrame);			
			//getDriver().switchTo().frame("contentIFrame1");
            //waitFor(2).seconds();
            utilidad.esperarObjeto(ingresaCuenta);
           
            ingresaCuenta.sendKeys(strCuenta);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
           }
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");  
        	   fail();
           }
	}
	
	
	public void inputNombre(String strNombre) {
		try{
			String HoraIngreso;
			HoraIngreso=utilidad.fechaHHmmss();
			
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(1).seconds();
         
            getDriver().findElement(By.xpath("//*[@id=\"name\"]/div[1]")).click();
            waitFor(1).seconds();
          //*[@id="Nombre_label"]
            NombreOportunidad=strNombre+" "+HoraIngreso;
            getDriver().findElement(By.xpath("//INPUT[@id='name_i']")).sendKeys(NombreOportunidad);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
            fail();
           }
	}


	public void listTipoVenta(String strTipoVenta) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(1).seconds();
			getDriver().findElement(By.xpath("//*[@id='itx_tipodeventa']/div[1]")).click();
	        waitFor(1).seconds();
	        new Select(getDriver().findElement(By.id("itx_tipodeventa_i"))).selectByVisibleText(strTipoVenta);
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
	
			}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");
        	   fail();
           }
		}
	

	public void inputFechaEstimadaVenta(String strFechaEstimadaVenta) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id='estimatedclosedate']/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='estimatedclosedate_iDateInput']")).sendKeys(strFechaEstimadaVenta);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
            fail();
           }
	}

	public void listProbabilidadExito(String strProbabilidadExito) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(1).seconds();
			getDriver().findElement(By.xpath("//*[@id=\"itx_probabilidaddeexito\"]/div[1]")).click();
	        waitFor(1).seconds();
	        new Select(getDriver().findElement(By.id("itx_probabilidaddeexito_i"))).selectByVisibleText(strProbabilidadExito);
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
			}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");
        	   fail();
           }
	}
	
	
	public void inputFechaEstimadaIngreso(String strFechaEstimadaIngreso) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id=\"itx_fechaestimadaingreso\"]/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='itx_fechaestimadaingreso_iDateInput']")).sendKeys(strFechaEstimadaIngreso);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
        	   System.out.println(ex.getMessage()+"");
        	   fail();
           }
	}
	
	
	public void listTipoOportunidad(String strlistTipoOportunidad) {
		try{
			getDriver().switchTo().frame("contentIFrame1");
	        waitFor(1).seconds();
			getDriver().findElement(By.xpath("//*[@id=\"itx_tipooportunidad\"]/div[1]")).click();
	        waitFor(1).seconds();
	        new Select(getDriver().findElement(By.id("itx_tipooportunidad_i"))).selectByVisibleText(strlistTipoOportunidad);
	        getDriver().switchTo().defaultContent();
	        waitFor(1).seconds();
	
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
            fail();
           }
	}
	
	public void inputContratoMeses(String strContratoMeses) {
		try{
            getDriver().switchTo().frame("contentIFrame1");
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//*[@id=\"itx_contratoameses\"]/div[1]")).click();
            waitFor(1).seconds();
            getDriver().findElement(By.xpath("//INPUT[@id='itx_contratoameses_i']")).sendKeys(strContratoMeses);
            waitFor(1).seconds();
            getDriver().switchTo().defaultContent();
            waitFor(1).seconds();
			}
           catch(Exception ex){
            System.out.println(ex.getMessage()+"");
            fail();
           }
		}
	
	public String btnGuardar() {
        try{
           //getDriver().findElement(By.xpath("//SPAN[@tabindex='-1'][text()=' Guardar ']")).click();
        	guardarCerrrarToolBox.btnGuardar();
           waitFor(2).seconds();
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
	        	 fail();
	        }
	        return idOportunidad;
		  }


	
}
