package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getURL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://open.spotify.com/");
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
		String expURL = "https://open.spotify.com/";
		
		if(expURL.equalsIgnoreCase(URL)) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("url is wrong");
		}

		
}
}