package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scroll {
	public WebDriver driver;
	
	@FindBy(xpath = "(//p[contains(@class, 'cart')])[3]")
	private WebElement scroll;
	
	public Scroll(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getscroll() {
		return scroll;
	}
}
