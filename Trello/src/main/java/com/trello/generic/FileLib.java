package com.trello.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	
	
	  public String getPropertyData(String key) throws IOException {
			FileInputStream fis=new FileInputStream("./src/test/resources/Trello.property");
			Properties p=new Properties();
			p.load(fis);
			String value = p.getProperty(key);
			return value;
			
			             }

}
