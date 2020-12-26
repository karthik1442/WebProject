
package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.print(alertMessage);
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kutala");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.print(alertMessage1);
		alert1.accept();
		driver.close();

	}

}
