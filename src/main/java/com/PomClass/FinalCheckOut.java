package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalCheckOut {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//p[contains(@class, 'cart')])[3]")
	private WebElement finalMove;
	
	@FindBy(xpath = "(//button[@type = 'submit'])[2]")
	private WebElement finalClick;
	
	public FinalCheckOut(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getfinalMove( ) {
		return finalMove;
	}
	
	public WebElement getfinalClick( ) {
		return finalClick;
	}
}
