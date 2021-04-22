package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppleLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://secure4.store.apple.com/shop/signIn?c=aHR0cHM6Ly93d3cuYXBwbGUuY29tL3wxYW9zZTQyMmM4Y2NkMTc4NWJhN2U2ZDI2NWFmYWU3NWI4YTJhZGIyYzAwZQ&r=SCDHYHP7CY4H9XK2H&s=aHR0cHM6Ly93d3cuYXBwbGUuY29tL3wxYW9zZTQyMmM4Y2NkMTc4NWJhN2U2ZDI2NWFmYWU3NWI4YTJhZGIyYzAwZQ");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='signIn.customerLogin.appleId'] ")).sendKeys("kutala.karthik@icloud.com");
	    
	    driver.findElement(By.xpath("//input[@id='signIn.customerLogin.password']")).sendKeys("Kutala1992@");
	    
	    driver.findElement(By.xpath("//span[@aria-hidden='true'][normalize-space()='Sign In']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@data-string-badge='Shopping Bag with item count : {%BAGITEMCOUNT%}']")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Favorites (1)']")).click();
	    driver.findElement(By.xpath("//span[@class='icon icon-before icon-filter']")).click();
	    
	    
	     driver.findElement(By.xpath("\n" + 
	   		"	    \n" + 
	   		"	 \n" + 
	   		"	   //div[contains(@class,'rs-favorites-item-wrapper rs-favorites-item-detailscontainer')]//div//img[@class='ir'] ")).click();
	    

	    
	
	   driver.close();
	    
	    
	    
	 
	   
	}

}

