package com.AdactInProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AdactinFileReader {
	
	public static Properties p;
	
	public AdactinFileReader() throws Throwable {
	
		File f = new File("D:\\Maven_project\\src\\main\\java\\com\\AdactInProperties\\AdactFile");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getCheckInDate() {
		String checkInDate = p.getProperty("checkInDate");
		return checkInDate;
	}
	
	public String getcheckOutDate() {
		String checkOutDate = p.getProperty("checkOutDate");
		return checkOutDate;
	}
	
	public String getFirstName() {
		String firstName = p.getProperty("firstname");
		return firstName;
	}
	
	public String getLastName() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	
	public String getccnum() {
		String ccnum = p.getProperty("ccnum");
		return ccnum;
	}
	
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
