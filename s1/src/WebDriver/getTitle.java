package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://wynk.in/music");
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String exptitle = "Free Music Online: Play & Download MP3 Songs | Wynk Music";

	
	if(exptitle.equalsIgnoreCase(title)) {
		System.out.println("Title is correct");
	}
	else {
		System.out.println("Title is wrong");
	}
	
	


























}
}
