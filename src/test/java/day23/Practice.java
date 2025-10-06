package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  UR:- https://tutorialsninja.com/demo/
  
  Try to write CSS locators to identify elements.
 */

public class Practice {

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome)
		WebDriver driver = new ChromeDriver();
				
		// 2. Open URL in browser
		driver.get("https://tutorialsninja.com/demo/");
		
		// 3. Maximize the browser window
		driver.manage().window().maximize();
		
		// 4. tag id  ---> tag#id
		driver.findElement(By.cssSelector("div#cart")).click();
		
		// 5. tag class ---> tag.className
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mac");
		
		// 6. tag attribute  ---> tag[attribute='value']
		driver.findElement(By.cssSelector("button[data-toggle='dropdown']")).click();
		
        // 7. Close browser
		driver.close();
	}

}
