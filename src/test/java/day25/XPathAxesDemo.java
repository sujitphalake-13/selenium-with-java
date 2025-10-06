package day25;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class XPathAxesDemo {

	public static void main(String[] args) {
		
		// 1. Launch browser(chrome)
		WebDriver driver = new ChromeDriver();
		
	    // 2. Open URL in browser
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		// 3. Maximize the browser window
		driver.manage().window().maximize();
		
		// 5. Self - Selects the current node
		
		

	}

}
