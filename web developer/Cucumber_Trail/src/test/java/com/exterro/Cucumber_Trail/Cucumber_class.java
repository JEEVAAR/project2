package com.exterro.Cucumber_Trail;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/exterro/Resource/Feature1.feature",glue= {"Cucumber_Trail"})
public class Cucumber_class {
}
