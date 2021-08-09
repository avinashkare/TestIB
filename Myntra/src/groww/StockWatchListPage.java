package groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockWatchListPage {
	
	@FindBy (xpath="(//i[text()='delete_outline'])[1]")
	private WebElement axisStock;
	
	@FindBy (xpath="//div[text()='Log Out']")
	private WebElement logOutBtn;
	
	public StockWatchListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void removeStock() {
		axisStock.click();
	}
	
	public void logOut() {
		
		logOutBtn.click();
	}
	
	

}
