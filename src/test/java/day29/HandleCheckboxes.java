package day29;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

    public static void main(String[] args) throws InterruptedException {

        // Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();

        // Implicit Wait - corrected to 5 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open URL in the browser window
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the window size
        driver.manage().window().maximize();

        // Select Specific checkBox by id 'sunday'
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        
        // Select All checkBox by XPath
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        
        /* using Enhanced for loop
        for(WebElement ele : checkboxes) {
        	ele.click();
        }
        */
        
        /* Using Regular For loop
        for(int i = 0 ; i < checkboxes.size(); i++) {
        	checkboxes.get(i).click();
        }
        */
        
        /* select last 3 Checkboxes
        for(int i = checkboxes.size()-3 ; i < checkboxes.size() ; i++) {
        	checkboxes.get(i).click();
        }
        */
        
        /* Select first 3 checkboxes
        for(int i = 0; i < checkboxes.size()-4; i++) {
        	checkboxes.get(i).click();
        }
        */
        
        // Unselect checkboxes if they are selected
        for(int i = 0; i < checkboxes.size(); i++) {    // This Loop select odd number position of checkboxes
        	checkboxes.get(i).click();
        	i++;
        }
        
        Thread.sleep(5000);
        
        for(int i = 0; i < checkboxes.size(); i++) {     // This Loop Unselect  only previous select checkboxes
        	if(checkboxes.get(i).isSelected()) {
        	    checkboxes.get(i).click();
        	    i++;
        	}    
        }
        
        
    }
}
