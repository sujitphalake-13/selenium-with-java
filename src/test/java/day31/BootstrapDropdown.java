package day31;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BootstrapDropdown {
	

	public static void main(String[] args) {
		
		// Launch the browser window
		WebDriver driver = new ChromeDriver();
		
		// FluentWait setup
		Wait<WebDriver> myWait = new FluentWait<>(driver)
		    .withTimeout(Duration.ofSeconds(20))
		    .pollingEvery(Duration.ofSeconds(5))
		    .ignoring(Exception.class);

		// Wait for the cookie button and click
		myWait.until(ExpectedConditions.elementToBeClickable(By.id("accept_cookies_btn"))).click();
				
		// Open URL in the browser window
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
		// Maximize the window size
		driver.manage().window().maximize();
	   
		driver.findElement(By.xpath("//input[@id='select-input-5335']")).click();   // Opens the dropdown options
		
		// Select single Option
		driver.findElement(By.xpath("//span[normalize-space()='Two']//input[@type='checkbox']")).click();
		
		

	}

}
