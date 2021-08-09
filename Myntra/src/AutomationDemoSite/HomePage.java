package AutomationDemoSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	static String url;
	
	@FindBy (xpath="//button[@id='btn2']")
	private WebElement skipSigninBtn;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getUrl()
	{
		url=driver.getCurrentUrl();
		//Assert.assertEquals("http://demo.automationtesting.in/Index.html", url);
		//System.out.println("page url=" +url);
	}
	
	public void getPageTitle()
	{
		String title= driver.getTitle();
		System.out.println("page Tiitle=" +title);
	}
	
	public void clickOnSkipSigninBtn()
	{
		skipSigninBtn.click();
	}

}
