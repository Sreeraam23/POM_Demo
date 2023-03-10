package pageloader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchresultPage extends TestBase {
	
	@FindBy(css = "ul li.preview")
	WebElement itemPreview;
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addCarttoButton;
	
	public SearchresultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectItem() {
		itemPreview.click();
	}
	
	public Checkoutpage additemtoCart() {
		addCarttoButton.click();
		return new Checkoutpage();
	}
}
