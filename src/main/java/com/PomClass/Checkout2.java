package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout2 {
	
	public WebDriver driver;
	 
	@FindBy(xpath = "(//p[contains(@class, 'cart')])[3]")
	private WebElement moveTo;
	
	@FindBy(name = "processAddress")
	private WebElement click;
	
	public Checkout2(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMoveTo() {
		return moveTo;
	}

	public WebElement getClick() {
		return click;
	}
	
	
}
