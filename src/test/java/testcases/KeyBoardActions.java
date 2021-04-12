package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://text-compare.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement input1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	    WebElement input2 =driver.findElement(By.xpath(" //textarea[@id='inputText2']"));
	    
	    //control+a
	    input1.sendKeys("welcome to my world");
	    Actions act =new Actions(driver);
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	   // control +c
	    
	    Actions act1 =new Actions(driver);
	    act1.keyDown(Keys.CONTROL);
	    act1.sendKeys("c");
	    act1.keyUp(Keys.CONTROL);
	    act1.perform();
	    
	    //tab 
	    Thread.sleep(3000);
	    act.sendKeys(Keys.TAB);
	    act.perform();
	    
	    //control v 
	    
	    Actions act2 =new Actions(driver);
	    act2.keyDown(Keys.CONTROL);
	    act2.sendKeys("v");
	    act2.keyUp(Keys.CONTROL);
	    act2.perform();
	    
	    if(input1.getAttribute("value").equals(input2.getAttribute("value"))){
	    	
	         System.out.println("text is not copied");
	    	
	    }
	    else{
	    System.out.println("tesxt is npt copied");
	    	
	    }
	   
	    driver.close();
	    
	}

}
