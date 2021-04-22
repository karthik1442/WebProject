package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement dekstop= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	    WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	    Actions act =new Actions(driver);
        act.moveToElement(mac).click().perform();
        driver.close();
	
}
}