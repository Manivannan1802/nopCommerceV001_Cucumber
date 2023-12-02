package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver) {
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
			
		}
		
		@FindBy(id="Email")
		@CacheLookup
		WebElement username;
		
		
		@FindBy (id="Password")
		@CacheLookup
		WebElement password;
		
		
		@FindBy(xpath="//button[@type='submit']")
		@CacheLookup
		WebElement loginbtn;
		
		@FindBy(xpath="//a[text()=\"Logout\"]")
		@CacheLookup
		WebElement logoutbtn;
		
		
		
		public void setUserName(String uname) {
			
			username.clear();
			username.sendKeys(uname);
		}
		
		public void setPassword(String pwd) {
			
			password.clear();
			password.sendKeys(pwd);
		}
		
		public void loginbutton() {
			loginbtn.click();
			
		}
		public void logoutbutton() {
			logoutbtn.click();
			
		}
	
	
}