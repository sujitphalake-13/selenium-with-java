package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
		WebDriver driver = new ChromeDriver();
				
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
				
		// Open URL in the browser window
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		// Maximize the window size
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		// Select single Option
		driver.findElement(By.xpath("//span[@class='comboTreeItemTitle'][normalize-space()='choice 3']//input[@type='checkbox']")).click();
		
		

	}

}
