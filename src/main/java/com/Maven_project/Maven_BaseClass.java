package com.Maven_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Maven_BaseClass {
	public static WebDriver driver;
	public static Actions act;
	public static Robot rob;
	public static Select sel;
	public static JavascriptExecutor js;
	
	public static WebDriver launchingChrome(String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	
		else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	//close
	public static void close() {
		driver.close();
	}
	
	//quit
	public static void quit() {
		driver.quit();
	}
	
	//navigate to 
	public static void navigateTo(String To) {
		driver.navigate().to(To);
	}
	
	//navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	//navigate backward
	public static void navigateBackward() {
		driver.navigate().back();
	}
	
	//navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	//get
	public static void getUrl(String url) {
		driver.get(url);
	}
	
//	alert
	public static void alert(Alert element) {
		element = (Alert) driver.switchTo().alert();
	}
	
	//(alert)accept
	public static void accept(Alert element){     //working
		((Alert)element).accept();
	}
	
	//(alert)dismiss
	public static void dismiss(Alert element) {    //working
		((Alert) element).dismiss();
	}
	
	//action
	public static void actions() { //working
		act = new Actions(driver);
	}
	//(Actions)click
	public static void actionclick(WebElement element) { //working
		act.click(element).build().perform();
	}
	
	//(Actions)double click
	public static void doubleClick(WebElement element) { //working
		act.doubleClick(element).build().perform();
	}
	
	//(Actions)Context click - right click
	public static void contextClick(WebElement element) { //working
		act.contextClick(element).build().perform();
	}
	//(Actions)move to element
	public static void moveToElement(WebElement element) { // working
		act.moveToElement(element).build().perform();
	}
	
	//(Actions)drag and drop
	public static void dragDrop(WebElement element) {
		act.dragAndDrop(element, element).build().perform();
	}
	
	
	//click
	public static void Click(WebElement element) { // working
		element.click();
	}
	
	//frames
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	//exitFrame
	public static void exitFrame() {
		driver.switchTo().defaultContent();
	}
	
	//robot
	public static void robot() throws AWTException  {
		 rob = new Robot();
	}
	//robotKeyPress
	public static void robotKeyPress(int a) {
		rob.keyPress(a);
	}
	//robotKeyRelease
	public static void robotKeyRelease(int b) {
		rob.keyPress(b);
	}
	//window handles get title
	public static void getwindowHandles() { 
		 Set<String> windowHandles = driver.getWindowHandles();
		 for (String pages : windowHandles) {
			 String title = driver.switchTo().window(pages).getTitle();
			 System.out.println(title);
		}
	}
		 
	//switch Windows
	public static void switchPages(String title) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String pages : windowHandles) {
			driver.switchTo().window(pages).getTitle();
		}
		
		for (String pages : windowHandles) {
			if (driver.switchTo().window(pages).getTitle().equalsIgnoreCase(title)) {
				break;
			}
			
		}
		
		}
		 

	//drop down
	public static void select(WebElement element) {
		  sel = new Select(element);
	}
	//select by value
	public static void selectByValue(String value) {
		sel.selectByValue(value);
	}
	
	//select by index
		public static void selectByIndex(int Index) {
			sel.selectByIndex(Index);
		}
	
	//select by text
		public static void selectByVisibleText(String text) {
			sel.selectByVisibleText(text);
		}
	//deselect by value
		public static void deselectByValue(String value) {
			sel.deselectByValue(value);
		}
		
	//deselect by index
		public static void deselectByIndex(int index) {
			sel.deselectByIndex(index);
		}
	
	//deselect by visibleText
	public static void deselectByVisibleText(String text) {
		sel.deselectByVisibleText(text);
	}
	 
	//getOptions
		public static void getOptions() {
			List<WebElement> options = sel.getOptions();
			for (WebElement webElement : options) {
				String text = webElement.getText();
				System.out.println(text);
			}
		}
	
	//getTitle
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
	
	//getCurrentURL
		public static void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		
	//getText
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		
	//getAttribute
		public static void getAttribute(WebElement element,String name) {
			String attribute = element.getAttribute(name);
			System.out.println(attribute);
		}
		
	//isDisplayed
	public static void isDisplayed(WebElement element) {
		  boolean displayed = element.isDisplayed();
		  System.out.println(displayed);
	}
	
	//isEnabled
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	
	//isSelected
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	//wait
	public static void TimeWait() throws InterruptedException {
		Thread.sleep(10000);
	}
	
	//takeScreenshot
	public static void takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}
	
	//scroll
	public static void scroll(WebElement element) {
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",element);
	}	
	
	//sendKeys
	public static void sendKeys(WebElement element,String values) {
		element.sendKeys(values);
	}
	
	//getFirstSelectedOptions
	public static void getFirstSelectedOptions() {
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}
	
	//getAllSelectedOptons
	public static void getAllSelectedOptions() {
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for (WebElement options : allSelectedOptions) {
			String text = options.getText();
			System.out.println(text);
		}
	}
	
	//isMultiple
	public static void isMultple() {
		boolean multiple = sel.isMultiple();
		System.out.println(multiple);
	}
	

	
	
	
	
	
	
	
	
	
	

}
