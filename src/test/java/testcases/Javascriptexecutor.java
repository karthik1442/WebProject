package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//WebElement button=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		//JavaScriptutils.drawBorderByJs(button, driver);
		JavaScriptutils.scrollpageDownByJs(driver);
		JavaScriptutils.scrollpageUpByJs(driver);
		JavaScriptutils.zoomoageByJs(driver);
		driver.close();
		
	}

}
