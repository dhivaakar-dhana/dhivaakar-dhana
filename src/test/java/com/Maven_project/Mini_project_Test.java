package com.Maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ObjectManager.PomObjectManager;
import com.PomClass.AddToCart;
import com.PomClass.CasualDress;
import com.PomClass.CheckOut1;
import com.PomClass.Checkout2;
import com.PomClass.Checkout3;
import com.PomClass.FinalCheckOut;
import com.PomClass.LogIn;
import com.PomClass.PaymentChkout;
import com.PomClass.Scroll;
import com.PomClass.SignInPage;
import com.Properties.File_reader_manager;

public class Mini_project_Test extends Maven_BaseClass{
	
	public static WebDriver driver = launchingChrome("chrome");
	public static PomObjectManager pom = new PomObjectManager(driver);
	
	public static void main(String[] args) throws Throwable {

		//getURL
		String url = File_reader_manager.getInstanceFRM().getInstancePR().getUrl();
		getUrl(url);
		
		//signIn
		Click(pom.getInstanceSignIn().getSignIn());
		
		//logIn page
		String email = File_reader_manager.getInstanceFRM().getInstancePR().getEmail();
		sendKeys(pom.getinstanceLogIn().getEmail(),email);
		String password = File_reader_manager.getInstanceFRM().getInstancePR().getPassword();
		sendKeys(pom.getinstanceLogIn().getPassword(),password);
		Click(pom.getinstanceLogIn().getClick());
		
		//Women and Causal dress
		actions();
		moveToElement(pom.getInstanceCasualDress().getClickWomen());
		Click(pom.getInstanceCasualDress().getClickCasual());
		
		//QuickView
		moveToElement(pom.getInstanceAddToCart().getQuickView());
		Click(pom.getInstanceAddToCart().getClick());
		frame(pom.getInstanceAddToCart().getFrame());		 
		Click(pom.getInstanceAddToCart().getQuantity());
		Click(pom.getInstanceAddToCart().getQuantity());		 
		select(pom.getInstanceAddToCart().getSize());
		selectByValue("1");
		Click(pom.getInstanceAddToCart().getAddToCart());		 
		exitFrame();
		 
		TimeWait();
		
		moveToElement(pom.getInstanceAddToCart().getMoveTo());
		Click(pom.getInstanceAddToCart().getCheckClick());
		 
		//Summary CheckOut
		 moveToElement(pom.getInstanceCheckOut1().getmoveTo());		
		 Click(pom.getInstanceCheckOut1().getChkout());
		 
		//Address CheckOut
		 moveToElement(pom.getInstanceCheckOut2().getMoveTo());
		 Click(pom.getInstanceCheckOut2().getClick());
		 
		//CheckBox in Shipping page
		 moveToElement(pom.getInstanceCheckOut3().getcheckBoxMove());
		 Click(pom.getInstanceCheckOut3().getCheckBoxClick());
		 Click(pom.getInstanceCheckOut3().getShipClick());
		 
		 //Payment CheckOut
		 moveToElement(pom.getInstancePaymentCheckOut().getpayMove());
		 Click(pom.getInstancePaymentCheckOut().getpayClick());
		 
		//Final Proceed
		 moveToElement(pom.getInstanceFinalCheckOut().getfinalMove());
		 Click(pom.getInstanceFinalCheckOut().getfinalClick());
		 
		//Scroll or Move to element
		 moveToElement(pom.getinstanceScroll().getscroll());

		 
		//Screenshot
		 //takeScreenshot("D:\\Maven_project\\Screenshot\\OrderConfirmed1.png");
	}

}
