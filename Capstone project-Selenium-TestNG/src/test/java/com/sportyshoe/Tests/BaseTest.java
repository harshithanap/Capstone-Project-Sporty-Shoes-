package com.sportyshoe.Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseTest {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApplication()
	{
		//Open the Browser
		driver = new ChromeDriver();
		
		//Maximize it
		driver.manage().window().maximize();
		
		//Navigate to Application
		driver.get("http://localhost:9010/");
	}
	
	@AfterTest
	public void closeBrowser()
   {
	driver.quit();
	}
}
