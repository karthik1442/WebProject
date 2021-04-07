package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		int row =driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println("totoal number of rows:"+row);
		int col=driver.findElements(By.xpath("\"//table[@class='data-list']/tbody/tr\"")).size();
		System.out.println("totoal number of rows:"+col);
		driver.close();
	}

}
