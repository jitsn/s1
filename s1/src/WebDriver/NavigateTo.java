package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wynk.in/music");
		
		driver.navigate().to("https://wynk.in/music/package/new-english-songs/bb_1398415604876");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);

		driver.navigate().back();
		
		Thread.sleep(1000);

		driver.navigate().refresh();

		
}
}