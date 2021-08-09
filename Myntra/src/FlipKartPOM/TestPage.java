package FlipKartPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage loginPage= new LoginPage(driver);
		//loginPage.clickOnLoginOptn();
		loginPage.enterMobileNo();
		loginPage.enterPassword();
		loginPage.clickOnLogin();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
