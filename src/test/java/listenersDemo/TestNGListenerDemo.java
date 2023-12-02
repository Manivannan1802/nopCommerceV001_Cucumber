package listenersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

@Listeners(listenersDemo.TestngListeners.class)
public class TestNGListenerDemo {
	
	public WebDriver driver;

		@Test
		public void test1() {
			
			System.out.println("I am inside test1");
		}
		@Test	
		public void test2() {
			
			System.out.println("I am inside test2");
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("abcd");
			//driver.findElement(By.name("123")).sendKeys("abcd");
			driver.close();
		}


		@Test
		public void test3() {
	
			System.out.println("I am inside test3");
		}

}
