package FlipKartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/*
	@FindBy (xpath="//a[text()='Login']")
	private WebElement LoginOptn;
	*/
	
	@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobileNo;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="(//span[text()='Login'])[2]")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	/*public void clickOnLoginOptn()
	{
		LoginOptn.click();
	}*/
	
	public void enterMobileNo()
	{
		mobileNo.sendKeys("");
	}
	
	public void enterPassword() 
	{
		password.sendKeys("");
	}
	
	public void clickOnLogin()
	{
		LoginBtn.click();
	}
}
