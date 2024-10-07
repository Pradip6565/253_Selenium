package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	void setUp()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
	}
	
	
	
	@Test(dataProvider  ="LoginData")
	void testCase(String userName, String passWord)
	
	{
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
	
	
	
	@DataProvider (name ="LoginData")
	 Object[][] dataProviderr() 
	 {
		Object[][] obj = new Object[2][2]; 
		
		//set 1
		obj[0][0] ="kiran@gmail.com";
		obj[0][1] ="123456";
		
		
		//set 2
		obj[1][0]="hdwhjsml@gmail.com";
		obj[1][1]="bhcdoiwedj";
		
		
		return obj;
		
		 
		 
	 }
	
	
	@AfterMethod
	void tearDown()
	{
		
		System.out.println("Sucessfully");
	}

}
