package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
	WebDriver driver;
	@BeforeMethod
	void setUp()
	{

		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
		 
	}
	
	@Test(dataProvider = "LoginDataa")
	void testCase(String userName,String passWord)
	{
		
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		String ActualTitle=driver.getTitle();
		
		String ExpectedTitle= "JavaByKiran | Dashboard";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle );
		
	}
	
	
	
	@DataProvider(name="LoginDataa")
	Object[][] dataProviderr()
	{
		
		
		Object [][] obj = new Object[3][2];
		
		//set2
		obj[0][0]="kiran@gmail.com";
		obj[0][1]="123456";
		
		//set2
		obj[1][0]="kiran";
		obj[1][1]="pass";
		
		//set3
		obj[2][0]="";
		obj[2][1]="afwd";
		
		
		return obj;
		
	}
	
	void tearDown()
	{
		System.out.println("Sucessfully");
	}
}
