
package testcases;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class VerifyErrorMessage {

	    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//Select dropdown = new Select(driver.findElement(By.xpath("//input[@id='autocomplete']")));
		//dropdown.selectByVisibleText("");
		//dropdown.selectByVisibleText("");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("INDIA");
		Select dropdown =new Select(driver.findElement(By.xpath("//input[@id='autocomplete']")));
		dropdown.selectByIndex(0);
		driver.close();
	        
		
		
	    }

	}


