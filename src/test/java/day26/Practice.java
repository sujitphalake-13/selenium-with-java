package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  URL :- "https://testautomationpractice.blogspot.com/"
  WebDriver Methods
  1. get Methods --> get(URL), getTitle(), getCurrentURL(), getPageSource(), getWindowHandle(), getWindowHandles() etc.
  2. conditional Methods --> isDisplayed(), isSelected(), isEnabled() etc.
  3. browser Methods --> close(), quit() etc.
*/

public class Practice {

	public static void main(String[] args) {
		
		// Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
				
		// get(URL)
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// getTitle()
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		// getCurrentURL()
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: "+url);
		
		// getPageSource()
		//String pageSourceCode = driver.getPageSource();
		//System.out.println("Page  Source code is: "+pageSourceCode);
		
		// getWindowHandle()
		String windowId = driver.getWindowHandle();
		System.out.println("Single window browser id: "+windowId);
		
		// getWindowHandles()
		
		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();  // open new window using this statement
		
		Set<String> windowIds = driver.getWindowHandles();
		
		System.out.print("Multiple window browser id: "+windowIds);
		
	}

}
