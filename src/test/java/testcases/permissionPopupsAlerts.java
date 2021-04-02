package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class permissionPopupsAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("- -disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	
	}

}
