package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import projectPages.ContactPageElements;

public class Contact {
	
	ContactPageElements contact =new ContactPageElements();
	

    @Test
	public void loginflow01()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
	    contact.YourName("karthik");
	    contact.YourCountry("unitedstates");
	    contact.YourMobileNo("2222222222");
	    contact.YourEmail("kutalakarthik2gmail.com");
	    contact.SendMessage("how are you doing ?");	
	}
}
