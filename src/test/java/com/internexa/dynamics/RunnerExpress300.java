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
import cucumber.api.SnippetType;



@CucumberOptions (features = "src/test/resources/features/Internexa/Dynamics", tags = {"@CPOportunidadExpres300"}, monochrome= true)

@RunWith(RunnerPersonalizado.class)
public class RunnerExpress300 {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("./src/test/resources/features/Internexa/Dynamics");
	}

}
