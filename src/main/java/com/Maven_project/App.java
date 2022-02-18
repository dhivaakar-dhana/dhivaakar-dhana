package com.Maven_project;


import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class App extends Maven_BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		launchingChrome("chrome");
		getUrl("https://www.amazon.in/");
	
		WebElement mobiles = driver.findElement(By.xpath("(//a[@class = 'nav-a  '])[2]"));
		actions();
		contextClick(mobiles);
		robot();
//		robotKeyPress(KeyEvent.VK_DOWN);
//		robotKeyRelease(KeyEvent.VK_DOWN);
		robotKeyPress(KeyEvent.VK_ENTER);
		robotKeyRelease(KeyEvent.VK_ENTER);
		WebElement Elect = driver.findElement(By.xpath("//a[text() = ' Electronics ']"));
		contextClick(Elect);
//		robotKeyPress(KeyEvent.VK_DOWN);
//		robotKeyRelease(KeyEvent.VK_DOWN);
		robotKeyPress(KeyEvent.VK_ENTER);
		robotKeyRelease(KeyEvent.VK_ENTER);
		
		getwindowHandles();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}
}
