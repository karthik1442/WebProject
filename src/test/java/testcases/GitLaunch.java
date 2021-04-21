package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://github.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("kutalakarthik@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ap29bx1442@");
	    driver.findElement(By.xpath("//input[@name='commit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"repos-container\"]/ul/li[1]/div/a/span[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//summary[@title='Switch branches or tags']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='context-commitish-filter-field']")).sendKeys("Develop_branch");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[normalize-space()='Develop_branch']")).click();
	    Thread.sleep(2000);
	    //driver.close();
	}
 
}
