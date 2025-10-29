package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// 2. Open URL in browser
		driver.get("https://demo.nopcommerce.com/");
		
		// 3. Maximize the browser window
		driver.manage().window().maximize();
		
		// 4. tag id --> tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");   ---> using tag is optional in css selectors

        // 5. tag class ---> tag.className
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");

		// 6. tag attribute ---> tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");

		// 7. tag class attribute ---> tag.className[attribute='value']
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-Shirts");

		// 8. close browser
		driver.close();
	}

}
