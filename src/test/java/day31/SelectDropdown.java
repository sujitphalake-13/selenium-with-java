package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		// Open URL in the browser window
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize the window size
		driver.manage().window().maximize();
		
		// 1. Select Dropdown
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select selectDrp = new Select(drpCountryEle);
		
		// Select options selectByVisibleText()
		selectDrp.selectByVisibleText("India");
		
		// Select options selectByIndex()
		selectDrp.selectByIndex(4);
		
		// Select Options selectByValue()
        selectDrp.selectByValue("india");
        
        // getAll dropdown Element using getOptions()
        List<WebElement> drpOptions = selectDrp.getOptions();
        int count = drpOptions.size();
        System.out.println("Count of WebElement in dropdown :"+count);
        
        for( int i = 0 ; i < drpOptions.size() ; i++ ) {
        	String ele = drpOptions.get(i).getText();
        	System.out.println(ele);
        }
        
        // Enhanced for loop
        /*
        for(WebElement option :drpOptions) {
        	System.out.println(option.getText());
        }
        */
        
        // Close driver
        driver.close();
	}

}
