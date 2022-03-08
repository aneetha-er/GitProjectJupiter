package com.jupiter.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jupiter.pageObjects.ContactPage;


public class TC_One_001 extends BaseClass
{

	@Test(priority=1)
	public void testCase01() throws IOException 
	{
		try {
				
						
			driver.get(baseURL);
			logger.info("URL is opened");
			Thread.sleep(2000);
			
			ContactPage cp=new ContactPage(driver);
			
			//1.From the home page go to contact page
			cp.clickContact();
			logger.info("Automated Click on Contact");
			Reporter.log("Automated Click on Contact");
			
			
			//2.Click submit button
			cp.clickSubmit();
			logger.info("Automated Click on Submit");
			Reporter.log("Automated Click on Submit");
			
			//3.Validate errors
			cp.validateError();
			logger.info("Automated- validateERROR");
			Reporter.log("Automated - validateERROR");
			
			//4.Populate mandatory fields
			cp.populateForname();
			logger.info("Automated- populate Mandatory text Forname");
			Reporter.log("Automated- populate Mandatory text  Forname");
			
			//4.Populate mandatory fields
			cp.populateEmail();
			logger.info("Automated- populate Mandatory text  Email");
			Reporter.log("Automated- populate Mandatory text  Email");
			
			//4.Populate mandatory fields
			cp.populateMessage();
			logger.info("Automated- populate Mandatory text  Message");
			Reporter.log("Automated- populate Mandatory text  Message");
			
			//2.Enter Valid data
			cp.submitValidData();
			logger.info("Automated- Submitting contact Details");
			Reporter.log("Automated- Submitting contact Details");

			
			
			//5.Validate errors are gone
			cp.validateAlertInfo();
			logger.info("Automated- Validate errors are gone");
			Reporter.log("Automated- Validate errors are gone");
			
			
	

		} catch (Exception e) {
			logger.info("Not able to Automate Contact");
			Reporter.log("Not able to Automate Contact");
		} 
	}
}