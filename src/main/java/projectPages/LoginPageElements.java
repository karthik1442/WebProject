package projectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {

	public WebDriver driver = null;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement emailaddress;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement login;
	
	
	

	public void loginbutton() {
		loginbutton.click();

	}

	public void emailaddress(String enteringemailid)

	{

		emailaddress.sendKeys();

	}

	public void password(String passwordentering)

	{

	password.sendKeys();

	}

	public void login()

	{

		login.click();

	}
	
	
	

}
