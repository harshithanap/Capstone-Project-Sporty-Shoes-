package com.harshi.cucumber.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
 
@CucumberOptions(features = "src/test/resources/Features", glue =
{"Capstone-Project-1_cucumber/src/test/java/com/harshi/cucumber/Capstone_Project_1_cucumber" }) 
public class TestRunner {

}
