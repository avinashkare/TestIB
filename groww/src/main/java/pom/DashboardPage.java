package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {
	private Actions act;
	private WebDriver driver;
	
	@FindBy (xpath="//input[@id='mainSearch1010']")
	private WebElement searchBar;
	
	@FindBy (xpath="(//span[text()='Stocks']")
	private WebElement stocksLbl;
	
	@FindBy (xpath="//span[text()='Axis Bank Ltd']")
	private WebElement stockOptn;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterStock(String stock) {
		searchBar.click();
		searchBar.sendKeys(stock);
	}
	
	public void searchStockTab() {
//		act= new Actions(driver);
	//	act.moveToElement(stocksLbl).perform();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", stocksLbl);
	}
	
	public void searchStockOptn() {
		act= new Actions(driver);
		act.moveToElement(stockOptn).click().build().perform();
	}

}
