package day32;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// https://blazedemo.com/

public class Practice {

	public static void main(String[] args) {
		
		// Launch the browser window
		WebDriver driver = new ChromeDriver();
				
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open URL in the browser window
		driver.get("https://blazedemo.com/");
		
		// Maximize the browser window
	    driver.manage().window().maximize();
	    
	    // Find lowest price from price section and book flight and validate booking information
	    

	}

}
