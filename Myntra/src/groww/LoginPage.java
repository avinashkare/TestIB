package groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//span[text()='Login/Register']")
	private WebElement loginBtn;
	
	@FindBy (xpath="//input[@id='login_email1']")
	private WebElement emailId;
	
	@FindBy (xpath="//span[text()='Continue']")
	private WebElement continueBtn;
	
	@FindBy (xpath="//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy (xpath="//span[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy (xpath="(//div[@id='otpinput88parent']//input)[1]")
	private WebElement pin1;
	
	@FindBy (xpath="(//div[@id='otpinput88parent']//input)[2]")
	private WebElement pin2;
	
	@FindBy (xpath="(//div[@id='otpinput88parent']//input)[3]")
	private WebElement pin3;
	
	@FindBy (xpath="(//div[@id='otpinput88parent']//input)[4]")
	private WebElement pin4;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void clickOnContinueBtn() {
		continueBtn.click();
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	
	public void enterPin() {
		pin1.sendKeys("2");
		pin2.sendKeys("0");
		pin3.sendKeys("0");
		pin4.sendKeys("7");
	}
	
	
}
