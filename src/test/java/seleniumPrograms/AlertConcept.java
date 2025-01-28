package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("53920");

		driver.findElement(By.name("submit")).click();
		
		//driver.findElement(By.xpath("//*[text()='Cancel']")).click();
		
		
		  Thread.sleep(2000);
		  
		  Alert alert = driver.switchTo().alert();
		  
		  String str = alert.getText();
		  System.out.println(str);
		  
		  if(str.contains("want to delete")) {
			  System.out.println("Message is correct");
		  }else {
			  System.out.println("some spelling mistake");
		  }
		  
		  alert.accept();
		  
		  alert.dismiss();
		 
	}

}
