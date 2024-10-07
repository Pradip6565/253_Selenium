package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLOginData {
	
	WebDriver driver;
	
	@BeforeMethod 
	void setUp() 
	{
		
		driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
			
	}
	
	
	@Test(dataProvider ="TestLoginData" )
	void testCase(String Username, String Password)
	{
		
		 driver.findElement(By.name("username")).sendKeys(Username);
		 driver.findElement(By.name("password")).sendKeys(Password);
		 driver.findElement(By.id("submit")).click();
	}
	
	
	
	@DataProvider(name="TestLoginData")
	Object[][] dataProvideer()
	{
		
		Object [][] obj = new Object[4][2];
		
		//set1
		obj[0][0] = "student";
		obj[0][1]="Password123";
		
		
		//set2
		obj[1][0] = "studentttttt";
		obj[1][1]="Password123";
		
		//set 3
		obj[2][0] = "student";
		obj[2][1]="Password123333333";
		
		
		//set4
		obj[3][0] = " ";
		obj[3][1]=" ";
				
				
				return obj;
				 
	}
	
	
	@AfterMethod
	void tearDown()
	{
		System.out.println("Sucessfully");
	}

}
