package Properties_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetValue {
	
	
	public static String getData(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("D:\\Program\\JavaSelenium\\Java_BY_Kiran\\LoginConfiq\\Login.properties");
		
		Properties prop = new Properties();
		prop.load(file);
		 
		return prop.getProperty(key);
		
	}

}
