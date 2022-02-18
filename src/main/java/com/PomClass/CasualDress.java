package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDress {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text() = 'Women']")
	private WebElement ClickWomen;
	
	@FindBy(xpath = "//a[@title ='Casual Dresses']")
	private WebElement ClickCasual;

	public CasualDress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getClickWomen() {
		return ClickWomen;
	}

	public WebElement getClickCasual() {
		return ClickCasual;
	}

}
