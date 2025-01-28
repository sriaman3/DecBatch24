package testNgPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = {"Smoke"})
	public void startCar() {
		System.out.println("Start Car");
	
	}
	
	@Test(groups= {"Sanity"})
	public void driveCar() {
		Assert.fail();
		System.out.println("Drive Car");
	}
	@Test(groups= {"Sanity"})
	public void stopCar() {
		System.out.println("Stop Car");
	}
	
	@Test(groups= {"Smoke"})
	public void parkCar() {
		System.out.println("Park Car");
	}




}
