package Lisenar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		 
		System.out.println("Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 
		System.out.println("Skip");
	}

	  
	
	
}
