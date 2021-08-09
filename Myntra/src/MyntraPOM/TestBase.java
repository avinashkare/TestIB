package MyntraPOM;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Login loginPage=new Login(driver);
		loginPage.moveToElem();
		loginPage.signUp();
		
		UserNamePage userNamePage= new UserNamePage(driver);
		userNamePage.enterMobNo();
		userNamePage.clickOnCont();
		
		ClickPass clickPass= new ClickPass(driver);
		clickPass.clickOnPass();
		
		ClickOnLogin clickOnLogin= new ClickOnLogin(driver);
		clickOnLogin.enterPass();
		clickOnLogin.clickOnLogn();
		
		Thread.sleep(3000);
		SearchBarPage searchBarPage= new SearchBarPage(driver);
		searchBarPage.searchBarEnter();
		
		Thread.sleep(3000);
		ProductSearch productSearch= new ProductSearch(driver);
		productSearch.clickOnProduct();
		
		ArrayList<String> win= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(1));
		
		AddToCartPage addToCartPage= new AddToCartPage(driver);
		addToCartPage.selectSize();
		addToCartPage.addToCartMeth();
		addToCartPage.clickOnBag();
		
		PlaceOrderPage placeOrderPage= new PlaceOrderPage(driver);
		placeOrderPage.clickOnApplyBtn();
		placeOrderPage.applyCoupon();
		placeOrderPage.clickOnPlaceOrder();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
