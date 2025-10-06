package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Types of  Locators  -----> Locators --> 1) id
               |                         2) name
               |                         3) Linktext and PartialLinktext  ---> used to locate Link or HyperLink
               |
               |                         4) ClassName
               |                         5) TagName
               
               |----------> Customised Locators 
		                                  |
		                                  |
		 |--------------------------------|---------------------------------------|
         |                                                                        |
         |                                                                        |
  CSS Selectors                                                                X Path
    1. Tag and ID                                                         1. Absolute XPath
    2. Tag and Class                                                      2. Relative XPath  ----> Most Preferred to use Because it Dynamics in natures
    3. Tag and Attribute
    4. Tag, Class and Attribute
    
 Note:- Use Tag is Optional
    
                                                                                                         
1. id
2. name
3. Linktext
4. PartialLinktext 

Note:- id, name, Linktext / PartialLinktext ---> These locators are used to find single WebElement

5.ClassName
6.TagName

Note:- ClassName, TagName --->  These locators are used to find Multiple/ Group of WebElements
*/
public class LocatorsDemo {

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		// 2. Open URL https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// 3. Maximize the browser window
		driver.manage().window().maximize();
		
		// Basic Selenium Locators
		
		// 1. id
		//driver.findElement(By.id("customerCurrency")).click();
				
		// 2. name
		//driver.findElement(By.name("q")).sendKeys("Apple");
		
		// 3. Linktext 
		//driver.findElement(By.linkText("Register")).click();
		
		// 3. PartialLinktext
		//driver.findElement(By.partialLinkText("Reg")).click();
		
		// 4. TagName
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of links:"+links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());

		// 5. ClassName
		List<WebElement> headerLinks = driver.findElements(By.className("sublist-toggle"));
		System.out.println("Total number of links:"+headerLinks.size());
		
		// 6. close browser
		driver.close();

	}

}
