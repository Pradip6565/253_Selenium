package To_Read_Data_EXcel;

//import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Demoooooooooooo {
	
	
	@Test
	void Demo() throws IOException
	{
		System.getProperty("user.dir");
		
		DataFormatter df = new DataFormatter();
		//FileInputStream input = new  FileInputStream("‪D:\\Program\\JavaSelenium\\Java_BY_Kiran\\ExcelReadData\\ppppp.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(".//ExcelReadData//dataaa.xlsx");
		
		//System.out.println("Hye");
		
		XSSFSheet  sheet =workbook.getSheet("Sheet1");
		
		//int row=sheet.getLastRowNum();
		//System.out.println(row);
		
		//int col = sheet.getRow(0).getLastCellNum();
		//System.out.println(col);
		
		
		for (Row row2 : sheet) {
			
			for(Cell cell2:row2)
			{
				
				String data1 =df.formatCellValue(cell2);
				System.out.print(data1 + "        |");
				
			}
			System.out.println();
			
			
		}
		
		
		
		 
		
		System.out.println("Bye");
		
		
	 }
	
	 
		 
		}

	


	
 
