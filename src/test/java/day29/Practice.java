package day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open URL in browser window
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the window size
        driver.manage().window().maximize();
        
        
	}

}
