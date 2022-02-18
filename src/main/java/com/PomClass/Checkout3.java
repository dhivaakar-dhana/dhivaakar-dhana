package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout3 {
	public WebDriver driver;
	
	@FindBy(xpath = "(//p[contains(@class, 'cart')])[3]")
	private WebElement checkBoxMove;
	
	@FindBy(id = "cgv")
	private WebElement checkBoxClick;
	
	@FindBy(name ="processCarrier")
	private WebElement shipClick;
	
	public Checkout3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getcheckBoxMove() {
		return checkBoxMove;
	}
	
	public WebElement getCheckBoxClick() {
		return checkBoxClick;
	}
	
	public WebElement getShipClick() {
		return shipClick;
	}
	
	
	
}
