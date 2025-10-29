package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitCommand {

    public static void main(String[] args) {

        // Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();

        // Fluent wait Declaration
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

        // Open URL in the browser window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window
        driver.manage().window().maximize();
        
       // Use FluentWait to wait for a condition
        WebElement element = myWait.until(
        	    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))
        );

        // Now, interact with the element
        element.sendKeys("Admin");

        // Should add driver.quit() at the end to close the session
        driver.quit();
    }
}
