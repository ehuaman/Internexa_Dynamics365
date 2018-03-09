package com.internexa.dynamics;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)

//@CucumberOptions(features = "src/test/resources/features/Internexa/Dynamics/LoginDynamics.feature")

//@CucumberOptions (features = "src/test/resources/features/Internexa/Dynamics/LoginDynamics.feature", tags = "@GeneraOferta")
//Caso Producto 40 Internexa Last Mile Nacional
	//Caso de prueba Proyecto y Aprobación de Factibilidad
	//	@CucumberOptions (features = "src/test/resources/features/Internexa/Dynamics/LoginDynamics.feature", tags = "@CPOportunidadProyecto")
	//Caso de prueba Solución y Aprobación de Factibilidad
	   //@CucumberOptions (features = "src/test/resources/features/Internexa/Dynamics/LoginDynamics.feature", tags = "@CPOportunidadSolucion")
	//Caso de prueba Express
	  @CucumberOptions (features = "src/test/resources/features/Internexa/Dynamics/CasosGanarOferta.feature", tags = "@CPOportunidadExpres")



public class RunnerFeatures {

}
