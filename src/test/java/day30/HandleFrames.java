package day30;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open URL in browser window
        driver.get("https://ui.vision/demo/webtest/frames/");

        // Maximize the window size
        driver.manage().window().maximize();
        
        // Frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);  // switchTo.frame(WebElement)
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1");
        
        driver.switchTo().defaultContent();  // go back to page
        
        // Frame2   Note:- Switching frame1 to frame2 not possible so we have to go back to web page
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);   // switchTo.frame(WebElement)
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2");
        
        driver.switchTo().defaultContent(); // go back to page
        
        // Frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3");
        
        // inner iframe - part of Frame3
        driver.switchTo().frame(0);
        
        WebElement rdButton = driver.findElement(By.xpath("//div[@id='i6']//div[@class='rseUEf nQOrEb']"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", rdButton);
        
        WebElement checkbox = driver.findElement(By.xpath("//div[@class='rq8Mwb']"));
        JavascriptExecutor js1 =(JavascriptExecutor)driver;
        js1.executeScript("arguments[0].click();", checkbox);
        
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();  // Click on Next button
        
        driver.switchTo().defaultContent();
        
        
        
	}

}
