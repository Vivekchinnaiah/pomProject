package com.Swag.utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesClass {
	Properties prop = null;
	FileReader fir;
	String appUrl;
	public Properties propFile() throws IOException{
		
		fir= new FileReader("C:\\Users\\kkdm943\\workspace\\Lightning_All_EmailSend\\com.DemoSwag\\GlobalSettings.properties");
		prop= new Properties();
		prop.load(fir);
		return prop;
	}
	
}
