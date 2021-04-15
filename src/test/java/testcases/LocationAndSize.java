package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationAndSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//location of logo 
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.getLocation());
		System.out.println(logo.getLocation().getX());
		System.out.println(logo.getLocation().getY());
	    driver.close();*/
		
		// size of logo 
	    
	    
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.getSize());
		System.out.println(logo.getSize().getHeight());
		System.out.println(logo.getSize().getWidth());
	    driver.close();
		
		
		//need to check size of the elelemnts chnages 

	}

}
