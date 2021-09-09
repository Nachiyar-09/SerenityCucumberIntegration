package com.Insurance.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/Feature",
        glue="com.Insurance.stepDefinition")

public class VehicleRunner {

}
