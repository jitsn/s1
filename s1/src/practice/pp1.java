package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pp1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\123\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
//		WebElement rad = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		
//		boolean hj = rad.isSelected();
//		
//		if(hj) {
//			System.out.println("radio 2 is selected");
//		}
//		else {
//			System.out.println("radio 2 is not selected");
//		}
//		
//		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		
//		Select sa=new Select(drop);
//		
//		sa.selectByIndex(2);
//		
//		driver.findElement(By.xpath("(//input[contains(@id,'checkBox')])[3]")).click();
		
//		driver.findElement(By.xpath("//a[@id='opentab']")).click();
//		
//		driver.findElement(By.xpath("//a[@id='opentab']")).click();
//		
//		driver.findElement(By.xpath("//a[@id='opentab']")).click();
//		
//		driver.findElement(By.xpath("//a[@id='opentab']")).click();
//		
//		Set<String> as = driver.getWindowHandles();
//		
//		ArrayList<String> al=new ArrayList<String>(as);
//		
//		String cw3 = al.get(2);
//		
//		driver.switchTo().window(cw3);
//		
//		String cw5 = al.get(4);
//		
//		driver.switchTo().window(cw5);
//		
//        String cw0 = al.get(0);
//		
//		driver.switchTo().window(cw0);
//		
//		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("abhi");
//		
//		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
//		
//		Alert aj = driver.switchTo().alert();
//	    aj.accept();
//        System.out.println("iframe start");
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
//		
//		driver.switchTo().frame(frame1);
//		
//		driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']")).click();
//		System.out.println("iframe end");
		
		WebElement mo = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mo).perform();
		WebElement ko = driver.findElement(By.xpath("//a[text()='Reload']"));
		act.click(ko).build().perform();
}
}
