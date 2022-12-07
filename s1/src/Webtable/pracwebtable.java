package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracwebtable {
public static void main(String[] args) {
	//to set path for chrome browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    //to open browser
	WebDriver driver=new ChromeDriver();
	//to open web page
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	
	//to find no of rows
	List<WebElement> noofrows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	
	System.out.println(noofrows.size());
	
	//to find no of cells for each row
	for(int i=0;i<noofrows.size();i++) {
	List<WebElement> noofcells = driver.findElements(By.xpath("//table[@class='dataTable']//tr["+(i+1)+"]//td"));
    //System.out.println(noofcells.size());
    
    //to find all data from cells and rows
    for(int j=0;j<noofcells.size();j++) {
    	System.out.print(noofcells.get(j).getText()+                  ",");
    }
    System.out.println();
	}





}
}
