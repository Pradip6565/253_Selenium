package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Text;

public class Demo {
	
	void demoo() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://demo.wpeverest.com/user-registration/bordered/");
		 
		 driver.findElement(By.name("user_login")).sendKeys("pradip_2001");
		 
		 Actions ac = new Actions(driver);
		 
		 ac.keyDown(Keys.CONTROL);
		 ac.sendKeys("A");
		 ac.keyUp(Keys.CONTROL).perform();
		 
		 Thread.sleep(2000);
		 
		 ac.keyDown(Keys.CONTROL);
		 ac.sendKeys("C");
		 ac.keyUp(Keys.CONTROL).perform();
		 
		 Thread.sleep(2000);
		 
		 ac.sendKeys(Keys.TAB).perform();
		  Thread.sleep(2000);
		 
		 ac.keyDown(Keys.CONTROL);
		 ac.sendKeys("V");
		 ac.keyUp(Keys.CONTROL).perform();
		 
		 
		 
		 
		 
		 
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Demo d = new Demo();
		d.demoo();
		 

	}

}
