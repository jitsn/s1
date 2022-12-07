package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
   
	WebDriver driver=new ChromeDriver();
    
    driver.get("http://demo.guru99.com/test/guru99home/");
    // navigates to the page consisting an iframe
    
      int size = driver.findElements(By.tagName("iframe")).size();
      
                        System.out.println(size);

    
    driver.switchTo().frame("a077aa5e");//switching the frame by ID
   
    
    System.out.println("********We are switch to the iframe*******");
    
    driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click(); //Clicks the iframe(image)
    
    System.out.println("*********We are done***************");
    
    Thread.sleep(1000);

    driver.switchTo().parentFrame();
    //driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//a[@class='button-liveproject']")).click();








}
}
