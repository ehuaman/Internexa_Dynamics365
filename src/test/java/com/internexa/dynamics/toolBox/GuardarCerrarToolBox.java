package com.internexa.dynamics.toolBox;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.log.Log;
import com.internexa.dynamics.HtmlTable;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class GuardarCerrarToolBox extends PageObject {

	public void btnGuardarCerrar() {
		getDriver().findElement(By.xpath("//SPAN[@tabindex='-1'][text()=' Guardar y cerrar ']")).click();
		
	}
}

