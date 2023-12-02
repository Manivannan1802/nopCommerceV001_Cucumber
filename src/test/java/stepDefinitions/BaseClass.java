package stepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage acp;
	
	public static String randomString() {
		
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		
	}

}
