package Parameterr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","url"})
 
	void bFMethod(String Browser, String url)
	
	{
		if(Browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.get(url);
		}else if(Browser.equals("edge"))
		{
			driver = new EdgeDriver();
			
			driver.get(url);
		}else if(Browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(url);
			
		}
 	
		
	}
	
	@Test
	@Parameters({"userName","passWord"})
	void testMethod(String userName, String passWord)
	{
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		Assert.assertTrue(driver.getTitle().equals("JavaByKiran | Dashboard"));
		
		
	}
	
	
	@BeforeMethod
	void aFMethod()
	{
		//driver.quit();
	}

}
