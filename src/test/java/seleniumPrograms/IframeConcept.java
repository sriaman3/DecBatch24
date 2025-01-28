package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConcept {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("main");
		
		String val = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		System.out.println(val);
		
		driver.switchTo().defaultContent();
		
		String val1 = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		System.out.println(val1);

  }
}