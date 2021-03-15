package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementvsFindelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//scenario1

		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("apple");
		System.out.println(searchbox.isEnabled());
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
	
	
		//scenario2 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("apple");
		WebElement computers=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		computers.click();
		Select dropdown =new Select(driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")));
		dropdown.selectByIndex(1);
		List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.print(logo.size());
		driver.close();
		
	}

}
