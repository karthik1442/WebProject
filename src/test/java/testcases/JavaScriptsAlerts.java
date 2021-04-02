package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptsAlerts {

	public static void main(String[] args) throws InterruptedException {
		//https://the-internet.herokuapp.com/javascript_alerts

		//Test 1

		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alertWindow =driver.switchTo().alert();
		alertWindow.accept();
		System.out.println(alertWindow.getText());
		driver.close();*/
		
		//test 2
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alertWindow2 =driver.switchTo().alert();
		alertWindow2.dismiss();
		System.out.println(alertWindow2.getText());
		driver.close();*/
		
		
		//Test3
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alertWindow2 =driver.switchTo().alert();
		alertWindow2.sendKeys("hello karthik");
		alertWindow2.accept();
		//System.out.println(alertWindow2.getText());
		driver.close();
	
		
	}

}
