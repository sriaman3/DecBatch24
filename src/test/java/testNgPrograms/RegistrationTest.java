package testNgPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
	
	@Test
	public void clickOnReg() {
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
