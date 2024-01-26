package com.sportyshoe.Tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {


	Actions actions;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public PlaceOrder(WebDriver driver)
	{
		js=(JavascriptExecutor)driver;
		PageFactory.initElements(driver,this);
		actions =new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary')])[1]")
	private WebElement placeOrderBtn;
	
	public void clickPlaceOrderBtn()throws InterruptedException 
	{
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",placeOrderBtn);
		js.executeScript("arguments[0].click()",placeOrderBtn);
	}
	
	
	@FindBy(xpath = "/html/body/div[3]/div/strong")
	private WebElement verifyorderMsg;
	

	public String CheckVerifyOrderMsg() 
	{
		String message = verifyorderMsg.getText();
		return message;
	}
}

