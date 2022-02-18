package com.AdactIn_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itineary {
	public WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement Itineary;
	
	public Itineary(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getItineary() {
		return Itineary;
	}
}
