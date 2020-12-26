package projectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageElements {

	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement Register;

	@FindBy(xpath = "//a[normalize-space()='Log In with a School Account']")
	private WebElement loginDifferentAccount;

	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement Emailaddress;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement LoginButton;

	public void click() {
		Register.click();
	}

	public void loginDifferentAccount() {
		loginDifferentAccount.click();
	}

	public void Emailaddress(String emailid) {
		Emailaddress.sendKeys();
	}

	public void password(String passwordentering) {
		password.sendKeys();

	}

	public void LoginButton() {
		LoginButton.click();

	}

}
