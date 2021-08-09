package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchListPage {
	private WebDriver driver;
	
	@FindBy (xpath="(//i[text()='bookmark_border'])[1]")
	private WebElement watchListIcon;
	
	@FindBy (xpath="//i[text()='keyboard_arrow_down']")
	private WebElement profileOptnArrow;
	
	@FindBy (xpath="//div[text()='Watchlist']")
	private WebElement watchListTab;

	public WatchListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWatchListIcon() {
		watchListIcon.click();
	}
	
	public void clickOnprofileOptnArrow() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", profileOptnArrow);
	}
	
	public void clickwatchListTab() {
		watchListTab.click();
	}

}
