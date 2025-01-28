package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	WebDriver driver;
	
	@Test(dataProvider = "testData")
	public void dataProvider(String fN, String lN, String email, String phone, String pass, String confPwd, boolean privacy) throws InterruptedException {
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys(fN);
		driver.findElement(By.xpath("//*[@id='input-lastname']")).sendKeys(lN);
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys(phone);
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys(confPwd);
		Thread.sleep(3000);
		if(privacy) {
			driver.findElement(By.name("agree")).click();
		}
		driver.findElement(By.xpath("//*[@value='Continue']")).click();
	}
	
	@org.testng.annotations.DataProvider(name="testData")
	public Object[][] getTestData(){
		
		Object[][] data = new Object[][] {
			{"Aman", "Srivastava", "aman@opencart.com","9807654321","12345","12345", true},
			{"Raj", "Singh", "raj@opencart.com","9876054321","12345", "12345", false}
		};
		
		return data;
	}	
	
	
	

}
