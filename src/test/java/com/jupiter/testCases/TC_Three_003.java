package com.jupiter.testCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jupiter.pageObjects.ContactPage;

public class TC_Three_003  extends BaseClass{

	@Test
	public void testCase03() throws IOException 
	{
		try {


			driver.get(baseURL);
			logger.info("URL is opened");
			Thread.sleep(2000);

			ContactPage cp=new ContactPage(driver);

			//1.	From the home page go to contact page
			cp.clickContact();
			logger.info("Automated Click on Contact");		
			Reporter.log("Automated Click on Contact");

			//2.	Populate mandatory fields with invalid data

			cp.submitInvalidData();
			logger.info("Automated INVALID DATA");		
			Reporter.log("Automated INVALID DATA");


			//3.	Validate errors
			cp.validateError();
			logger.info("Automated- validateERROR");
			Reporter.log("Automated - validateERROR");



		} catch (Exception e) {
			logger.info("Not able to Automate Contact");
			Reporter.log("Not able to Automate Contact");
		}

	}
}