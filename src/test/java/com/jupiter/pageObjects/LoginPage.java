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




public class LoginPage extends BaseClass {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	/*@FindBy(how = How.ID, using = "mat-input-0")
	@CacheLookup
	public WebElement txtUserName;

	@FindBy(id = "mat-input-1")
	public WebElement txtPassword;*/

	@FindBy(xpath = "//a[@href='#/contact']")
	public WebElement headerContact;

	@FindBy(xpath = "//a[text()='Submit']")
	public WebElement btnSubmit;

	@FindBy(xpath = "//div[@class='alert alert-error ng-scope']")
	public WebElement errorText;

	@FindBy(xpath = "//span[@id='forename-err']")
	public WebElement errorTxtForeName;

	@FindBy(xpath = "//span[@id='email-err']")
	public WebElement errorTxtEmail;

	@FindBy(xpath = "//span[@id='message-err']")
	public WebElement errorTxtMessage;
	
	@FindBy(xpath = "//input[@id='forename']")
	public WebElement txtForeName;
	
	@FindBy(xpath = "//input[@id='surname']")
	public WebElement txtSurName;
	
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='telephone']")
	public WebElement txtTelepnone;
	
	@FindBy(xpath = "//textarea[@id='message']")
	public WebElement txtMessage;
	
	@FindBy(xpath = "//div[@class='alert alert-info ng-scope']")
	public WebElement txtAlertInfo;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement txtSuccessMsg;
	
	
	
	
	
	public void submitFeedback() throws IOException, InterruptedException {

		SendKeysClass.sendKeysMethod(txtForeName, "NameTest", "txtForeName");
		SendKeysClass.sendKeysMethod(txtSurName, "SurName", "txtSurName");
		SendKeysClass.sendKeysMethod(txtEmail, "test@gmail.com", "txtEmail");
		SendKeysClass.sendKeysMethod(txtTelepnone, "0430256359", "txtTelepnone");
		SendKeysClass.sendKeysMethod(txtMessage, "Testing Message", "txtMessage");
				
		Thread.sleep(4000);
		
		btnSubmit.click();
	
	}

	
	
	public void validateContact() throws IOException {

		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(txtSuccessMsg));
			

			String actValue=txtSuccessMsg.getText();
			System.out.println("Actucalvalue:"+actValue);
			String expectedValue=", we appreciate your feedback.";

			if (actValue.contains(expectedValue)) {
				logger.info("Successfully Created Contact"+actValue);
				Reporter.log("Successfully Created Contact"+actValue);
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Contact");
			logger.info("Unsuccessful-Creation of contact");
			Reporter.log("Unsuccessful-Creation of contact");
			Assert.assertTrue(false);
		}

	}

	public void clickContact() throws IOException {

		try {

			if (headerContact.isDisplayed() && headerContact.isEnabled()) {
				
				headerContact.click();
				logger.info("Clicked on Contact");
				Reporter.log("Clicked on Contact");
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Contact");
			logger.info("Not Able to click on Contact");
			Reporter.log("Not Able to click on Contact");
			Assert.assertTrue(false);
		}

	}

	public void clickSubmit() throws IOException {

		try {
			if (btnSubmit.isDisplayed() && btnSubmit.isEnabled()) {
				Thread.sleep(5000);
				btnSubmit.click();
				logger.info("Clicked on btnSubmit:");
				Reporter.log("Clicked on btnSubmit:");
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"btnSubmit");
			logger.info("NOT able to Click on btnSubmit");
			Reporter.log("NOT able  to Click on btnSubmit");
			Assert.assertTrue(false);
		}

	}

	public void validateError() throws IOException {

		try {

			String actValue=errorText.getText();
			System.out.println("Actucalvalue:"+actValue);
			String expectedValue="but we won't get it unless you complete the form correctly";

			if (actValue.contains(expectedValue)) {
				logger.info("Validated Error Message"+actValue);
				Reporter.log("Validated Error Message"+actValue);
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Contact");
			logger.info("Not able to Validated Error Message");
			Reporter.log("Not able to Validated Error Message");
			Assert.assertTrue(false);
		}

	}

	public void populateForname() throws IOException {

		try {

			String actValue=errorTxtForeName.getText();
			System.out.println("errorTxtForeName:"+errorTxtForeName);
			String expectedValue="Forename is required";

			if (actValue.contains(expectedValue)) {
				logger.info("Populated Mandatory Text:"+actValue);
				Reporter.log("Populated Mandatory Text:"+actValue);
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"ForeName");
			logger.info("NOT ABLE to Populated Mandatory Text-Forename is required ");
			Reporter.log("NOT ABLE to Populated Mandatory Text-Forename is required ");
			Assert.assertTrue(false);
		}

	}
	
	
	
	public void populateEmail() throws IOException {

		try {

			String actValue=errorTxtEmail.getText();
			System.out.println("errorTxtEmail:"+actValue);
			String expectedValue="Email is required";

			if (actValue.contains(expectedValue)) {
				logger.info("Populated Mandatory Text:"+actValue);
				Reporter.log("Populated Mandatory Text:"+actValue);
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Contact");
			logger.info("NOT ABLE to Populated Mandatory Text-Email Required");
			Reporter.log("NOT ABLE to Populated Mandatory Text-Email Required");
			Assert.assertTrue(false);
		}

	}
	
	
	
	public void populateMessage() throws IOException {

		try {

			String actValue=errorTxtMessage.getText();
			System.out.println("errorTxtMessage:"+actValue);
			String expectedValue="Message is required";

			if (actValue.contains(expectedValue)) {
				logger.info("Populated Mandatory Text:"+actValue);
				Reporter.log("Populated Mandatory Text:"+actValue);
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"Populate-Message");
			logger.info("NOT ABLE to Populate Mandatory-Message");
			Reporter.log("NOT ABLE to Populate Mandatory-Message");
			Assert.assertTrue(false);
		}

	}
	

	public void validateAlertInfo() throws IOException {

		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(txtAlertInfo));
			

			String actValue=txtAlertInfo.getText();
			System.out.println("Actucalvalue:"+actValue);
			String expectedValue="- tell it how it is";

			if (actValue.contains(expectedValue)) {
				logger.info("Successfully Validated Alert Info"+actValue);
				Reporter.log("Successfully Validated Alert Info"+actValue);
				Assert.assertTrue(true);

			}
		} catch (Exception e) {
			captureScreen(driver,"AlertInfo");
			logger.info("Unsuccessful-Alert Info");
			Reporter.log("Unsuccessful-Alert Info");
			Assert.assertTrue(false);
		}

	}
	
	

}









