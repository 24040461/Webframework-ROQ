package WebApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	private Properties properties;
	
	public Properties browserReader() {
		properties = new Properties();         
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/features/browserOption.properties");
		 try {
			properties.load(ip);
		} catch(IOException e){
			e.printStackTrace();
		}
		 
	}catch(IOException e){
		e.printStackTrace();
	}
		return properties;
}
	
}

