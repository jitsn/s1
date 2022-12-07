package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7387832692");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abhi007");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@value='1']")).click();
    Thread.sleep(8000);
    driver.quit();

}
}
