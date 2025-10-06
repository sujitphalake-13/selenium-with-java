package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser(chrome)
		WebDriver driver = new ChromeDriver();
		
		// 1. get(URL)- Open URL in browser window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		// Maximize the browser window
		driver.manage().window().maximize();
		;
        // 2. getTitle()- Returns the title of the page
        String actualTitle = driver.getTitle();
        System.out.println("Title of the web page is: "+actualTitle);
        
        // validate the title of the web page
        if(actualTitle.equals("OrangeHRM")) {
            System.out.println("Test Passed");
        }else {
        	  System.out.println("Test Failed");
        }
        
        // 3. getCurrentUrl()- Return the URL of the page
        String actualURL = driver.getCurrentUrl();
        System.out.println("URL of the web page is: "+actualURL);
        
        // validate the URL of the web page
        if(actualURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
            System.out.println("Test Passed");
        }else {
        	  System.out.println("Test Failed");
        }
        
        // 4. getPageSource()- Returns source code of the page
        //String pageSourceCode = driver.getPageSource();
       // System.out.println("Page Source Code is "+pageSourceCode);
        
        // 5. getWindowHandle()- Returns ID of the single browser window
        String windowId = driver.getWindowHandle();
        System.out.println("Browser window Id: "+windowId);  // Browser window Id: 3F32C37A073F3B1E74134FDFC09C167C    Browser window Id: 512B364CB3DFD699EB5548FA858FAD25
                                                             // Note:- Every time new browser id generated it means its dynamic
        
        // 6. getWindowHandles()- Returns ID's of the Multiple browser windows
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();  // Open new browser window
        
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println("Windows ids are: "+windowIds);
        
         
	}
}
