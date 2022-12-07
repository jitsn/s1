package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(login).perform();
	
	WebElement orders = driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]"));
	
	act.click(orders).perform();
	
	
	
	
	
	
	
	
}
}
