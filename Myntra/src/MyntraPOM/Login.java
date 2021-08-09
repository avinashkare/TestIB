package MyntraPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (xpath="//span[text()='Profile']")
	private WebElement profile;
	
	@FindBy (xpath="//a[text()='login / Signup']")
	private WebElement signup;
	
	public Login(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void moveToElem(){
		
		Actions act= new Actions(TestBase.driver);
		act.moveToElement(profile).perform();
	}
	
	public void signUp(){
		
		signup.click();
	}

}
