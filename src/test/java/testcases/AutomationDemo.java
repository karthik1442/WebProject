package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://urldefense.com/v3/__https:/vaccine-locator-dot-p-dhhs-itd-vref-qa.ue.r.appspot.com/__;!!HYmSToo!LRue_XC1RHZ8s7njauxpXe-Usu4cvSHJiDAS-c5BhJdjQb6zOX2rvCsz0qcLmZYKBHUt$");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("75287");
		driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.print(alertMessage1);
		alert1.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
