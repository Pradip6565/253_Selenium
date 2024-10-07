package Properties_File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AA {
	
	WebDriver driver;
	
	public void data() throws IOException {
		
		 String Browser=GetValue.getData("browser");
		 if(Browser.equalsIgnoreCase("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 if(Browser.equalsIgnoreCase("Edge"))
		 {
			 driver = new EdgeDriver();
		 }
		  
		String URl = GetValue.getData("url");
		
		driver.get(URl);
		
		
	String name =	GetValue.getData("username");
	driver.findElement(By.id("email")).sendKeys(name);
	
	String pass =	GetValue.getData("password");
	driver.findElement(By.id("password")).sendKeys(pass);
	
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	
		 
		
	}

}
