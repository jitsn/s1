package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://open.spotify.com/");
			
			driver.switchTo().newWindow(WindowType.TAB);
			
			driver.get("https://wynk.in/music");
			
}
}