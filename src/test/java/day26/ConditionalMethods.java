package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// Open URL on browser window
		driver.get("https://demo.nopcommerce.com/register");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// 1. isDisplayed() --> is applicable for all types of elements
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
        System.out.println("Is Logo display : "+logo.isDisplayed());
        
        // 2. isEnabled()--> is applicable for checkbox, radio button, input box, button , dropdown etc
       boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
       System.out.println("Enable Status : "+status); 
       
       // 3. isSelected()---> radio button, checkbox, dropdown etc
       WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
       WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
       
       System.out.println("=========== Before Selection Status =========="); 
       System.out.println("Male radio button Status : "+male_rd.isSelected()); 
       System.out.println("Female radio button Status : "+female_rd.isSelected()); 

      
       System.out.println("=========== After Selecting Male Radio Button Status =========="); 
       male_rd.click();
       System.out.println("Male radio button Status : "+male_rd.isSelected()); 
       System.out.println("Female radio button Status : "+female_rd.isSelected()); 
       
       
       System.out.println("=========== After Selecting Female Radio Button Status =========="); 
       female_rd.click();
       System.out.println("Male radio button Status : "+male_rd.isSelected()); 
       System.out.println("Female radio button Status : "+female_rd.isSelected()); 
       
       
       System.out.println("=========== After Selecting Male and Female Radio Button Status =========="); // Note:- We click only one radio button at time
       male_rd.click();  // So here basically first male radio button click then Female radio button click method override it that why we got female_rd is true
       female_rd.click();
       System.out.println("Male radio button Status : "+male_rd.isSelected()); 
       System.out.println("Female radio button Status : "+female_rd.isSelected()); 
       
       System.out.println();
       
      boolean newsletterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
      System.out.println("NewsLetter Checkbox Status :"+newsletterStatus);
      
      
	}
}
