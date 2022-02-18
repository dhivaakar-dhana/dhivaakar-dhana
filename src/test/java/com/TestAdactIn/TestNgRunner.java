package com.TestAdactIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.Maven_project.Maven_BaseClass;

public class TestNgRunner extends Maven_BaseClass  {
	
	@BeforeClass(groups = {"sampleTest"})
	public void webBrowser() {
		
		launchingChrome("chrome");  
		getUrl("http://automationpractice.com/index.php");
	}
	
	@Test(priority = 0,groups = {"sampleTest"})
	public void sign() {
		WebElement LogIn = driver.findElement(By.xpath("//a[@class = 'login']"));
		LogIn.click();
	}
	
	@Test(priority = 1,groups = {"sampleTest"})
	public void logIn() {
		
		WebElement Email = driver.findElement(By.id("email"));
		sendKeys(Email, "dhivakar2183143@gmail.com");
		WebElement Passwd = driver.findElement(By.id("passwd"));
		sendKeys(Passwd, "Dhiva@1999");
		WebElement Signin = driver.findElement(By.id("SubmitLogin"));
		Click(Signin);
	}
	
	@Test(priority = 2,groups = {"sampleTest"})
	public void womens() {
		
		actions();
		WebElement Women = driver.findElement(By.xpath("//a[text() = 'Women']"));
    	moveToElement(Women);
		WebElement Casual = driver.findElement(By.xpath("//a[@title ='Casual Dresses']"));
		Click(Casual);
	}
	
	@Test(priority = 3,groups= {"sampleTest"})
	public void quickview() {
		
			WebElement QuickView = driver.findElement(By.xpath("//img[@title = 'Printed Dress']"));
			moveToElement(QuickView);
			WebElement QuickClick = driver.findElement(By.xpath("//a[@class= 'quick-view']"));
			Click(QuickClick);
	}
	
	@Test(priority = 4,groups = {"sampleTest"})
	public void AddToCart() throws Throwable {
		
		WebElement InnerFrame = driver.findElement(By.xpath("(//iframe[@vspace= '0'])"));
		frame(InnerFrame);
		
		WebElement Quantity = driver.findElement(By.xpath("//a[contains(@class ,'up')]"));
		Click(Quantity);
		Click(Quantity);
		
		WebElement Size = driver.findElement(By.id("group_1"));
		select(Size);
		selectByValue("2");
		
		WebElement AddToCart = driver.findElement(By.name("Submit"));
		Click(AddToCart);
		exitFrame();
		TimeWait();
		WebElement CheckOut = driver.findElement(By.xpath("//a[contains(@class,'medium')]"));
		Click(CheckOut);
		
	}
	
	@Test(priority = 5,groups = {"chktest"})
	public void checkouts() {
	 
		WebElement Scroll = driver.findElement(By.xpath("//p[contains(@class,'clearfix')]"));
		actions();
		moveToElement(Scroll);
		WebElement CheckOut1 = driver.findElement(By.xpath("(//a[contains(@class, 'medium')])[2]"));
		Click(CheckOut1);
		WebElement Scroll1 = driver.findElement(By.xpath("(//p[contains(@class, 'cart')])[3]"));
		moveToElement(Scroll1);
		WebElement Checkout2 = driver.findElement(By.name("processAddress"));
		Click(Checkout2);
	}
	
	@Test(priority = 6,groups= {"chktest"})
	public void chk() {
		
		WebElement Scroll3 = driver.findElement(By.xpath("(//p[contains(@class, 'cart')])[3]"));
		moveToElement(Scroll3);
		WebElement CheckBox = driver.findElement(By.id("cgv"));
		Click(CheckBox);
		WebElement CheckOut3 = driver.findElement(By.name("processCarrier"));
		Click(CheckOut3);
	}
	
	@Test(priority = 7,groups = {"chktest"})
	public void payment() {
		
		WebElement Scroll4 = driver.findElement(By.xpath("//div[@class = 'col-xs-12 col-md-6']"));
		moveToElement(Scroll4);
		WebElement Pay = driver.findElement(By.xpath("//a[@class = 'bankwire']"));
		Click(Pay);
	}
	
	@Test(priority = 8,groups = {"chktest"})
	public void summary() {
		
		WebElement Scroll5 = driver.findElement(By.xpath("(//p[contains(@class, 'cart')])[3]"));
		moveToElement(Scroll5);
		WebElement Procced = driver.findElement(By.xpath("(//button[@type = 'submit'])[2]"));
		Click(Procced);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
