package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = null;
		
		driver = new ChromeDriver(); //are able to open the browser
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		//WebElement ele = driver.findElement(By.id("input-email"));
		
		//ele.sendKeys("Raj@gmail.com");
		
		//System.out.println(ele.getCssValue("color"));
		
		
		//driver.findElement(By.id("Form_getForm_action_submitFotre")).click();
		
		/*
		 * List<WebElement> ele = driver.findElements(By.tagName("input"));
		 * 
		 * 
		 * 
		 * for(int i=0; i<ele.size();i++) {
		 * System.out.println(ele.get(i).getDomAttribute("class")); }
		 */
		

	}

}
