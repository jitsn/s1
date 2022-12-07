package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.meesho.com/");
	
	File SCR = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	File desti=new File("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\AUTOMATED SCREEN SHOTS\\third03.jpeg");
	
	FileHandler.copy(SCR, desti);
	
	
	
	
	
	
	
	
}
}
