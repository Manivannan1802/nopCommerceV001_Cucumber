package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinitions.BaseClass;

public class AddCustomerPage extends BaseClass{
	
	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	By customerMenu=By.xpath("//i[@class='nav-icon far fa-user']");
	
	By customerMenuItem=By.xpath("//p[text()=' Customers']");
	
	By addNew=By.xpath("//a[@class='btn btn-primary']");
	
	By txtEmail=By.id("Email");
	
	By txtPassword=By.id("Password");
	
	By txtFirstName=By.id("FirstName");
	
	By txtLastName=By.id("LastName");
	
	By genderM=By.id("Gender_Male");
	
	By genderF=By.id("Gender_Female");
	
	By txtDob=By.id("DateOfBirth");
	
	By cmpName=By.id("Company");
	
	By taxExempt=By.id("IsTaxExempt");
	
	By newsLetter=By.xpath("(//div[@role=\"listbox\" ])[1]");
	
	By customerRoles=By.xpath("(//input[@class='k-input'])[2]");
	
	By managerOfVendor=By.id("VendorId");
	
	By lstitemadministrators=By.xpath("//li[contains(text(),'Administrator')]");
	By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	
	By active=By.id("Active");
	
	By adminComment=By.id("AdminComment");
	
	By customerSave=By.xpath("//button[@name='save']");
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
	
	public void clickOnCustomerMenu() {
		
		ldriver.findElement(customerMenu).click();
		
	}
	
	public void clickOnCustomerMenuItem() {
		
		ldriver.findElement(customerMenuItem).click();
		
	}
	
	public void clickOnNew() {
		
		ldriver.findElement(addNew).click();
	}
	
	public void setEmail(String email) {
		
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		
		ldriver.findElement(txtPassword).sendKeys(pwd);
	}
	
	public void setFirstName(String fname) {
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
	
	public void setLastName(String Lname) {
		ldriver.findElement(txtLastName).sendKeys(Lname);
	}
	
	public void dob(String dobdate)
	{
		ldriver.findElement(txtDob).sendKeys(dobdate);
	}
	
	public void managervendor() {
		
		
		ldriver.findElement(managerOfVendor).click();
		WebElement mov=ldriver.findElement(managerOfVendor);
		Select select=new Select(mov);
		select.selectByIndex(1);
		
		
		
	}
	public void setCustomerRoles(String role) throws InterruptedException {
		
		if(!role.equals("vendor"))
			
		{
			//ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomRolesId_taglist\"]/li/span"));
		}
		
		ldriver.findElement(customerRoles).click();
		
		WebElement listitem;
		
		Thread.sleep(3000);
		
		if(role.equals("Administrators")) 
		{	
			listitem=ldriver.findElement(lstitemadministrators);
		}
		
		else if(role.equals("Guests")) 
		{
				listitem=ldriver.findElement(lstitemGuests);
		}
		
		else if(role.equals("Registered")) 
		{
			listitem=ldriver.findElement(lstitemRegistered);
		}
		
		else if(role.equals("Vendors")) 
		{	
			listitem=ldriver.findElement(lstitemVendors);
		}
		
		else 
		{
			listitem=ldriver.findElement(lstitemGuests);
	    }
		
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();",listitem);
	}
	
	public void setGender(String gender) {
		
		if (gender.equals("Male"))
		{
			ldriver.findElement(genderM).click();
		}
		
		else if (gender.equals("Female"))
		{
			ldriver.findElement(genderF).click();
		}
		
		else
		{
			ldriver.findElement(genderM).click();  //default
		}
	}
	
	public void setCompName(String company) 
	{
		ldriver.findElement(cmpName).sendKeys(company);
			
	}
	
	public void adminComment(String comment)
	{
		ldriver.findElement(adminComment).sendKeys(comment);
	}
	
	
	public void clickOnSave()
	{
		ldriver.findElement(customerSave).click();
	}
	
	
	
	

}
