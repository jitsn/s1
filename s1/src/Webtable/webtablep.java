package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablep {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println(noofrows.size());
		for(int i=1;i<noofrows.size();i++) {
		List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		
		for(int j=0;j<noofcells.size();j++) {
			System.out.print(noofcells.get(j).getText()+",");	
		}
		System.out.println();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
