package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Maven_project.Maven_BaseClass;

public class Annotations extends Maven_BaseClass {
	
	@BeforeClass
	public void driverlaun() {
		launchingChrome("chrome");
		getUrl("");
		
	}
	
	
	
	@Test
	public void Testcase1() {
		System.out.println("tc1");
	}
	
	@Test
	public void Testcase2() {
		System.out.println("tc2");
	}

}
