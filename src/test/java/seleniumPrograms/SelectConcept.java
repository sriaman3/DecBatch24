package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectConcept {

	public static void main(String[] args) {
		
		SelectConcept.concept2();
	}
	
	public static void concept2() {
		
		WebDriver driver = null;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		WebElement ele = driver.findElement(By.id("Form_getForm_Country"));
		
		Select sel = new Select(ele);
		
		System.out.println(sel.getOptions().size());
	}
	
	public static void concept1() {
		
		WebDriver driver = null;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		WebElement ele = driver.findElement(By.id("Form_getForm_Country"));
		
		Select sel = new Select(ele);
		
		//sel.selectByIndex(1);
		
		sel.selectByValue("Angola");
		
	}

}
