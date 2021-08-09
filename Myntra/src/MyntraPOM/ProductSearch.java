package MyntraPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
	@FindBy (xpath="//img[@title='Roadster Men White Brush Printed Round Neck T-shirt']")
	private WebElement prodct;
	
	public ProductSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProduct() {
		JavascriptExecutor js= (JavascriptExecutor)TestBase.driver;
		js.executeScript("arguments[0].click();", prodct);
	}

}
