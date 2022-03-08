package com.jupiter.testCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jupiter.pageObjects.ContactPage;
import com.jupiter.pageObjects.ShopPage;

public class TC_Four_004 extends BaseClass{

	@Test
	public void testCase04() throws IOException 
	{
		try {


			driver.get(baseURL);
			logger.info("URL is opened");
			Thread.sleep(2000);

			ShopPage sp=new ShopPage(driver);

			//1.	From the home page go to shop page
			sp.clickShop();
			logger.info("Automated Click on Shop ");		
			Reporter.log("Automated Click on Shop ");

			//2.	Click buy button 2 times on “Funny Cow”
			sp.clickFluffyCow();
			logger.info("Automated Click on Fluffy Cow");		
			Reporter.log("Automated Click on Fluffy Cow");
			
			//3.	Click buy button 1 times on “Funny Bunny”
			sp.clickFluffyBunny();
			logger.info("Automated Click on Fluffy Bunny");		
			Reporter.log("Automated Click on Fluffy Bunny");
			
			
			//4.	Click the cart menu
			sp.clickCart();
			logger.info("Automated Click on Cart");
			Reporter.log("Automated Click on Cart");
	
			//5.	Verify the items are in the cart
			sp.validateIncart();
			logger.info("Automated Items are Displayed in card or not");
			Reporter.log("Automated Items are Displayed in card or not");
			
			
		} catch (Exception e) {
			logger.info("Not able to Automate Shop");
			Reporter.log("Not able to Automate Shop");
		}

	}
}
