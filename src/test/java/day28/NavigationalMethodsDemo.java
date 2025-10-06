package day28;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethodsDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		// Launch the browser(chrome)
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// get(URL)---> Open URL in browser window
		//driver.get("https://demo.nopcommerce.com/");     // accept URl only in string format.
		
		// navigate.to()----> Open URL in browser window
		driver.navigate().to("https://demo.nopcommerce.com/");     // accept URl only in string format 
		
		//URL myURL = new URL("https://demo.nopcommerce.com/");     // accept URl only in URL object format 
		//driver.navigate().to(myURL);
		
		// navigate.to(URL)
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());      //  https://demo.nopcommerce.com/
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());    //  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		driver.navigate().refresh();   // reload page
	}
}
