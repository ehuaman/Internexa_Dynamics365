package com.internexa.dynamics.steps;

import com.internexa.dynamics.pageObjects.MenuActividadPage;

public class MenuActividadesSteps  {
	MenuActividadPage menuActividadPage;
	
	public void ingresarTodosLosMensajes() {
		
		menuActividadPage.misActividades();
		menuActividadPage.correoElectronico();
		menuActividadPage.todosLosMensajes();
	}
	
}
