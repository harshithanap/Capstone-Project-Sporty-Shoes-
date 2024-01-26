package com.sportyshoe.Tests;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AddToCart  {
	Actions actions;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public AddToCart(WebDriver driver)
	{
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver,this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	@FindBy(css = "#mynavbar > ul > li:nth-child(3) > a")
	private WebElement profile;
	
	public void clickprofile()
	{
		profile.click();
	}
	
	@FindBy(css = "#mynavbar > ul > li:nth-child(1) > a")
	private WebElement home;
	
	public void clickHome()
	{
		home.click();
	}

	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary')])[2]")
	private WebElement firstItem;
	
	public void clickAddToCart() throws InterruptedException 
	{
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", firstItem);
		js.executeScript("arguments[0].click()", firstItem);
	}

	
//	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary')])[2]")
//	private WebElement secItem;
//	
//	public void addSecondItem()
//	{
//		js.executeScript("arguments[0].scrollIntoView();", firstItem);
//		js.executeScript("arguments[0].click()", firstItem);
//	}
//	
//	@FindBy(xpath = "//p[text()=\"Message:Shoe BlueWave Running Shoes Added Successfully to Cart\"]")
	@FindBy(xpath = "/html/body/div[3]/div/p")
	private WebElement verifycartmsg;
	
	public String CheckVerifyCartMsg()
	{
		String textmsg = verifycartmsg.getText();
		return textmsg;
	}
}
