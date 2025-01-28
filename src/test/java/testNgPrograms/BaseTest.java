package testNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
	

}
