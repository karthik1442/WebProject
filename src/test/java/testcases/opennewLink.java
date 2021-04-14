package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opennewLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//sceanrio 1
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		String tab =Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Register").sendKeys(tab);*/
		
		//scenario2
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.quit();*/
		
		
		//scenario3

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
