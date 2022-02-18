package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentChkout {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class = 'col-xs-12 col-md-6']")
	private WebElement payMove;
	
	@FindBy(xpath = "//a[@class = 'bankwire']")
	private WebElement payClick;
	
	public PaymentChkout(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);		
	}
	
	public WebElement getpayMove() {
		return payMove;
	}
	
	public WebElement getpayClick() {
		return payClick;
	}
	
	
	

}
