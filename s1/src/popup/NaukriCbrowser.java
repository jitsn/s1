package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriCbrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	
	driver.findElement(By.xpath("(//a[@class='ntc__chip-wrapper'])[2]")).click();

	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> al=new ArrayList<String>(ids);
	
	String cw1 = al.get(1);
	driver.switchTo().window(cw1);
	
	driver.findElement(By.xpath("(//a[@class='title fw500 ellipsis'])[1]")).click();
	
	String cw0 = al.get(0);
	driver.switchTo().window(cw0);
	driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
	

}
}
