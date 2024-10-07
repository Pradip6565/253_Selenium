package Data_Drivin_Testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderrrr {
	
WebDriver driver;
	
	@BeforeMethod
	void setUp()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
	}
	
	@AfterMethod
	void tearDown()
	{
		//driver.quit();
	}
	
	
	
	@Test(dataProvider  ="LoginData")
	void testCase(String userName, String passWord)
	
	{
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
	 
	
	
	//Accept The Data Excell Sheet
	
	@DataProvider(name="LoginData")
	 Object[][] AcceptExcelData() throws IOException
	{
		
	Object test [][]=Excel_Data.excelData();
	return test;
	
	}

}
