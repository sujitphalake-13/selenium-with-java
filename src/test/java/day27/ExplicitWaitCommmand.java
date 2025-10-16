package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommmand {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));   // Declaration
                
        // Open URL in the browser window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Username
        WebElement txtUserName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));   // Usages
        txtUserName.sendKeys("Admin");
        
        // Password
        WebElement txtPassword = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));   // Usages
        txtPassword.sendKeys("admin123");
        
        // Login Button
        // WebElement loginButton = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));   
        //loginButton.click();
        
        
       // When ever we got exception then only use avoid to use frequently for nonexception occurs elements
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        //driver.close();  // close browser
        
	}

}
