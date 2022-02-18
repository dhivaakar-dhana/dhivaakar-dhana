package com.AdactIn_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement NoOfRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin_Date;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout_Date;
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id = "child_room")
	private WebElement childsPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public SearchHotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return Location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}
	
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getCheckin_Date() {
		return checkin_Date;
	}
	
	public WebElement getCheckout_Date() {
		return checkout_Date;
	}
	
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	
	public WebElement getChildsPerRoom() {
		return childsPerRoom;
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
