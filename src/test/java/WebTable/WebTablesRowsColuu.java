package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesRowsColuu {
	
	
	public void RowsCol() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Lenovo/Downloads/Offline_Website_lyst1725882420679%20(1)/Offline%20Website/pages/examples/users.html");
		
		
		//String text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]")).getText();
		//System.out.println(text);
		
		//rows
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
		int NumberOdRowsSize = row.size();
		System.out.println(NumberOdRowsSize);
		
		//col
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/th"));
		int NumbersOfCol = col.size();
		System.out.println(NumbersOfCol);
		
		
		for(int i=2;i<=NumberOdRowsSize;i++)
		{
			for(int j=1;j<=NumbersOfCol;j++)
			{
				String text1 = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text1 + "  |  ");
			}
			System.out.println();
		}
		
	}

}
