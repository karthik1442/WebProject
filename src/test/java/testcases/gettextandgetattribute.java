package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettextandgetattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	     driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	     
	   WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
	   
	     email.clear();
	     email.sendKeys("karthik.kutalla@gmail.com");
	     WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	  
	     password.clear();
	     password.sendKeys("ap29bx1442@");
	     driver.close();

	     Thread.sleep(2000);
	     WebElement loginbutton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
	     loginbutton.getText();
	     System.out.println(loginbutton);
	     driver.close();
	}
	

}
