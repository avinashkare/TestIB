package groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		return driver;
	}
	
	public WebDriver launchFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		return driver;
	}


}
