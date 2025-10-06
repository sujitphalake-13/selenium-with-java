package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Open application "https://www.demoblaze.com/index.html"
 Total number of links & print them
 Total number of images
 Click on any link using linkText/ PartialLinkText

*/

public class Practice {

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// 2. Open URL in browser
		driver.get("https://www.demoblaze.com/index.html");
		
		// 3. Maximize the browser window
		driver.manage().window().maximize();
		
		// 4. Total number of links & print them
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total numbers of links are:"+links.size());
        
        for(WebElement ls : links) {
        	System.out.println(ls.getText());
        }
        
        // 5. Total numbers of images
        List<WebElement> images = driver.findElements(By.tagName("img"));
    	System.out.println("Total numbers of images are:"+images.size());
    	
    	// 6. Click on Any link using linktext
    	driver.findElement(By.linkText("Contact")).click();
    	
    	// 7. Click on Any link using PartialLinkText
        WebElement partialLink = driver.findElement(By.partialLinkText("Cart"));
    	partialLink.click();
    	 
    	// 8. Close browser
    	driver.quit();

	}

}
