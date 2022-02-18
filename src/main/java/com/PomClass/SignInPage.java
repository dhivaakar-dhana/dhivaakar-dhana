package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class = 'login']")
	private WebElement sign_in;

	public SignInPage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSignIn() {
		return sign_in;
	}

}
