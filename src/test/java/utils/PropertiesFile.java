package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesFile {
	Properties prop;
	WebDriver driver;
	
	@Test
	public Properties getData() throws IOException {
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("config.properties");
		
		prop.load(fis);
		
		
		/*
		 * String url = prop.getProperty("url");
		 * 
		 * System.out.println(url);
		 * 
		 * String uN = prop.getProperty("username");
		 * 
		 * System.out.println(uN);
		 * 
		 * String pwd = prop.getProperty("password");
		 * 
		 * System.out.println(pwd);
		 */
		 
		return prop;
	}
	
	
	public void getScreenShot(WebDriver driver, String str) throws IOException {
		 
		 TakesScreenshot screenshot = (TakesScreenshot) driver;
         String srcFile = screenshot.getScreenshotAs(OutputType.BASE64);
         
         File srcFile1 = new File(srcFile);
         
         // Define the destination file
         
         File destFile = new File(System.getProperty("user.dir")+"\\screenshot\\"+ str +".png");
         
         //File destFile = new File("screenshot.png");

         // Copy the screenshot to the desired location
         FileUtils.copyFile(srcFile1, destFile);

         System.out.println("Screenshot saved to " + destFile.getAbsolutePath());
		
	}

}
