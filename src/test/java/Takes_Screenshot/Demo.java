package Takes_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public void demoo() throws IOException
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
		 
		 TakesScreenshot sc = (TakesScreenshot) driver;
		 
		File file= sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("‪D:\\SeleniumScreenShot\\sc.png"));
		 
		 
	}

}
