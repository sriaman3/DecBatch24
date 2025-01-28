package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement ele = driver.findElement(By.id("input-firstname"));
		
		//ctrl+shift+O
		
		ele.sendKeys("Raj");
		
		Thread.sleep(3000);
		
		ele.sendKeys(Keys.CONTROL+"a");
		
		ele.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("input-lastname"));
		
		ele1.sendKeys(Keys.CONTROL+"v");

	}

}
