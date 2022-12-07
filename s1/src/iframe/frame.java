package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		System.out.println("-----iframe start-------");
		WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])[1]"));
		driver.switchTo().frame(iframe1);
		System.out.println("-----iframe end-------");

		System.out.println("-----iframe start-------");
		WebElement iframe2 = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 250px;width: 400px'])"));
		driver.switchTo().frame(iframe2);
		System.out.println("-----iframe end-------");

		
		WebElement txtbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
         
		txtbox.click();
		txtbox.sendKeys("abhi");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();

		
		
	}
}
