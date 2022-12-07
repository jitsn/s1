package waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\123\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7387832692");

	Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(2))
	.ignoring(NoSuchElementException.class);
	
	  fluent.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='passrd']"))).sendKeys("abhi007");
	
	
	  //driver.findElement(By.xpath("//input[@id='email']")).;
	
	
	
	
	
}
}
