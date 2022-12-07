package SelectBymethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeAndTagname {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/reg/");
    
	 //get attribute
    
    WebElement JKL=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
    String L = JKL.getAttribute("type");
    System.out.println(L);
    
    //to get tagname
    
    WebElement JK=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
    String K = JK.getTagName();
    System.out.println(K);
}
}
