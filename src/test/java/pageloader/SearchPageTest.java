package pageloader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchPageTest extends TestBase{
	
	//PageFactory for locating the element
	
	@FindBy(name = "searchbar")
	WebElement srcBox;
	
	@FindBy(id = "button-search")
	WebElement srcBtn;
	
	@FindBy(id = "cart")
	WebElement viewcartBtn;
	
	public SearchPageTest() {
		PageFactory.initElements(driver, this);
	}
	public SearchresultPage searchItem(String strItem) {
		srcBox.sendKeys(strItem);
		srcBtn.click();
		return new SearchresultPage();
	}

	
}
