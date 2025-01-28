package testNgPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program1 {
	
	/**
	 * 
	 * All @BeforeSuite, @BeforeTest, @BeforeClass & @BeforeMethod - these all are my Pre Conditions
	 * 
	 * @BeforeMethod  - this annotation will execute before each and every testcases
	 * 
	 */
		
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("am before suite");

		System.out.println("Am aman");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("am before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("am before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("am before method");
	}
	
	/**
	 * 
	 * Below @test - reperesents your Test cases
	 * 
	 * @Test - represents your Condition
	 * 
	 * TestNg - executes test cases in an alphabetical order
	 * 
	 * If we are setting the priority - it will not execute as an alphabetical order
	 * 
	 * Priority -  can be 0 or negative number
	 * 
	 * alwaysRun = true 
	 * 
	 * enabled = true/false -  testcase can be enabled or disabled
	 * 
	 */
	
	
	@Test(priority = 1)
	public void btestCase() {
		System.out.println("TC1 - " + "am your testcase");
	}
	
	@Test(enabled = true)
	public void atestCase1() {
		System.out.println("TC2 - " + "am your testcase1");
	}
	
	
	
	
	/**
	 * 
	 * All @AfterSuite, @AfterTest, @AfterClass & @AfterMethod - these all are my Post Conditions
	 * 
	 * @AfterMethod  - this annotation will execute after each and every testcases
	 * 
	 */
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("am after suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("am after test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("am after class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("am after method");
	}
	
	

}
