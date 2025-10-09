package day31;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) {

        // Launch the browser window
	    WebDriver driver = new ChromeDriver();
	    
	    // Implicit Wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    // Open URL in the browser window
	    driver.get("https://www.google.com/");
	    
	    // Maximize the browser window
	    driver.manage().window().maximize();
	    
	    // Google search textArea 
	    WebElement ele=  driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	    ele.sendKeys("selenium");
	    ele.click();
        
	    //
	    
	    
	    
	}

}
