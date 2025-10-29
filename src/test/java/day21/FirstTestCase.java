package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test Case
 ----------
 1) Launch browser (chrome/Edge/Firefox)  ----> Recommand to choose Chrome browser
 2) Open URL https://www.opencart.com/
 3) Validate title should be "OpenCart - Open Source Shopping Cart Solution"
 4) Close browser
*/

public class FirstTestCase {

	public static void main(String[] args) {
	   
		// 1. Launch browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
		// 1.Launch browser (Firefox)
		//WebDriver driver = new FirefoxDriver();
		
		// 1. Launch browser (Edge)
		//WebDriver driver = new EdgeDriver();
		
		// 2. Open URL https://www.opencart.com/
		driver.get("https://www.opencart.com/");
		
		// 3. Validate title should be "OpenCart - Open Source Shopping Cart Solution"
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual Title is:" +actualTitle);
		
		if(actualTitle.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		// 4. Close browser
		driver.close();
		
	}

}
