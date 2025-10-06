package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
	    driver.manage().window().maximize();
		
		// Open URL on browser window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  // Open another browser window
		
		Thread.sleep(5000);
		
		// browser methods() 
		//driver.close(); // Close the single browser window where the driver is focused
		
		 driver.quit();    // Close all the browser window
		
		// 
	}

}
