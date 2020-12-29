package TestAutomationScripts;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import projectPages.RegisterPageElements;

	public class RegisterFlow {

		RegisterPageElements register =new RegisterPageElements();
		
		

	    @Test
		public void loginflow01()
		{
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/#/index");
			driver.manage().window().maximize();
	        register.click();
	        register.loginDifferentAccount();
	        register.Emailaddress("kutalakarthik@gmail.com");
	        register.password("Kutala1992@");
	        register.LoginButton();
		
		
	}

	}
	
	
	

