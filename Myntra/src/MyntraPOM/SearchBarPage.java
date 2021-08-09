package MyntraPOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage {
	
	@FindBy (xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement searchBar;
	
	public SearchBarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchBarEnter() {
		searchBar.sendKeys("Tshirst for men" + Keys.ENTER);
	}

}
