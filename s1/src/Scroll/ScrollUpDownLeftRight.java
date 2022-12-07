package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownLeftRight {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.album.alexflueras.ro/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll down
		
		js.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(2000);
		//scroll up
		
		js.executeScript("window.scrollBy(0,-300)");
		
		Thread.sleep(2000);
		//scroll right
		
		js.executeScript("window.scrollBy(2000,0)");
		
		Thread.sleep(2000);
		//scroll left
		
		js.executeScript("window.scrollBy(-2000,0)");
	}

}
