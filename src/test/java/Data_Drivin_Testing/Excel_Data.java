package Data_Drivin_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Data {


	 
	public static Object[][] excelData() throws IOException
	{
		 
		System.out.println("Hello GitHUb");
		DataFormatter df = new DataFormatter();
		
		System.getProperty("user.dir");
		
		FileInputStream input = new FileInputStream("D:\\Manual Testing\\excel\\dataaa.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		XSSFSheet  sheet=workbook.getSheet("Sheet1");
		
		
		int NumberOFRow =sheet.getLastRowNum();
		System.out.println(NumberOFRow);
		
		int NumberOfCol = sheet.getRow(0).getLastCellNum();
		System.out.println(NumberOfCol);
		
		
		Object obj [][] = new Object[NumberOFRow+1][NumberOfCol];
		
		
		for(int i=1;i<=NumberOFRow;i++)
		{
			XSSFRow row =sheet.getRow(i);
			for(int j=1;j<NumberOfCol;j++)
			{
				
				XSSFCell cell=row.getCell(j);
				
				obj[i][j]=df.formatCellValue(cell);
				
			}
		}
		
		return obj;
		
	}
}


  