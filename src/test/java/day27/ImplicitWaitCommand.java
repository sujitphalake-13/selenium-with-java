package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitCommand {

	public static void main(String[] args) {
		
		 // Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));  // Implicit wait Applicable for all locators as below
        
        // Open URL in the browser window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        
        driver.close();  // close browser
        
	}

}
