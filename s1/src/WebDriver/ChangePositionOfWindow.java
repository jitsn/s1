package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePositionOfWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Dimension F=new Dimension(250, 450);
			
		driver.manage().window().setSize(F);	
		
		Thread.sleep(3000);
		
		Point G=new Point(150, 100);
		
		driver.manage().window().setPosition(G);
		
		
		
}
}