package com.sportyshoe.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewCartPage {
	
WebDriverWait wait;
	
	public ViewCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	@FindBy(xpath = "(//a[contains(@class,'nav-link')])[1]")
	private WebElement homebtn;
	
	public void clickHomeBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		homebtn.click();
	}
	
	@FindBy(xpath = "(//a[contains(@class,'nav-link')])[1]")
	private WebElement cartbtn;
	
	public void clickCartBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		cartbtn.click();
	}
}


