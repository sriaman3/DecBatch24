package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionConcept {
	
	WebDriver driver;
	
	@Test
	public void meth1() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Account Login");
		
		System.out.println("Aman");
	}
	
	@Test
	public void meth2() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Account Login");
		
		System.out.println("Aman");
	}

}
