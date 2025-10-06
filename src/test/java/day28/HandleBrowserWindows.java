package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

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
		
		/*
		// Approach 1
		List<String> windowList = new ArrayList<String>(windowIds);   // convert Set to List for extract data using get(index) method is present in List but absence in Set interface
		
		String parentID = windowList.get(0);  
		String childID = windowList.get(1);
		
		
		// switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		// switch to Parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
	    */
		// Approach 2
		
		for(String winId : windowIds) {
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println("Title of the Web Page: "+title);
			System.out.println(driver.getCurrentUrl());
		}
		
		
		
		
	}	
}
