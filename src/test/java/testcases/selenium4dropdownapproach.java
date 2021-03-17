package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium4dropdownapproach {

	public static void main(String[] args) {

		//approach 1
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Select empDrop =new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']")));
		//Select indDrop =new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']")));
		//Select countryDrop =new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']")));
		
		//approah2 
		
		WebElement NoofEmpele =driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
		WebElement IndustryEle =driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
		WebElement CountryEle =driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
	

	}
	
	public static <webElement> void selectoptionFromDropdown(WebElement ele , String value)
	
	{
	
		Select drp = new Select (ele);
		List<WebElement>allOptions=drp.getOptions();
		
		for(WebElement options:allOptions)
		{
			
			
			if(options.getText().equals("cuba"))
				
			{
				options.click();
				break;
			}
		}
	}
	
	
}
