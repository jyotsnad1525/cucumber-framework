package commonutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class CommonUtilities {
	
public FileInputStream stream=null;
	
	public Properties loadFile(String filename){
		Properties propertyFile = new Properties();
		String  PropertyFilePath=null;
		switch(filename) {
		case "applicationProperties":
			PropertyFilePath =constants.APPLICATION_PROPERTIES_PATH;
							break;
		
		}
		try {
			stream=new FileInputStream(PropertyFilePath);
			propertyFile.load(stream);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return propertyFile;
	}


	public String getApplicationProperty(String Key,Properties propertyFile) {
		String value = propertyFile.getProperty(Key);
		System.out.println("Property we got from the file is::" + value);
		
		  try {  stream.close();
		  } catch (IOException e) {
		  
		  e.printStackTrace(); }
		 
		return value;
	}
	
	
}
