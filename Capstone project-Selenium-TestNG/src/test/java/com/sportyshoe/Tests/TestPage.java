package com.sportyshoe.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage extends BaseTest {
	@Test
	public void test() throws InterruptedException
	{
	
		RegisterPage page = new RegisterPage(driver);
		page.registerPage();
		page.EnterName();
		page.EnterEmail();
		page.EnterPassword();
		Thread.sleep(3000);
		page.clickRegisterBtn();
	
		AddToCart add = new AddToCart(driver);
		add.clickprofile();
		add.clickHome();
		add.clickAddToCart();
		//add.addSecondItem();
		String expectedErrMsg = "Message:Shoe Elegant Leather Loafers Added Successfully to Cart";
		String acutalErrMsg = add.CheckVerifyCartMsg();
		Assert.assertEquals(acutalErrMsg, expectedErrMsg);
		
		ViewCartPage cart = new ViewCartPage(driver);
		cart.clickHomeBtn();
		cart.clickCartBtn();
		
		PlaceOrder placeOrder = new PlaceOrder(driver);
		placeOrder.clickPlaceOrderBtn();
		String expectedMsg = "Success!";
		String acutalMsg = placeOrder.CheckVerifyOrderMsg();
		Assert.assertEquals(acutalMsg, expectedMsg);
		
	}
}


