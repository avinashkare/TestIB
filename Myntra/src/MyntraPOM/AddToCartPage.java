package MyntraPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy (xpath="(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[2]")
	private WebElement tSize;
	
	@FindBy (xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	private WebElement addToCart;
	
	@FindBy (xpath="//span[text()='Bag']")
	private WebElement bag;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectSize() {
		boolean m=tSize.isEnabled();
		
		if(m==true)
		{
			tSize.click();
		}
		else
		{
			System.out.println("Please select size");
		}
	}
	
	public void addToCartMeth() {
		addToCart.click();
	}
	
	public void clickOnBag() {
		bag.click();
	}
}
