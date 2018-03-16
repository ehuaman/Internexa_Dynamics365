package com.internexa.dynamics;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(features = "src/test/resources/features/Internexa/Dynamics/LoginDynamics.feature ", tags = {"@CPGEneralSolucionProyectoConFactibilidad" })


public class RunnerFeatures {

}
