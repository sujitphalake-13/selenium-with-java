package day35;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.WebDriver;


public class MouseActions {

	public static void main(String[] args) {
		
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		// Open URL in the browser window
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize the size of browser window
		driver.manage().window().maximize();

	}

}
