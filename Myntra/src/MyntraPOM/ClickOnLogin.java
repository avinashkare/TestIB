package MyntraPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnLogin {
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement enterPassword;
	
	@FindBy (xpath="//button[text()='LOGIN']")
	private WebElement loginBtn;
	
	public ClickOnLogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterPass() {
		
		enterPassword.sendKeys("deadman123!");
	}
	
	public void clickOnLogn() {
		loginBtn.click();
	}

}
