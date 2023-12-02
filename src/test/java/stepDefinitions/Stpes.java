package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Stpes extends BaseClass{
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		driver.manage().window().maximize();
	    
	}

	@When("user open url  {string}")
	public void user_open_url(String url1) {
		
		driver.get(url1);
	    
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
		
		lp.setUserName(email);
		lp.setPassword(pwd);
	    
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.loginbutton();
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);}
		
		else {
			
			Assert.assertEquals(title,driver.getTitle());
		}
	    
	}

	@When("user click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		
		lp.logoutbutton();
		Thread.sleep(3000);
	    	}

	@Then("Close browser")
	public void close_browser() {
		
		driver.quit();
	    
	}
	
	
	
	//customer feature step definitions
	
	@Then("User can view the dashboard")
	public void user_can_view_the_dashboard() {
		
		acp=new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",acp.getPageTitle());
	    
	}

	@When("User click on Customers menu")
	public void user_click_on_customers_menu() {
		
		acp.clickOnCustomerMenu();
	    
	}

	@When("Click on customers menu item")
	public void click_on_customers_menu_item() {
		
		acp.clickOnCustomerMenuItem();
	    
	}

	@When("Click on Add new button")
	public void click_on_add_new_button() {
		acp.clickOnNew();
	   
	}

	@Then("user can view the Add new customer page")
	public void user_can_view_the_add_new_customer_page() {
		
		Assert.assertEquals("Add a new customer / nopCommerce administration",acp.getPageTitle());
	}

	@When("user enter the customer info")
	public void user_enter_the_customer_info() throws InterruptedException {
		String email=randomString()+"@gmail.com";
		acp.setEmail(email);
		acp.setPassword("test123");
		acp.setCustomerRoles("Administrators");
		Thread.sleep(2000);
		acp.setFirstName("Mani");
		acp.setLastName("M");
		acp.setGender("Male");
		acp.setCompName("new comp");
		acp.dob("1/2/2000");
		acp.managervendor();
		acp.adminComment("This is for testing");
		
	    
	}

	@When("click on Save button")
	public void click_on_save_button() throws InterruptedException {
		
		acp.clickOnSave();
		Thread.sleep(2000);
	    	}

	@Then("user can view the confirmation message {string}")
	public void user_can_view_the_confirmation_message(String msg)
			{
				Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
						.contains("The new customer has been added successfully"));
	    	}
	

//Customer search
	
	@When("Enter customer email")
	public void enter_customer_email() {
	    
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    
	}

	@Then("User should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    
	}
	
	

}
