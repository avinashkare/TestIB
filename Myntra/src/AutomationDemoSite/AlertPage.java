package AutomationDemoSite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
	private WebDriver driver;
	
	@FindBy (xpath="//a[text()='SwitchTo']")
	private WebElement switchToTab;
	
	@FindBy (xpath="//a[text()='Alerts']")
	private WebElement alertTab;
	
	@FindBy (xpath="//button[@class='btn btn-danger']")
	private WebElement alertBtn;
	
	@FindBy (xpath="//a[text()='Alert with OK & Cancel ']")
	private WebElement alertWithCancelBtn;
	
	public AlertPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moveToSwitchToTab()
	{
		Actions act=new Actions(driver);
		act.moveToElement(switchToTab).perform();
	}
	
	public void clickOnAlertTab()
	{
		alertTab.click();
	}
	
	public void clickOnAlertBtn()
	{
		alertBtn.click();
	}
	
	public void switchToAlertPopUp()
	{
		Alert alt=driver.switchTo().alert();
		String alertMsg=alt.getText();
		System.out.println(alertMsg);
		alt.accept();
	}
	
	public void switchToAlertCancelPopUp()
	{
		Alert alt=driver.switchTo().alert();
		String alertMsg=alt.getText();
		System.out.println(alertMsg);
		alt.accept();
	}

}
