package day33;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		
		// Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Open URL into the browser window
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Count the rows count into the table
		int rows = driver.findElements(By.xpath("//table[@id='taskTable']//th")).size();
		System.out.println("Number of rows are: "+rows);
		
        // Count the cols into the table
		int cols = driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
		System.out.println("Number of cols are: "+cols);
		
		// Print 4 row and 2 column
		String value = driver.findElement(By.xpath("//table[@id='taskTable']//tr[4]//td[2]")).getText();
		System.out.println("print 4 row and 2 colum: "+value);
		
		// Print all table data
		System.out.println(" Name  Disk(MB/s) CPU(%)   Network(Mbps)	Memory(MB)  ");
		for( int r = 1 ; r < rows ; r++ ) {
			
			for( int c = 1 ; c <= cols ; c++) {
				String cell = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(cell+"   ");	
			}
			System.out.println();
		}
		
		// Close driver
		driver.quit();
		
	}

}
