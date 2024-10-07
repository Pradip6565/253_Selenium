package Aunnoation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BAMClass {
	
	WebDriver driver;
	
	@BeforeMethod
	void setUp()
	{
	  driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
	
	}
	
	@Test
	void TestCase1() 
	
	{
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
	}
	
	
	
	@Test
	void TestCase2()
	{
		driver.findElement(By.id("email")).sendKeys("kkiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
	}
	

	@Test
	void TestCase3()
	{
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("  ");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
	}
	
	
	
	
	
	
	@BeforeMethod
	void TearDown()
	{
		System.out.println("Done Sucessfully");
	}

}
