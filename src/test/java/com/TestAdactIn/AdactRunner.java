 package com.TestAdactIn;

import org.openqa.selenium.WebDriver;

import com.AdactInProperties.FileReaderManager;
import com.AdactIn_ObjectManager.ObjectManager;
import com.Maven_project.Maven_BaseClass;

public class AdactRunner extends Maven_BaseClass {
	
	public static WebDriver driver = launchingChrome("Chrome");
	public static ObjectManager om = new ObjectManager(driver);
	
	public static void main(String[] args) throws InterruptedException, Throwable {
		
		String url = FileReaderManager.getInstancereaderManager().getInstanceFileReader().geturl();
		getUrl(url);
		
		String username = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getUsername();
		sendKeys(om.getInstanceLogin().getUsername(), username);
		
		String password = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getPassword();
		sendKeys(om.getInstanceLogin().getPassword(), password);

		Click(om.getInstanceLogin().getLogin());
		
		select(om.getInstanceSearchHotel().getLocation());
		selectByIndex(2);
		select(om.getInstanceSearchHotel().getHotels());
		selectByValue("Hotel Sunshine");
		select(om.getInstanceSearchHotel().getRoomType());
		selectByValue("Super Deluxe");
		select(om.getInstanceSearchHotel().getNoOfRooms());
		selectByValue("2");
		String checkInDate = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getCheckInDate();
		sendKeys(om.getInstanceSearchHotel().getCheckin_Date(), checkInDate);
		String checkOutDate = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getcheckOutDate();
		sendKeys(om.getInstanceSearchHotel().getCheckout_Date(), checkOutDate);
		select(om.getInstanceSearchHotel().getAdultsPerRoom());
		selectByValue("4");
		select(om.getInstanceSearchHotel().getChildsPerRoom());
		selectByValue("4");
		Click(om.getInstanceSearchHotel().getSearch());
		 	
		Click(om.getInstanceSelectHotelPage().getSelectHotel());
		Click(om.getInstanceSelectHotelPage().getContinue());
		
		String firstName = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getFirstName();
		sendKeys(om.getInsanceBookHotelPage().getFirstName(), firstName);
		String lastName = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getLastName();
		sendKeys(om.getInsanceBookHotelPage().getLastName(), lastName);
		String address = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getAddress();
		sendKeys(om.getInsanceBookHotelPage().getBillAddress(), address);
		String getccnum = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getccnum();
		sendKeys(om.getInsanceBookHotelPage().getCreditCardNumber(), getccnum);
		select(om.getInsanceBookHotelPage().getCardType());
		selectByValue("VISA");
		select(om.getInsanceBookHotelPage().getCardExpMonth());
		selectByValue("3");
		select(om.getInsanceBookHotelPage().getCardExpYear());
		selectByValue("2022");
		String getcvv = FileReaderManager.getInstancereaderManager().getInstanceFileReader().getcvv();
		sendKeys(om.getInsanceBookHotelPage().getCvvNum(),getcvv);
		Click(om.getInsanceBookHotelPage().getBookNow());
	
		TimeWait();
		
 		Click(om.getInstanceItineary().getItineary());
		
		//takeScreenshot("D:\\Maven_project\\Screenshot\\HotelBooking.png");	
	
 		
	}
	

}
