package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxMinWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wynk.in/music");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
        Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
}
}