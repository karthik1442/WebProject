package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		Thread.sleep(3000);
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio1.click();
		System.out.println("radio button1 is selcted ");
		radio2.click();
		System.out.println("radio button2 is selcted ");

		if (radio1.isSelected()) {
			System.out.println("radio button1 is selcted ");  
		} else

		{
			System.out.println("radio button1 is  not selcted ");

		}

		if (radio2.isSelected()) {
			System.out.println("radio button2 is selcted ");
		} else

		{
			System.out.println("radio button2 is  not selcted ");

		}

		// verifying checkBoxes
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (checkbox1.isSelected()) {
			System.out.println("checkbox1 is selcted");

		} else {

			System.out.println("checkbox1 is not selcted");
		}

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		checkbox2.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		if (checkbox2.isSelected()) {
			System.out.println("checkbox2 is selcted");

		} else {
			System.out.println("checkbox2 is not selcted");

		}

		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		checkbox3.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (checkbox3.isSelected()) {
			System.out.println("checkbox3 is selcted");

		} else {
			System.out.println("checkbox3 is not selcted");

		}

		driver.close();

	}



	}


