package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	LoginPage lp;
	AccountPage accPage;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		lp = new LoginPage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		
	}

}
