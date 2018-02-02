package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

	public class MenuOportunidadPage extends PageObject{

		
		public void venta() {
			find(By.id("TabSFA")).waitUntilVisible();
			find(By.id("TabSFA")).waitUntilEnabled();
			find(By.id("TabSFA")).click();
		}
		
		public void oportunidad() {
			find(By.id("nav_oppts")).waitUntilVisible();
			find(By.id("nav_oppts")).waitUntilEnabled();
			find(By.id("nav_oppts")).click();
		}
	}
