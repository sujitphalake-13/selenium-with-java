package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		//Create a instance of ChromeOptions class
	    ChromeOptions options = new ChromeOptions();
	    
	    //Add Chrome switch to disable notification - "**--disable-notifications**"
	    options.addArguments("--disable-notifications");
	    
	    System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	
	  //Pass ChromeOptions instance to ChromeDriver Constructor    this is for disable notification on browser window
		WebDriver driver = new ChromeDriver(options);
				
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				
		// Open URL in the browser window
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
		// Maximize the window size
		driver.manage().window().maximize();
	    
	   
		driver.findElement(By.xpath("//input[@id='select-input-429719']")).click();   // Opens the dropdown options
		
		// Select single Option
		driver.findElement(By.xpath("//span[normalize-space()='One']//input[@type='checkbox']")).click();
		
		

	}

}
