package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20new%20account%20create%7C&placement=&creative=589460569870&keyword=facebook%20new%20account%20create&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-21496185646%26loc_physical_ms%3D9303927%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw4omaBhDqARIsADXULuUA7cwV5VdUohibpxp1ZF2AIpMTWZe_8NARtDJXf-tYdiXrtq-q85IaAtqJEALw_wcB");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abhijit");
     Thread.sleep(2000);

     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nale");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[contains(@class,'_58mg')])[3]")).sendKeys("9561204131");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[contains(@class,'_58mg')])[5]")).sendKeys("12345678");
     Thread.sleep(2000);
     WebElement X=driver.findElement(By.xpath("//select[contains(@class,'_9407 ')]"));
     Select ele=new Select(X);
     ele.selectByIndex(18);
     Thread.sleep(2000);
     WebElement Y=driver.findElement(By.xpath("//select[contains(@class,'_9407 ')][2]"));
     Select el=new Select(Y);
     el.selectByIndex(4);
     Thread.sleep(2000);
     WebElement Z=driver.findElement(By.xpath("//select[@id='year']"));
     Select E=new Select(Z);
     E.selectByVisibleText("1998");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("(//button[contains(@class,'_6j')])[1]")).click();
}
}
