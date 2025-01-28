package testNgPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParllelConcept {
	
	WebDriver driver;


	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
		}


	@Test
	public void verifyTitleLoginPage() {
		String title = driver.getTitle();

		System.out.println(title);
	}


}
