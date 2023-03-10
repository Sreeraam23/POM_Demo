package pageloader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Checkoutpage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	WebElement checkOut;
	
	@FindBy(css = "input[id = billing-coupon]")
	WebElement couponBtn;
	
	@FindBy(css = "input[id=coupon]")
	WebElement couponInput;
	
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applyCoupon;
	
	public Checkoutpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void couponClick() {
		couponBtn.click();
	}
	
	public void enterCoupon(String strInput) {
		couponInput.sendKeys(strInput);
		couponInput.click();
	}
	
	public void apply() {
		applyCoupon.click();
	}
	
	public DetailsCheckOutPage checkOut() {
		checkOut.click();
		return new DetailsCheckOutPage();
	}

}
