package com.jupiter.pageObjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.jupiter.reuseableMethods.SendKeysClass;
import com.jupiter.testCases.BaseClass;




public class ShopPage extends BaseClass {

	WebDriver ldriver;

	public ShopPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath = "//a[@href='#/shop']")
	public WebElement headerShop;

	@FindBy(xpath = "//img[@src='images/src-embed/bunny.jpg']//following-sibling::p/a")
	public WebElement btnBuyFluffyBunny;

	@FindBy(xpath = "//img[@src='images/src-embed/cow.jpg']//following-sibling::p/a")
	public WebElement btnBuyFluffyCow;

	@FindBy(xpath = "//a[@href='#/cart']")
	public WebElement btnCart;

	@FindBy(xpath = "//img[@src='images/src-embed/bunny.jpg']")
	public WebElement imgBunny;

	@FindBy(xpath = "//img[@src='images/src-embed/bunny.jpg']")
	public WebElement imgCow;


	public void clickShop() throws IOException {

		try {

			if (headerShop.isDisplayed() && headerShop.isEnabled()) {

				headerShop.click();
				logger.info("Clicked on Shop");
				Reporter.log("Clicked on Shop");
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Shop");
			logger.info("Not Able to click on Shop");
			Reporter.log("Not Able to click on Shop");
			Assert.assertTrue(false);
		}

	}



	public void clickFluffyCow() throws IOException {

		try {

			if (btnBuyFluffyCow.isDisplayed() && btnBuyFluffyCow.isEnabled()) {

				for(int i=1;i<=2;i++)
				{					
					
					Thread.sleep(3000);
				btnBuyFluffyCow.click();
				logger.info("Clicked on btnBuyFluffyCow ");
				Reporter.log("Clicked on btnBuyFluffyCow");
				
				Assert.assertTrue(true);
				}

			}
		} catch (Exception e) {
			captureScreen(driver,"Shop");
			logger.info("Not Able to click on btnBuyFluffyCow");
			Reporter.log("Not Able to click on btnBuyFluffyCow");
			Assert.assertTrue(false);
		}

	}

	public void clickFluffyBunny() throws IOException {

		try {

			if (btnBuyFluffyBunny.isDisplayed() && btnBuyFluffyBunny.isEnabled()) {

				btnBuyFluffyBunny.click();
				
				logger.info("Clicked on btnBuyFluffyBunny");
				Reporter.log("Clicked on btnBuyFluffyBunny");
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Shop");
			logger.info("Not Able to click on btnBuyFluffyBunny");
			Reporter.log("Not Able to click on btnBuyFluffyBunny");
			Assert.assertTrue(false);
		}

	}

	
	public void clickCart() throws IOException {

		try {

			if (btnCart.isDisplayed() && btnCart.isEnabled()) {
				
				btnCart.click();
				logger.info("Clicked on Cart");
				Reporter.log("Clicked on Cart");
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Contact");
			logger.info("Not Able to click on Cart");
			Reporter.log("Not Able to click on Cart");
			Assert.assertTrue(false);
		}

	}
	
	
	
	
	
	public void validateIncart() throws IOException {

		try {
			if (imgBunny.isDisplayed() && imgBunny.isDisplayed()) {

				logger.info("Cow and Bunny Items added in the cart");
				Reporter.log("Cow and Bunny Items added in the cart");
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"btnSubmit");

			logger.info("Cow and Bunny Items are not in the cart");
			Reporter.log("Cow and Bunny Items are not in the cart");

			Assert.assertTrue(false);
		}

	}



}













