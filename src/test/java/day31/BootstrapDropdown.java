package day31;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
	public static void main(String[] args) {
		
		// Launch the browser window
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		// Open URL in the browser window
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
		// Maximize the window size
		driver.manage().window().maximize();
	   
		driver.findElement(By.xpath("//input[@id='select-input-5335']")).click();   // Opens the dropdown options
		
		// Select single Option
		driver.findElement(By.xpath("//span[normalize-space()='Two']//input[@type='checkbox']")).click();
		
		

	}

}
