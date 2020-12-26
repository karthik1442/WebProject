
package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("karthikkutala");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("kutalakarthik@gmail.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Kutala1992@");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("Kutala1992@");
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='user_unsubscribe_from_marketing_emails']"));
		checkbox1.click();
		if (checkbox1.isSelected()) {
			System.out.println("checkbox1 is selcted ");

		} else {
			System.out.println("checkbox1 is not selected");
		}
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='user_agreed_to_terms']"));
		checkbox2.click();
		if (checkbox2.isSelected()) {
			System.out.println("checkbox2 is selcted ");

		} else {
			System.out.println("checkbox2 is not selected");
		}
		driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
		driver.close();

	}

}
