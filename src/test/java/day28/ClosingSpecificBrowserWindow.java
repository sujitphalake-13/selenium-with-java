package day28;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
		WebDriver driver = new ChromeDriver();
				
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open URL in the browser window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Maximize the window size
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String winId : windowIds) {
			
			// Using URl of the Web Page
			String URl = driver.switchTo().window(winId).getCurrentUrl();
			
			if(URl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") || URl.equals("https://www.orangehrm.com/")) {

				driver.close();
			}
			
			/*
			 Using title of the web Page
			//String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM") || URl.title("Human Resources Management Software | HRMS | OrangeHRM")) {

				driver.close();
			}
			*/
		}
	}

}
