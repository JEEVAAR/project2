package com.exterro.Trail_2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/exterro/Resource/Trail_2.feature",glue= {"Trail_2"})
public class Runner {

}


