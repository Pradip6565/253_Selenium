package Aunnoation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TDemo1 {
	
	@BeforeTest
	void setUp()
	{
		System.out.println("ddkfjk");
	}
	
	@Test
	void m1()
	{
		System.out.println("One");
	}
	
	
	@Test
	void m2()
	{
		System.out.println("Two");
	}
	
	
	@Test
	void m3()
	{
		System.out.println("Three");
	}
	
	
	@AfterTest
	void down()
	{
		System.out.println("hjdnkmasl,;s");
	}

}
