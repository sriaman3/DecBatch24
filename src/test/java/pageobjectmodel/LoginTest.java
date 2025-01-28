package pageobjectmodel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void testLoginPageTitle() {
		String title = lp.getLoginPageTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void testLoginPageUrl() {
		String title = lp.getCurrentPageUrl();
		Assert.assertEquals(title, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test
	public void testUserLoggedIn() {
	 accPage =lp.doLogin("aman@opencart.com","12345");
	 Assert.assertEquals(accPage.getAccountPageTitle(), "My Account");
	}
	
	

}
