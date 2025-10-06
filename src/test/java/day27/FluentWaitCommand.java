package day27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitCommand {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// Open URL in the browser window
		driver.get("");
		
		// Maximize the window size
		driver.manage().window().maximize();
		
		
		
	}

}
