package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthHeight {

	public static void main(String[] args) {

		WebDriver driver = null;

		driver = new ChromeDriver(); //are able to open the browser

		driver.manage().window().maximize();

		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement ele = driver.findElement(By.xpath("//input[@value='Login']"));

		Dimension d = ele.getSize();

		System.out.println(d.getHeight());
		
		System.out.println(d.getWidth());
	}

}
