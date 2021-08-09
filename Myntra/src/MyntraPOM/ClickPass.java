package MyntraPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickPass {
	
	@FindBy (xpath="//span[text()=' Password ']")
	private WebElement password;
	
	public ClickPass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPass() {
		
		password.click();
	}

}
