package AutomationDemoSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		HomePage homePage=new HomePage(driver);
//		homePage.getUrl();
//		homePage.getPageTitle();
//		homePage.clickOnSkipSigninBtn();
		
		AlertPage alertPage=new AlertPage(driver);
		//alertPage.moveToSwitchToTab();
		//alertPage.clickOnAlertTab();
		alertPage.clickOnAlertBtn();
		
		Thread.sleep(2000);
		alertPage.switchToAlertPopUp();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
