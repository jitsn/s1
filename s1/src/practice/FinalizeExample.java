package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
  
		  
	public class FinalizeExample
	{  
		 public static void main(String[] args)     
		    {     
		        FinalizeExample obj = new FinalizeExample();        
		        // printing the hashcode   
		        System.out.println("Hashcode is: " + obj.hashCode());           
		        obj = null;    
		        // calling the garbage collector using gc()   
		        System.gc();     
		        System.out.println("End of the garbage collection");     
		    }     
		   // defining the finalize method   
		    protected void finalize()     
		    {     
		        System.out.println("Called the finalize() method");     
		    }     
		}    
	
	  
	  
	  
	  

			
			
		
	
		
	

