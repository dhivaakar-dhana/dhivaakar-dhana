package com.AdactIn_ObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AdactIn_Pom.BookHotelPage;
import com.AdactIn_Pom.Itineary;
import com.AdactIn_Pom.Log_in;
import com.AdactIn_Pom.SearchHotel;
import com.AdactIn_Pom.SelectHotelPage;

public class ObjectManager {
	public WebDriver driver;
	
	private static Log_in lg;
	private static SearchHotel sh;
	private static SelectHotelPage shp;
	private static BookHotelPage bhp;
	private static Itineary i;
	
	public ObjectManager(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	public Log_in getInstanceLogin() {
		if (lg == null) {
			lg = new Log_in(driver);
		}
		return lg;	
	}
	
	public SearchHotel getInstanceSearchHotel() {
		if (sh == null) {
			sh = new SearchHotel(driver);
		}
		return sh;
	}
	
	public SelectHotelPage getInstanceSelectHotelPage() {
		if (shp == null) {
			shp = new SelectHotelPage(driver);
			}
		return shp;
	}
	
	public BookHotelPage getInsanceBookHotelPage() {
		if (bhp == null) {
			bhp = new BookHotelPage(driver);
		}
		return bhp;
	}
	
	public Itineary getInstanceItineary() {
		if (i == null) {
			i = new Itineary(driver);
		}
		return i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
