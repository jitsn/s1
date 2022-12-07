package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                     import org.openqa.selenium.interactions.Actions;

public class ActionClassDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	
	WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(bank).clickAndHold().moveToElement(place).release().build().perform();
	
	Thread.sleep(2000);
	
    WebElement fivek = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
   
    WebElement place2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    
    act.dragAndDrop(fivek,place2).perform();
}
}
