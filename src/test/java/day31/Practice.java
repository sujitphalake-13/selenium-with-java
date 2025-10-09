package day31;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser window
	    WebDriver driver = new ChromeDriver();
	    
	    // Implicit Wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    // Open URL in the browser window
	    driver.get("https://www.swiggy.com/search");
	    
	    // Maximize the browser window
	    driver.manage().window().maximize();
	    
	    // Auto Suggestion dropdown
	    driver.findElement(By.xpath("//input[@class='ssM7E']")).sendKeys("Maggi");
	    
	    Thread.sleep(5000);
	    
	    List<WebElement> list = driver.findElements(By.xpath("//button[contains(@class,'xN32R')]"));
	    
        System.out.println("Size of the list :"+list.size());
	    
	    for(int i = 0 ; i < list.size(); i++) {
	    	
	    	System.out.println(list.get(i).getText());
	    }
	    

	}

}
