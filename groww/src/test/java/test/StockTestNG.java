package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.Base;
import pom.DashboardPage;
import pom.LoginPage;
import pom.StockWatchListPage;
import pom.WatchListPage;
import util.UtilClass;

public class StockTestNG extends Base{
	private WebDriver driver;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private WatchListPage watchListPage;
	private StockWatchListPage stockWatchListPage;
	private static String testId="";
	private static String cell_data=""; 
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =launchChromeBrowser();
		}
		else
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				driver =launchFirefoxBrowser();
			}
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void objectCreate(){
		
			loginPage = new LoginPage(driver);
			dashboardPage= new DashboardPage(driver);
			watchListPage= new WatchListPage(driver);
			stockWatchListPage= new StockWatchListPage(driver);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		
		driver.get("https://groww.in");
		
		loginPage.clickOnLoginBtn();
		loginPage.enterEmailId("pen.killer77@gmail.com");
		loginPage.clickOnContinueBtn();
		loginPage.enterPassword("deadman123!");
		loginPage.clickOnSubmitBtn();
		loginPage.enterPin();
		UtilClass.snapShot(driver, testId);
		cell_data=UtilClass.getDataFromExcel("Sheet1", 0, 0);
		System.out.println(cell_data);
	}
	
	@Test
	public void stockAddandRemove() throws InterruptedException, IOException {
		testId="TC001";
		//testId= UtilClass.getDataFromExcel("Sheet1", 1, 2);
		System.out.println(testId);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://groww.in/dashboard/explore/stocks");
		Thread.sleep(2000);
		dashboardPage.enterStock("Axis Bank Ltd");
		
		cell_data=UtilClass.getDataFromExcel("abc", 0, 0);
		System.out.println(cell_data);
		Thread.sleep(3000);
		dashboardPage.searchStockTab();
		dashboardPage.searchStockOptn();
		
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Axis Bank Share Price, Axis Bank Stock Price | Invest or Buy Axis Bank Limited Share or Stock Online | Groww");
		watchListPage.clickOnWatchListIcon();
		//UtilClass.snapShot(driver);
		Thread.sleep(3000);
		watchListPage.clickOnprofileOptnArrow();
		watchListPage.clickwatchListTab();
		
		stockWatchListPage.removeStock();
		
	}
	
	@AfterMethod
	public void logout() throws IOException {
		watchListPage.clickOnprofileOptnArrow();
		stockWatchListPage.logOut();
		UtilClass.snapShot(driver, testId);
	}
	
	@AfterClass
	public void objectNull() {
		loginPage= null;
		dashboardPage= null;
		watchListPage= null;
		stockWatchListPage= null;
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
		
	}
	

}
