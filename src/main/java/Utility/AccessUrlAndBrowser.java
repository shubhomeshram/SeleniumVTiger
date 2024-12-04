package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AccessUrlAndBrowser {

	public static FileInputStream fis;
	
	public String accessBrowser(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/test/resources/crossBaseClass.properties");
		prop.load(fis);
		String br = prop.getProperty(key);
		return br;
	}
	
	
	
}
