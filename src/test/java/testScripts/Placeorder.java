package testScripts;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pageloader.Checkoutpage;
import pageloader.DetailsCheckOutPage;
import pageloader.SearchPageTest;
import pageloader.SearchresultPage;


public class Placeorder extends TestBase{
	
	@BeforeTest
	public void setup() {
		initialize();
	}
	
	SearchPageTest searchPage;
	SearchresultPage resultPage;
	Checkoutpage checkOutPage;
	DetailsCheckOutPage detailsCheckoutPage;
	
  @Test
  public void addItemtoCart() throws AWTException {
	  searchPage = new SearchPageTest();
	  resultPage = searchPage.searchItem("Parry Hotter");
	  resultPage.selectItem();
	  resultPage.additemtoCart();
	  checkOutPage = new Checkoutpage();
	  checkOutPage.couponClick();
	  checkOutPage.enterCoupon("abcd");
	  checkOutPage.apply();
	  checkOutPage.checkOut();
	  detailsCheckoutPage = new DetailsCheckOutPage();
	  detailsCheckoutPage.enterName("Automation");
	  detailsCheckoutPage.enterSurName("Tester");
	  detailsCheckoutPage.enterAddress("Nagar");
	  detailsCheckoutPage.enterZipCode("600000");
	  detailsCheckoutPage.enterCity("Chennai");
	  detailsCheckoutPage.enterCompany("Zuci Systems");
	  detailsCheckoutPage.checkBox();
	  
	  detailsCheckoutPage.buyButton();
  }
}
