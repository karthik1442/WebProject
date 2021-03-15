package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4features {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		WebElement login =driver.findElement(By.xpath(" //a[normalize-space()='Login']"));
		System.out.println("Height is:"+login.getRect().getDimension().getHeight());
		System.out.println("Widht is:"+login.getRect().getDimension().getWidth());
		System.out.println(login.getRect().getX());
		System.out.println(login.getRect().getY());
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.youtube.com/");
	    driver.close();
	    driver.quit();

	}

}
