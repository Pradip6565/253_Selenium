package Aunnoation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforClassAndAfterClass {
	
	WebDriver driver;
	
	void testCase1()
	{
		
		
		System.out.println("First Test Case");
	}
	
	@Test
	void testCase2()
	{
		System.out.println("Second Test Case");
	}
	
	@Test
	void testCase3()
	{
		System.out.println("Third Test Case");
	}
	
	
	
	@BeforeClass
	void setUp()
	{
		
		System.out.println("Hey");
		 //driver = new ChromeDriver();
		  
		 //driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
	}
	
	@AfterClass
	void tearDown() {
		System.out.println("Bye");
	}

}
