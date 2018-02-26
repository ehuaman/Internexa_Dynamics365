package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

	public class MenuOportunidadPage extends PageObject{

		
		public static final String NombreOportunidad = null;

		public void venta() {
			find(By.id("TabSFA")).waitUntilVisible();
			find(By.id("TabSFA")).waitUntilEnabled();
			find(By.id("TabSFA")).click();
		}
		
		public void oportunidad() {
			find(By.id("nav_oppts")).waitUntilVisible();
			find(By.id("nav_oppts")).waitUntilEnabled();
			find(By.id("nav_oppts")).click();
			waitFor(4).seconds();
		}
		
		public void factibilidad() {
			find(By.id("itx_factibilidad")).waitUntilVisible();
			//find(By.id("itx_factibilidad")).waitUntilEnabled();
			find(By.id("itx_factibilidad")).click();
			waitFor(4).seconds();
		}
		
		//*[@id="nav_activities"]
		public void actividades() {
			find(By.id("nav_activities")).waitUntilVisible();
			//find(By.id("itx_factibilidad")).waitUntilEnabled();
			find(By.id("nav_activities")).click();
			waitFor(4).seconds();
		}
	}
