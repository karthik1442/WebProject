package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigatemethiods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		driver.navigate().refresh();
		/*System.out.println("current page url is "+driver.getCurrentUrl());
		System.out.println(" current page title is"+driver.getTitle());
		System.out.println("current pagesource is "+driver.getPageSource());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();*/
		/*driver.navigate().forward();
		driver.get("www.google.com");
		//driver.navigate().forward();
		driver.navigate().back();;
		driver.navigate().refresh();*/
		
		WebElement yourname=driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println(yourname.isDisplayed());
		System.out.println(yourname.isEnabled());
		driver.close();
	

	}

}
