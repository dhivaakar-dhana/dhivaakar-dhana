package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@title = 'Printed Dress']")
	private WebElement quickView;
	
	@FindBy(xpath = "//a[@class= 'quick-view']")
	private WebElement click;
	
	@FindBy(xpath = "(//iframe[@vspace= '0'])")
	private WebElement frame;
	
	@FindBy(xpath = "//a[contains(@class ,'up')]")
	private WebElement Quantity;
	
	@FindBy(id = "group_1")
	private WebElement size;
	
	@FindBy(name = "Submit")
	private WebElement addToCart;
	
	@FindBy(xpath = "//a[@title = 'Proceed to checkout']")
	private WebElement moveTo;
	
	@FindBy(xpath = "//a[@title = 'Proceed to checkout']")
	private WebElement checkClick;
	
	public AddToCart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getMoveTo() {
		return moveTo;
	}

	public WebElement getCheckClick() {
		return checkClick;
	}
	
}
