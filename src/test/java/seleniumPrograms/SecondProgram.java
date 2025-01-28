package seleniumPrograms;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		SecondProgram.concept();
	}
	
	public static void concept() throws InterruptedException {
		WebDriver driver = null;
		
		driver = new ChromeDriver(); //are able to open the browser
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement ele = driver.findElement(By.name("agree"));
				//driver.findElement(By.xpath("//*[@value='Login']"));
		
		System.out.println(ele.isSelected());
		
		Thread.sleep(3000);
		
		if(!ele.isSelected()) {
			ele.click();
		}
	}

}
