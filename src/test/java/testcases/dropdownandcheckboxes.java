
package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownandcheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropdown.selectByIndex(0);
		Thread.sleep(3000);
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("INDIA");
		Select dropdown1 = new Select(driver.findElement(By.xpath("//input[@id='autocomplete']")));
		dropdown1.selectByIndex(0);
		if (((WebElement) dropdown1).isSelected()) {
			System.out.println("checkbox3 is selcted");

		} else {
			System.out.println("checkbox3 is not selcted");

		}

		driver.close();

	}

}
