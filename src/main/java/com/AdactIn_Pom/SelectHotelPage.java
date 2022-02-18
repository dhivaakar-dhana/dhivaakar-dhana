package com.AdactIn_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement SelectHotel;
	
	@FindBy(id = "continue")
	private WebElement Continue;
	
	public SelectHotelPage(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSelectHotel() {
		return SelectHotel;
	}
	
	public WebElement getContinue() {
		return Continue;
	}
	

}
