package TestAutomationScripts;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ContactFlow {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/#/index");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[normalize-space()='Contact']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("karthik");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='country']")).sendKeys("united states ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys("2222222222");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kutalakarthik@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("how are you doing ?");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Send Message']")).sendKeys("how are you doing ?");
			Thread.sleep(3000);
	        Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='subject']")));
	        dropdown.selectByIndex(3);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[normalize-space()='Send Message']")).click();
	        Thread.sleep(5000);
	        /*Alert alert=  driver.switchTo().alert();
	        String stringmessage=driver.switchTo().alert().getText();
	        System.out.print("stringmessage");
	        alert.accept();*/
	        driver.close();
	        
	    

		}
	}

	
	

