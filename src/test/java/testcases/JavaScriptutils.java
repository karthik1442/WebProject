package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptutils {

	
	
	/*public static void drawBorder(WebElement element,WebDriver driver)
	
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguements[0].style.border='3px slod red'",element);
	}*/

	public static void drawBorderByJs(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguements[0].style.border='3px solid red'",element);
	
	}
	
	
	/*public static void scrollpageDownByJs(WebDriver driver )
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,docuemnt.body.scrollHeight)");
	
	}*/
	
	
	
	/*public static void scrollpageUpByJs(WebDriver driver )
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-docuemnt.body.scrollHeight)");
	
	}*/


	public static void scrollpageDownByJs(WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,docuemnt.body.scrollHeight)");
	
	}


	public static void scrollpageUpByJs(WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-docuemnt.body.scrollHeight)");
	
		
		
	}
	
	
}
