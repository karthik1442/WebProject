package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	private static Object text;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement searchbox =driver.findElement(By.xpath("//input[@id='autocomplete']"));
		searchbox.clear();
		searchbox.sendKeys("toronto");
	   // String text;
	    
	   do 
	    {
	   
	    	searchbox.sendKeys("keys.ARROW_DOWN");
	    	text=searchbox.getAttribute("value");
	    	if(text.equals("Toronto, OH, USA"))
	    	{
	    		searchbox.sendKeys(Keys.ENTER);
	    		break;
	    	}
	    	
	 
	    	Thread.sleep(3000);
	    }while(!((String) text).isEmpty());
	
	}
}
