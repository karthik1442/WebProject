package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//taking screenshot for whole page
		//taking screenshot for page section 
		//taking screenshot for specific location.

		//scenario 1 
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File(".\\screenshot\\Home.png");
		FileUtils.copyFile(srcfile, destfile);
		driver.close();*/
		
		//scenario 2 
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		WebElement pagesection=driver.findElement(By.xpath("//div[@class='business-data']"));
		File src=pagesection.getScreenshotAs(OutputType.FILE);
		File trg= new File(".\\screenshot\\pagesection.png");
		FileUtils.copyFile(src, trg);
		driver.close();*/
		
		//scenario3
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		WebElement element =driver.findElement(By.xpath("//div[@class='home-banner-image-section']"));
		File src=element.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshot\\elementsection.png");
		FileUtils.copyFile(src, trg);
		driver.close();
		
		
		
	
	}

}
