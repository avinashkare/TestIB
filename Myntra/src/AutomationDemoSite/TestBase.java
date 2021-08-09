package AutomationDemoSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage=new HomePage(driver);
		homePage.getUrl();
		homePage.getPageTitle();
		homePage.clickOnSkipSigninBtn();
		
		RegisterPage registerPage= new RegisterPage(driver);
		registerPage.getUrl();
		registerPage.getPageTitle();
		registerPage.enterFirstName();
		registerPage.enterLastName();
		registerPage.enterAddress();
		registerPage.enterEmail();
		registerPage.enterPhoneNumber();
		registerPage.selectGenderRadioBtn();
		registerPage.selectHobbiesCheckBox();
		registerPage.selectLanguages();
		registerPage.selectSkill();
		registerPage.selectCountry();
		registerPage.selectCountryDrpDwn();
		registerPage.selectYear();
		registerPage.selectMonth();
		registerPage.selectDay();
		registerPage.enterPassword();
		registerPage.enterConfirmPassword();
		registerPage.clickOnResetBtn();
		registerPage.clickOnSubmitBtn();
		
		AlertPage alterPage=new AlertPage(driver);
		alterPage.moveToSwitchToTab();
		alterPage.clickOnAlertTab();
		alterPage.clickOnAlertTab();
		alterPage.switchToAlertPopUp();
		
		Thread.sleep(10000);
		driver.quit();

	}

}
