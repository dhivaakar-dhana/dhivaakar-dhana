package com.TestNg;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Maven_project.Maven_BaseClass;

public class Test extends Maven_BaseClass {
	
	@org.testng.annotations.BeforeClass
	public void DriverLaunch() {
		launchingChrome("Chrome");
		getUrl("https://adactinhotelapp.com/index.php");
	}
	
	@org.testng.annotations.Test(priority = 1)
	public void Log_In_Username() {
		WebElement username = driver.findElement(By.id("username"));
		sendKeys(username, "dhivakar9901");
	}
	
	@org.testng.annotations.Test(priority = 2)
	public void Log_In_Password() {
			WebElement password = driver.findElement(By.id("password"));
			sendKeys(password, "dhiva*123");
	}
	
	


}
