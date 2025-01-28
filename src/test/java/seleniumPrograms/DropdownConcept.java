package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//WebElement ele = driver.findElement(By.id("Form_getForm_Country"));
		
		WebElement ele = getWebelement(By.id("Form_getForm_Country"));
		
		DropdownConcept.meth(ele,"Congo");

	}
	
	public static void meth(WebElement ele, String country) {
		ele.sendKeys(country);
	}
	
	public static WebElement getWebelement(By locator) {
		
		return driver.findElement(locator);
	}

}
