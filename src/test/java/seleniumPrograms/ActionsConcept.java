package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	public static void main(String[] args) {
		
		ActionsConcept.tabKey();

	}
	
	
	public static void tabKey() {
		
		WebDriver driver;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(5))
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(5))
		.sendKeys("Mac")
		.sendKeys(Keys.ENTER)
		.perform();
		
	}
	
	
	public static void dragAndDrop() {

		WebDriver driver;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver); // ctrl+shift+O //ctrl+D //ctrl+shift+F

		act.dragAndDrop(drag, drop).perform();
		
		//act.clickAndHold(drag).pause(Duration.ofSeconds(3)).moveToElement(drop).perform();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void mouseHover() {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act  = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		act.moveToElement(ele).pause(Duration.ofSeconds(5)).perform();
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void rightClick() {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act  = new Actions(driver);
		
		WebElement ele = 	driver.findElement(By.xpath("//label[text()='Telephone']"));
		
		act.contextClick(ele).pause(Duration.ofSeconds(5)).perform();
		
		driver.close();
		
	}
	
	
	
	public static void doubleClick() {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act  = new Actions(driver);
		
		WebElement ele = 	driver.findElement(By.xpath("//label[text()='Telephone']"));
		
		act.doubleClick(ele).pause(Duration.ofSeconds(5)).perform();
		
		driver.close();
		
	}
	
	
	
}
