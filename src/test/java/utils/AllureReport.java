package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AllureReport {
	
	/**
	 * 
	 * to run - allure serve allure-results on cmd
	 * 
	 * run above command at project location
	 * 
	 */
	
	WebDriver driver;
	
	PropertiesFile prop;
	
	public AllureReport(){
		
		prop = new PropertiesFile();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Description("Checking title of the login page")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Website Tests")
    @Feature("Title Verification")
    @Story("As a user, I want to verify the title of naveen.com")
	@Test
	public void checkTitle() throws IOException {
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Account Login");
		
		prop.getScreenShot(driver, "checkTitle");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
