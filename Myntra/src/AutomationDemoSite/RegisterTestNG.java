package AutomationDemoSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTestNG {
	private HomePage homePage;
	private WebDriver driver;
	private RegisterPage registerPage;

	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		homePage=new HomePage(driver);
		registerPage= new RegisterPage(driver);
	}
	
	@Test(priority=1)
	public void test()
	{
		homePage.getUrl();
		Assert.assertEquals("http://demo.automationtesting.in/Index.html", HomePage.url);
		homePage.getPageTitle();
		homePage.clickOnSkipSigninBtn();
	}
	
	@Test(priority=2, timeOut=2000)
	public void testReg() throws InterruptedException
	{
		Thread.sleep(2000);
		registerPage.getUrl();
		System.out.println("testreg");
		registerPage.getPageTitle();
		registerPage.enterFirstName();
	}

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("quit");
	}
	

	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}
