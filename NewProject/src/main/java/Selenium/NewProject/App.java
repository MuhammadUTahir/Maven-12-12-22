package Selenium.NewProject;



import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class App 

{
	private static final Actions New = null;
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    { 
    	
    	

		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\areeb\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.get("https://www.dominos.com/"); 
		
		 driver.manage().window().maximize();
		  
		Thread.sleep(3000);
		 
//		 driver.findElement(By.xpath("//*[@id=\"id-5\"]/button")).click();
//		 
//		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("(//*[@class=\"css-9k8dbk e1jlvhcu15\"])[1]")).click(); 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"Delivery\"]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"Type\"]")).click();
		 Thread.sleep(3000);
		 

		 WebElement Address = driver.findElement(By.xpath("//*[@id=\"Type\"]"));
		 Address.click();
		 Thread.sleep(5000);
		 
		 WebElement Apartment = driver.findElement(By.xpath("//*[@value=\"Apartment\"]"));
		 Apartment.click();
		 
		 driver.findElement(By.xpath("//*[@id=\"LocationName\"]")).sendKeys("814");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"Street\"]")).sendKeys("Bobby Road");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"UnitNumber\"]")).sendKeys("12");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"PostalCode\"]")).sendKeys("21228");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"City\"]")).sendKeys("Catonsville");
		 Thread.sleep(3000);
		 
		 
		 WebElement State = driver.findElement(By.xpath("//*[@id=\"Region\"]"));
		 State.click();
		 
		 WebElement MD = driver.findElement(By.xpath("//*[@value=\"MD\"]"));
		 MD.click();
		 
		 driver.findElement(By.xpath("(//*[@type=\"submit\"])[1]")).click();
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("data-type=\"Carryout\"")).click();
		 
		 
		 
		 WebElement Pizza = driver.findElement(By.xpath("//*[@class=\"navigation-AllPizzas\"]"));
		 Pizza.click();
		 
		 
		 
		 
		 
		 
		 
				 
		 

//			Thread.sleep(50000);
			// driver.close();
		 
		 
		
	
//		driver.findElement(By.xpath("(//*[@class=\"HeaderIcon__primarySvg\"])[1]")).click();
//		
//		
//		WebElement createbutton= driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a"));
//		createbutton.click();
//		
//		
//		WebElement selectbutton= driver.findElement(By.xpath("(//*[@class=\"bttn__content\"])[1]"));
//		selectbutton.click();
//		
//		
//		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("m.umairtahir06@hotmail.com");
//		
//		
//		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Leo113789#");
//		
//		
//		driver.findElement(By.xpath("//*[@name=\"zipcode\"]")).sendKeys("21228");
//		
//		
//		driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("667-345-4444");
//		
//		
//		
//	driver.findElement(By.xpath("(//*[@class=\"u__inline-block\"])[1]")).click();
//	
//	driver.close();
//	
//		 
////		List<WebElement> menu= driver.findElements(By.xpath("//*[text()='Heating']"));
////		
////		System.out.println("Sine of list is = " + menu);
////	
////		 
//
////		
//			driver.close();
////		

		
		
		
		
		Thread.sleep(50000);
		 driver.close();
    }
}
