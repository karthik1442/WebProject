package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sageintacct.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		//driver.findElement(By.id("company")).sendKeys("prokarma");
		//driver.findElement(By.xpath("//input[@id='company']")).clear();
	//driver.findElement(By.xpath("//*[@id='company']")).sendKeys("prokarma");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("Kkutala");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Dady1234@");
		driver.findElement(By.xpath("//input[@id='retbutton']")).click();
		driver.close();
	
	
	}

}
