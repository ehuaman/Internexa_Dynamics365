/**
 * @since 27/11/2017
 */
package com.internexa.dynamics;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import com.internexa.dynamics.toolBox.BeforeSuite;
import com.internexa.dynamics.toolBox.DataToFeature;

import cucumber.api.CucumberOptions;

@CucumberOptions (features = "src/test/resources/features/Internexa/Dynamics", tags = {"@CPGEneralSolucionProyectoConFactibilidad"}, monochrome= true)

@RunWith(RunnerPersonalizado.class)
public class RunnerProycSolFactibilidad {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("./src/test/resources/features/Internexa/Dynamics");
	}

}
