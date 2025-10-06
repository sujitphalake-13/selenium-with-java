package day29;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

    public static void main(String[] args) throws InterruptedException {

        // Launch the browser (chrome)
        WebDriver driver = new ChromeDriver();

        // Implicit Wait - corrected to 5 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open URL in the browser window
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Maximize the window size
        driver.manage().window().maximize();

        /* 1. Simple alert with OK button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        // Add sleep if you want to see the alert (for demo/testing only)
        Thread.sleep(5000);

        // Switch to alert and accept it
        Alert myAlert = driver.switchTo().alert();
        
        System.out.println("Simple Alert message: "+ myAlert.getText());   // get message so we can validate the alert window
        myAlert.accept();    // Close alert window using 'OK' button
        
        */
        
       /* 2. Confirmation Alert - OK & Cancel
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        
        Thread.sleep(5000);
        
        Alert myAlert = driver.switchTo().alert();
        //myAlert.accept();  // close alert using OK button
        myAlert.dismiss();  // close alert using Cancel Button  use any one of them

        */
        
        // 3. Prompt alert - Input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        
        Thread.sleep(5000);
        
        Alert myAlert = driver.switchTo().alert();
        myAlert.sendKeys("Welcome");
        myAlert.accept();  // close alert using OK button
       // myAlert.dismiss();  // close alert using Cancel Button  use any one of them

        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(result);
        
        if(result.equals("You entered: Welcome")) {
        	System.out.println("Test Pass");
        }else {
        	System.out.println("Test Fail");
        }
        
    }
}
