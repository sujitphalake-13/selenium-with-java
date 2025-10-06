package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Launch browser (Chrome)
2) Open URL https://demo.nopcommerce.com/
3) Validate title should be "nopCommerce demo store"
4) close page
*/

public class Practice {
	
	public static void main(String args[]) {
		
		// 1. Launch browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
		// 2. Open URL https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// 3. Validate title should be "nopCommerce demo store"
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is:" +actualTitle);
		
		if(actualTitle.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		// 4. Close browser
		driver.close();
	}
    
}
