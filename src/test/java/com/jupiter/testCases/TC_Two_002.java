package com.jupiter.testCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jupiter.pageObjects.ContactPage;

public class TC_Two_002 extends BaseClass{

	@Test
	public void testCase02() throws IOException 
	{
		try {


			driver.get(baseURL);
			logger.info("URL is opened");
			Thread.sleep(2000);

			ContactPage cp=new ContactPage(driver);

			//1.	From the home page go to contact page
			cp.clickContact();
			logger.info("Automated Contact In Header");
			Reporter.log("Automated Contact  In Header");


			//2.	Populate mandatory fields
			cp.submitValidData();
			logger.info("Automated- Submitting contact Details");
			Reporter.log("Automated- Submitting contact Details");

			

			//4.	Validate successful submission message
			cp.validateContact();
			logger.info("Automated- Validated Creating Contact");
			Reporter.log("Automated- Validated Creating Contact");


		} catch (Exception e) {
			logger.info("Not able to Automate Contact");
			Reporter.log("Not able to Automate Contact");
		} 

	}
}