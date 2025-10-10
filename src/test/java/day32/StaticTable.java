package day32;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		// Launch the browser window
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open URL in the browser window
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize the browser window
	    driver.manage().window().maximize();
	    
	    // 1. Find total number of rows in a table
	    int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	    System.out.println("Number of rows are :"+rows);
	    
	    // 2. Find total number of columns in a table
	    int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	    System.out.println("Number of cols are :"+cols);
	    
	    // 3. Read data from specific row and column (EX: 5th row and 1st column)
	    String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	    System.out.println("5th row and 1st column cell value: "+bookName);   // Master In Selenium	
	    
	    // 4. Read data from all the rows and columns
	    /*
	    System.out.println("BookName	      Author	 Subject  Price");
	    for( int r = 2 ; r <= rows ; r++ ) {    // rows
	    	
	    	for( int c = 1 ; c <= cols ; c++ ){   // cols   //table[@name='BookTable']//tr[r]//td[c]  we cannot write like this
	    		
	    		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    		 System.out.print(value+"\t");
	    	}
	    	System.out.println();
	    }
	    */
	    
	    // 5. Print book names whose author is Mukesh
	    
	    for( int r = 2 ; r <= rows; r++ ) {
	    	String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	    	
	    	if(authorName.equals("Mukesh")) {
	    		String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	    		System.out.print(book+"\t");
	    	}
	    }
	    
	}

}
