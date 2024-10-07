package To_Read_Data_EXcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test
	void testCase() throws IOException
	{
		
		DataFormatter df = new DataFormatter();
	 
		System.getProperty("user.dir");
		
		XSSFWorkbook workbook = new XSSFWorkbook(".//ExcelReadData//dataaa.xlsx");
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int row =sheet.getLastRowNum();
		System.out.println(row);
		
		
		int col= sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		
		
		for (Row row2 : sheet) {
			
			for(Cell cell:row2)
			{
				
				String ss =df.formatCellValue(cell);
				System.out.println(ss);
			}
			
		}
		
	 
		
		
		
	}

}
