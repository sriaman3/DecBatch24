package testNgPrograms;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.PropertiesFile;

public class LoginTest{

	WebDriver driver;
	PropertiesFile prop;
	
	public LoginTest(){
		
		prop = new PropertiesFile();
		
	}

	@BeforeClass
	public void setup() throws IOException {
		
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(prop.getData().getProperty("url")); 
		}


	@Test
	public void verifyTitleLoginPage() throws IOException {
		String title = driver.getTitle();

		System.out.println(title);
		prop.getScreenShot(driver, "verifyTitleLoginPage");
	}

	@Test
	public void doLogin() throws InterruptedException, IOException {

		driver.findElement(By.id("input-email")).sendKeys(prop.getData().getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys(prop.getData().getProperty("password"));

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		prop.getScreenShot(driver, "doLogin");
	}




	@AfterClass 
	public void tearDown() { 
		driver.close(); 
		}



}
