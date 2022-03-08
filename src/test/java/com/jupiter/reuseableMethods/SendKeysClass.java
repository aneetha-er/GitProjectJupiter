package com.jupiter.reuseableMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.jupiter.testCases.BaseClass;



public class SendKeysClass extends BaseClass{
	
	public static void sendKeysMethod(WebElement Element,String txtFieldValue,String methodName) throws IOException {

		CharSequence textField;
		try {
			if (Element.isDisplayed() && Element.isEnabled()) {
				// SeleniumReusablies.highLightElement(userName);
				Element.clear();
				Element.sendKeys(txtFieldValue);
			    logger.info("Entered data in textBox:"+methodName);
			    Reporter.log("Entered data in textBox:"+methodName);
		
			}
		} catch (Exception e) {
						
			captureScreen(driver,methodName);
			logger.info("Unable to enter data in textBox:"+methodName);
			Reporter.log("Unable to enter data in textBox:"+methodName);
		//	Assert.assertTrue(false);
	
			
		}
	}
		
}
