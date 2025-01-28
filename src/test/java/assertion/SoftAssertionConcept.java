package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionConcept {
	
	WebDriver driver;
	SoftAssert softAssertion;

	
	@Test
	public void meth1() {
		
		softAssertion =  new SoftAssert();

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = driver.getTitle();
		
		softAssertion.assertEquals(title, "Account Logins");
		
		System.out.println("Aman");
		
		softAssertion.assertAll();
	}

}
