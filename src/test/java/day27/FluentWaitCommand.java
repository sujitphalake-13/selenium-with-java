package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitCommand {

    public static void main(String[] args) {

        // Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();

        // Fluent wait Declaration
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);

        // Open URL in the browser window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Fluent Wait usage to find Username input field
        WebElement txtUsername = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//input[@placeholder='Username']"));
            }
        });

        // Now, interact with the element
        txtUsername.sendKeys("Admin");

        // Should add driver.quit() at the end to close the session
        driver.quit();
    }
}
