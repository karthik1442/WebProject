package projectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageElements {
	
	public WebDriver driver = null;

	@FindBy(xpath = "//div[@class='nav-outer clearfix']//a[normalize-space()='Contact']")
	private WebElement contact;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement YourName;

	@FindBy(xpath = "//input[@id='country']")
	private WebElement YourCountry;

	@FindBy(xpath = "//input[@id='mobileno']")
	private WebElement YourMobileNo;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement YourEmail;

	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement SendMessage;

	public void contact() 
	{
		contact.click();
	}
	
	
	public void YourName(String enteringname) 
	{
		YourName.sendKeys();
	}
	public void YourCountry(String enteringcountry) 
	{
		YourCountry.sendKeys( enteringcountry);
	}
	

	public void YourMobileNo(String enteringYourMobileNo) 
	{
		YourMobileNo.sendKeys();
	}

	public void YourEmail(String enteringYourEmail) 
	{
		YourEmail.sendKeys();
	}
	

	public void SendMessage(String enteringSendMessage) 
	{
		SendMessage.sendKeys();
		
	}
	
	
}
