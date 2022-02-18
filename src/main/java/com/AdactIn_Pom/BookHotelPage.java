package com.AdactIn_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id = "address")
	private WebElement BillAddress;
	
	@FindBy(id = "cc_num")
	private WebElement CreditCardNumber;
	
	@FindBy(id = "cc_type")
	private WebElement CardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement CardExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement CardExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id = "book_now")
	private WebElement BookNow;
	
	public BookHotelPage(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillAddress() {
		return BillAddress;
	}

	public WebElement getCreditCardNumber() {
		return CreditCardNumber;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getCardExpMonth() {
		return CardExpMonth;
	}

	public WebElement getCardExpYear() {
		return CardExpYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
