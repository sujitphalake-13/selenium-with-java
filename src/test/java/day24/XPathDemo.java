package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome)
		WebDriver driver = new ChromeDriver();
						
		// 2. Open URL in browser
		driver.get("https://tutorialsninja.com/demo/");
		
		// 3. Maximize the browser window
		driver.manage().window().maximize();
		
		// 1. XPath with Single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook");
		
		// 2. XPath with Multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'] [@placeholder='Search']")).sendKeys("Canon");
		
		// 3. XPath with 'and' operators
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("iPhone");
		
		// 4. XPath with 'or' operators
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='search']")).sendKeys("Mac");
		
		// 5. XPath with text() - inner text
		//driver.findElement(By.xpath("//a[text()='Apple Cinema 30\"']")).click();
		/*
		boolean displayStatus = driver.findElement(By.xpath("//a[text()='MacBook']")).isDisplayed();
        System.out.println(displayStatus);
        
        String value = driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
        System.out.println(value);
        */
		
        // 6. XPath with contains(@attribute, 'value')
        //driver.findElement(By.xpath("//input[contains(@placeholder, 'rch')]")).sendKeys("MacBook");
        
        // 7. XPath with starts-with(@attribute, 'value')
        //driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("T-Shirts");
        
        // 8. Chained XPath 
        boolean status = driver.findElement(By.xpath("//div[@id='logo']/h1/a")).isDisplayed();
        System.out.println(status);
		
	}

}
