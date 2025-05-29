package groww;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://groww.in");
	
	LoginPage loginPage = new LoginPage(driver);
	loginPage.clickOnLoginBtn();
	loginPage.enterEmailId("");
	loginPage.clickOnContinueBtn();
	loginPage.enterPassword("");
	loginPage.clickOnSubmitBtn();
	loginPage.enterPin();
	
	DashboardPage dashboardPage= new DashboardPage(driver);
	Thread.sleep(2000);
	dashboardPage.enterStock("Axis Bank Ltd");
	Thread.sleep(1000);
	dashboardPage.searchStockTab();
	dashboardPage.searchStockOptn();
	
	WatchListPage watchListPage= new WatchListPage(driver);
	watchListPage.clickOnWatchListIcon();
	Thread.sleep(3000);
	watchListPage.clickOnprofileOptnArrow();
	watchListPage.clickwatchListTab();
	
	StockWatchListPage stockWatchListPage= new StockWatchListPage(driver);
	stockWatchListPage.removeStock();
	
	Thread.sleep(10000);
	driver.quit();
	
	}

}
