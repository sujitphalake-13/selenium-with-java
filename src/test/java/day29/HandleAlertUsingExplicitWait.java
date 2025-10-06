package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Handle Alert without switchTo().alert()
// By using explicit wait

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();

        // Explicit Wait
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open URL in the browser window
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Maximize the window size
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        
        Thread.sleep(5000);
        
        Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());
        
        System.out.println(myAlert.getText());
        myAlert.accept();  // close alert with OK button
        
        
	}

}
