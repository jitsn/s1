package SelectBymethods;

import java.nio.channels.SelectionKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbymethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwwL6aBhBlEiwADycBIIl8roFsSEAvoWGAWB1eeZsw4aerh7E89_rfAGVHrfMEve7sNCQzoRoCIpQQAvD_BwE");
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select G=new Select(day);
		
		G.selectByIndex(7);
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select h=new Select(month);
		
		h.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select k=new Select(year);
		
		k.selectByValue("1997");
		
	   
		
		
		
		
		
		
		
}
}