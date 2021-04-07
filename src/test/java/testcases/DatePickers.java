package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Month selection 
		Select monthdrp =new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthdrp.selectByVisibleText("oct");

		
		//year dropdown
		
		Select yeardrp =new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yeardrp.selectByVisibleText("1990");
		
		String date ="15";
		  
		 List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		
		for ( WebElement ele:alldates)
			
		{
			
			String dt=ele.getText();
			
			if (dt.equals(date))
			{
				
				ele.click();
				break;
			}
			
		}
		
		driver.close();

	}

}
