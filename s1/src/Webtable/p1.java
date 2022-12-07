package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
public static void main(String[] args) {
	    //to set path for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    //to open browser
		WebDriver driver=new ChromeDriver();
		//to open web page
		driver.get("http://demo.guru99.com/test/table.html");
		//to focus on table
		WebElement table = driver.findElement(By.xpath("//table[@cellspacing='1']"));
		//to get no of rows
		List<WebElement> nofrows = table.findElements(By.xpath("//table[@cellspacing='1']//tr"));
		
		int rownums = (nofrows.size());
		System.out.println("No of rows in table :" +rownums);
		
		//to get no of cells
		for(int i=0;i<rownums;i++) {
		List<WebElement> noofcells = table.findElements(By.xpath("//table[@cellspacing='1']//tr["+(i+1)+"]//td"));
		
		//no of cells for each row
		int cellnums = (noofcells.size());
		System.out.println("No of cells in row "+ (i) + " are " + cellnums);
		for(int j=0;j<cellnums;j++) {
			 String data = (noofcells.get(j).getText());
			System.out.println("cell value of ro number " + i + " and column number " + j + " is "+ data);
		}
		System.out.println();
	
		
		}
}
}
