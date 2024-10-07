package Aunnoation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforMethodAndAfterMethod {
	
	@Test
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
	
	
	
	@BeforeMethod
	void setUp()
	{
		System.out.println("Hey");
	}
	
	@AfterMethod
	void tearDown() {
		System.out.println("Bye");
	}

}
