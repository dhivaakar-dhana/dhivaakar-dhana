package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesReader {
	public static Properties p;
	
	public PropertiesReader() throws Throwable {
	
		File f = new File("D:\\Maven_project\\src\\main\\java\\com\\Properties\\ConfigurationProperites");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		 p.load(fis);
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	
	
	
	
	
	

}
