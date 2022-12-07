package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	
	Set<String> ids = driver.getWindowHandles();//to get main page and child browser address
	
	ArrayList<String> al=new ArrayList<String>(ids);//to store main and child browser address
	
	String cwid = al.get(1);//to go only at child window with the help of index of child browser 
	
	driver.switchTo().window(cwid);//to focus on child browser
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	String mpid = al.get(0);
	
	driver.switchTo().window(mpid);
	
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	
}
}
