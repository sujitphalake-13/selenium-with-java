package day35;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MouseActions {

	public static void main(String[] args) {
		
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open URL in the browser window
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize the size of browser window
		driver.manage().window().maximize();
		
		// Actions class for Mouse actions
		Actions action = new Actions(driver);
		
		// 1. Mouse Hover action
		WebElement hover = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		
		Actions act = action.moveToElement(hover);

		//act.build();             // create an action
		act.perform();           // build an action
		
		
		// 2. Mouse Double click action
        Actions dAct = action.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']")));
		
		dAct.click().perform();         // build an action
		
		// 3. Mouse Right Click action
		
		action.contextClick(driver.findElement(By.xpath("//button[@class='start']"))).perform();
		
		
		// 4. Mouse Drag and Drop action
		WebElement draggleSource = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppleTarget = driver.findElement(By.xpath("//div[@id='droppable']"));
		
        action.dragAndDrop(draggleSource, droppleTarget).perform();
		
		
		
	}

}
