package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {

		 // Launch the browser (chrome)
         WebDriver driver = new ChromeDriver();
         
         // Open URL in the browser window
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
         // Maximize the browser window
         driver.manage().window().maximize();
         
         Thread.sleep(3000);  // pause execution for some time
         
         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
         
         driver.close(); // close browser
         
	}

}
