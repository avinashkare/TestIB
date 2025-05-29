package MyntraPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserNamePage {
	
	@FindBy (xpath="//input[@autocomplete='new-password']")
	private WebElement mobileNo;
	
	@FindBy (xpath="//div[text()='CONTINUE']")
	private WebElement continueBtn;
	
	public UserNamePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNo() {
		
		mobileNo.sendKeys("");
	}
	
	public void clickOnCont() {
		
		continueBtn.click();
	}

}
