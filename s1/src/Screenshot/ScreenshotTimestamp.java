package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTimestamp {
	public static void main(String[] args)throws InterruptedException, IOException { 
		
		 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	
	File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Date d = new Date();
	
    System.out.println(d);
    
    String FileName = d.toString().replace(":", "_").replace(" ", "_");
    
    System.out.println(FileName);
	
	File dest=new File("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\AUTOMATED SCREEN SHOTS " + FileName + ".jpeg");
	
	FileHandler.copy(SRC, dest);
	       
	
}
}
