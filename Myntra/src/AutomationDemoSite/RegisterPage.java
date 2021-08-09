package AutomationDemoSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	private WebDriver driver;
	private Select sel;
	
	@FindBy (xpath="//input[@ng-model='FirstName']")
	private WebElement fisrtName;
	
	@FindBy (xpath="//input[@ng-model='LastName']")
	private WebElement lastName;
	
	@FindBy (xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
	
	@FindBy (xpath="//input[@ng-model='EmailAdress']")
	private WebElement email;
	
	@FindBy (xpath="//input[@ng-model='Phone']")
	private WebElement phone;
	
	@FindBy (xpath="//input[@value='Male']")
	private WebElement maleRadioBtn;
	
	@FindBy (xpath="//input[@id='checkbox1']")
	private WebElement hobbiesCricket;
	
	@FindBy (xpath="//div[@id='msdd']")
	private WebElement languages;
	
	@FindBy (xpath="//a[text()='English']")
	private WebElement english;
	
	@FindBy (xpath="//a[text()='Hindi']")
	private WebElement hindi;
	
	@FindBy (xpath="//select[@ng-model='Skill']")
	private WebElement skill;
	
	@FindBy (xpath="//select[@ng-model='country']")
	private WebElement countryBx;
	
	@FindBy (xpath="//select[@id='country']")
	private WebElement countryBxDrpDwn;
	
	@FindBy (xpath="//select[@id='yearbox']")
	private WebElement year;
	
	@FindBy (xpath="//select[@ng-model='monthbox']")
	private WebElement month;
	
	@FindBy (xpath="//select[@id='daybox']")
	private WebElement day;
	
	@FindBy (xpath="//input[@id='firstpassword']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='secondpassword']")
	private WebElement confirmPassword;
	
	@FindBy (xpath="//button[@id='submitbtn']")
	private WebElement submitBtn;
	
	@FindBy (xpath="//button[@id='Button1']")
	private WebElement resetBtn;
	
	public RegisterPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getUrl(){
		String url=driver.getCurrentUrl();
		System.out.println("page url=" +url);
	}
	
	public void getPageTitle(){
		String title= driver.getTitle();
		System.out.println("page Tiitle=" +title);
	}
	
	public void enterFirstName(){
		fisrtName.sendKeys("Avinash");
	}
	
	public void enterLastName(){
		lastName.sendKeys("Kare");
	}
	
	public void enterAddress(){
		address.sendKeys("Vasai");
	}
	
	public void enterEmail(){
		email.sendKeys("pen.killer77@gmail.com");
	}
	
	public void enterPhoneNumber(){
		phone.sendKeys("8600393064");
	}
	
	public void selectGenderRadioBtn(){
		boolean male=maleRadioBtn.isSelected();
		
		if(male != true)
		{
			maleRadioBtn.click();
		}
		else
		{
			System.out.println("Male option Already selected");
		}
	}
	
	public void selectHobbiesCheckBox(){
		boolean cricket=hobbiesCricket.isSelected();
		
		if(cricket!=true)
		{
			hobbiesCricket.click();
		}
		else
		{
			System.out.println("Cricket option Already selected");
		}
	}
	
	public void selectLanguages(){
		/*
		boolean langBoxClick=languages.isDisplayed();
		
		if(langBoxClick)
		{
			languages.click();
		}
		else
		{
			System.out.println("please select languages box");
		}
		
		Actions act=new Actions(driver);
		act.moveToElement(english).click().build().perform();
		*/
		languages.click();
		english.click();
		hindi.click();
	}
	
	public void selectSkill() {
		sel= new Select(skill);
		sel.selectByVisibleText("Java");
	}
	
	public void selectCountry() {
		sel= new Select(countryBx);
		sel.selectByVisibleText("India");
	}
	
	public void selectCountryDrpDwn() {
		sel= new Select(countryBxDrpDwn);
		sel.selectByVisibleText("India");
	}
	
	public void selectYear() {
		sel= new Select(year);
		sel.selectByVisibleText("1994");
	}
	
	public void selectMonth() {
		sel= new Select(month);
		sel.selectByVisibleText("April");
	}
	
	public void selectDay() {
		sel= new Select(day);
		sel.selectByVisibleText("7");
	}
	
	public void enterPassword(){
		password.sendKeys("neverGiveUp08");
	}
	
	public void enterConfirmPassword(){
		confirmPassword.sendKeys("neverGiveUp08");
	}
	
	public void clickOnResetBtn(){
		String resetMsg=resetBtn.getText();
		System.out.println(resetMsg +": Click on this button to clear all feilds");
	}
	
	public void clickOnSubmitBtn(){
		submitBtn.click();
	}
	
}
