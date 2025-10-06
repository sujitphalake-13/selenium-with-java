package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUps {

	public static void main(String[] args) {
		
		// Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();

        // https://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        // Maximize the window size
        driver.manage().window().maximize();
 
         
	}

}
