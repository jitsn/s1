package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeSizeOfWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		Dimension G=new Dimension(250, 450);
		
		driver.manage().window().setSize(G);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
}
}