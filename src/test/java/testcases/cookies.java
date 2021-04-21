package testcases;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    //capturing cookies from the browser 
	  Set<Cookie>cookies = driver.manage().getCookies();
	  System.out.println("size of the cooke before adding:"+cookies.size());
	  //driver.close();
	  
	  //print ecah cookies
	  
	  for(Cookie cookie:cookies)
	  {
		 System.out.println( cookie.getName()+cookie.getValue());
	  }
	   
	  //set cookie in browser
	  Cookie cookieobj=new Cookie("karthikcookie","1234");
	  driver.manage().addCookie(cookieobj);
	 
	  
	  //retrieving added  cookies from the browser 
	  Set<Cookie>cookies1 = driver.manage().getCookies();
	  System.out.println("size of the cooke after adding:"+cookies1.size());
	  
	  //deleteing added cookie 
	  
	  driver.manage().deleteCookie(cookieobj);
	  driver.manage().deleteCookieNamed("karthikcookie");
	 
	  
	  Set<Cookie>cookies2 = driver.manage().getCookies();
	  System.out.println("size of the cooke after deleting:"+cookies2.size());
	  
	 // deleting all cookies 
	  driver.manage().deleteAllCookies();
	  
	  Set<Cookie>cookies3 = driver.manage().getCookies();
	  System.out.println("size of the cooke after alldeleting:"+cookies3.size());
	  
	  driver.close();
	  
	  
	}

}
