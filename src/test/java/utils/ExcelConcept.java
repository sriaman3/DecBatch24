package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelConcept {
	
	WebDriver driver;
	
	private static final String TEST_DATA_SHEETPATH ="TestDatas.xlsx";
	private static Workbook wb;
	private static Sheet sheet;
	
	public static Object[][] getExcelData(String sheetName) {
		
		FileInputStream fis;
		Object data[][] = null;
		
		try {
			fis = new FileInputStream(TEST_DATA_SHEETPATH);
			
			wb = WorkbookFactory.create(fis);
			
			sheet = wb.getSheet(sheetName);
			
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					data[i][j] =  sheet.getRow(i+1).getCell(j).toString();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}
	
	@DataProvider
	public Object[][] getDataFromExcel(){
		
		return ExcelConcept.getExcelData("Login");
		
	}
	
	@Test(dataProvider = "getDataFromExcel")
	public void setup(String username, String password) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys(password);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
	}

}
