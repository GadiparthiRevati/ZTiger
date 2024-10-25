package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	Properties property;
	
	public void propertiesINIt(String filePath) {
	FileInputStream fis = null;
	try {
		fis=new FileInputStream(filePath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		property.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	public String getDataFromProperties(String key) {
		
		return property.getProperty(key);
	}

}
