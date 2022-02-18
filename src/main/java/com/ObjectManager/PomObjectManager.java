package com.ObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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

public class PomObjectManager {
	
	public WebDriver driver;
	
	private SignInPage s;
	private LogIn log;
	private CasualDress ca;
	private AddToCart add;
	private CheckOut1 chk1;
	private Checkout2 chk2;
	private Checkout3 chk3;
	private PaymentChkout pc;
	private FinalCheckOut fc;
	private Scroll sc;
	
	public PomObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage getInstanceSignIn() {
		if (s == null) {
			s = new SignInPage(driver);
		}
		 return s;
	}
	
	public LogIn getinstanceLogIn() {
		if (log == null) {
			 log = new LogIn(driver);
		}
		return log;
	}
	
	public CasualDress getInstanceCasualDress() {
		if (ca == null) {
			ca = new CasualDress(driver);
		}
		return ca;
	}
	
	public AddToCart getInstanceAddToCart() {
		if (add == null) {
			 add = new AddToCart(driver);
		}
		return add;
	}
	
	public CheckOut1 getInstanceCheckOut1() {
		if (chk1 == null) {
			 chk1 = new CheckOut1(driver);
		}
		return chk1;
	}
	
	public Checkout2 getInstanceCheckOut2() {
		if (chk2 == null) {
			chk2 = new Checkout2(driver);
		}
		return chk2;
	}
	
	public Checkout3 getInstanceCheckOut3() {
		if (chk3 == null) {
			 chk3 = new Checkout3(driver);
		}
		return chk3;
	}
	
	public PaymentChkout getInstancePaymentCheckOut() {
		if (pc == null) {
			 pc = new PaymentChkout(driver);
		}
		return pc;
	}
	
	public FinalCheckOut getInstanceFinalCheckOut() {
		if (fc == null) {
			fc = new FinalCheckOut(driver);
		}
		return fc;
	}
	
	public Scroll getinstanceScroll() {
		if (sc == null) {
			 sc =new Scroll(driver);
		}
		return sc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
