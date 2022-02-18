package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[contains(@class,'clearfix')]")
	private WebElement moveTo;
	
	@FindBy(xpath = "(//a[contains(@class, 'medium')])[2]")
	private WebElement chkout;

	public CheckOut1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getmoveTo() {
		return moveTo;
	}

	public WebElement getChkout() {
		return chkout;
	}
	
	

}
