package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	public WebDriver driver;
	
	@Test(dataProvider = "testData")
	public void dataProvider(String userName, String pwd) {
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fsearch%3Fq%3Dphone");
		
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
	}
	
	@DataProvider(name = "testData")
	public Object[][] getTestData(){
		
		return new Object[][] {
			{"Aman", "34"},
			{"Raj", "30"}
		};
		
	}

}
