package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By email = By.id("input-email");
	private By pwd = By.id("input-password");
	private By loginBtn =  By.xpath("//input[@value='Login']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public AccountPage doLogin(String uN, String psswd) {
		driver.findElement(email).sendKeys(uN);
		driver.findElement(pwd).sendKeys(psswd);
		driver.findElement(loginBtn).click();
		return new AccountPage(driver);
	}
	
	

}
