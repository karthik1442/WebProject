package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmaill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    WebElement search = driver.findElement(By.xpath(" //input[@title='Search']"));
	    search.sendKeys("gmail");
	   WebElement googleSearch = driver.findElement(By.xpath("//div[@class='tfB0Bf']//input[@name='btnK']"));
	   googleSearch.click();
	  
	
	}

}
