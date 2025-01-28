package pageobjectmodel;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;

public class AccountTest extends BaseTest{
	
	
	@BeforeClass
	public void accPageSetup() {
		accPage = lp.doLogin("aman@opencart.com", "12345");
	}
	
	@Test
	public void checkAccountPageTitle() {
		ChainTestListener.log("Checking");
		Assert.assertEquals(accPage.getAccountPageTitle(), "My Account");
	}
	

}
