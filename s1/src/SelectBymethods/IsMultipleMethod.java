package SelectBymethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement Multi = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		
		Select DFG=new Select(Multi);
		
		//get options method and size method
		
		List<WebElement> options = DFG.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
		for(int i=0;i<=options.size()-1;i++) {
        System.out.println(options.get(0).getText());
		}
		
		boolean L = DFG.isMultiple();
		
		System.out.println(L);
		
		if(L==true) {
			System.out.println("list box is multiselectable");
		}
		else {
			System.out.println("not multiselectable");
		}
		
}
}