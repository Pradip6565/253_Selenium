package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {
	
	
	
public void webTables() {
	
	
	
	//Invoke the browser
	 WebDriver driver= new ChromeDriver();
	 
	 //open Url
	 driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/index.html");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']")).click();
	
	
	
	
}

}
