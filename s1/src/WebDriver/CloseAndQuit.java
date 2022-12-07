package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://open.spotify.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://wynk.in/music");
		
		driver.close();
		
		Thread.sleep(1000);

		driver.quit();
}
}