package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805646%7Cb%7Cfacebook%20new%20account%20create%7C&placement=&creative=550525805646&keyword=facebook%20new%20account%20create&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-21496185646%26loc_physical_ms%3D9303927%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwqJSaBhBUEiwAg5W9p52oEMH5hKyZb5tIS94Fn0LRUWNK4BE3SWU5UoaJd9Yv_zqO_MGXHxoCKgkQAvD_BwE");
	//for option hidden in  custom gender
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	
	boolean year1 = year.isDisplayed();
	
	System.out.println(year1);
	
	if(year1==true) {
		System.out.println("element is displayed");
	}
	else {
		System.out.println("not displayed");
	}
	//for first name
    WebElement ye = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	
	boolean ye1 = ye.isDisplayed();
	
	System.out.println(ye1);
	
	if(ye1==true) {
		System.out.println("element is displayed");
	}
	else {
		System.out.println("not displayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
