package MyntraPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	@FindBy (xpath="//button[text()='APPLY']")
	private WebElement applyBtn;
	
	@FindBy (xpath="//button[@id='applyCoupon']")
	private WebElement apply;
	
	@FindBy (xpath="//div[text()='Place Order']")
	private WebElement placeOrder;
	
	public PlaceOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnApplyBtn() {
		applyBtn.click();
	}
	
	public void applyCoupon() {
		apply.click();
	}
	
	public void clickOnPlaceOrder() {
		placeOrder.click();
	}

}
