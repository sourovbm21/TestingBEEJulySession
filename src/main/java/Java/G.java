package Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G {


	public static void main(String[] args) throws InterruptedException {

	     WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.emerald.com/insight/search?q=marketing");
//		driver.findElement(By.xpath("//div[contains(@class,'text-center text-md-l')]//a[normalize-space()='50']")).click();
//		driver.findElement(By.cssSelector("#yearFrom")).sendKeys("2020");
//		driver.findElement(By.cssSelector("#yearTo")).sendKeys("2022");
//		driver.findElement(By.xpath("//a[@class='btn-sm btn-primary']"));
		
		Thread.sleep(3000);
		WebElement el = driver.findElement(By.xpath("//input[@filled='true']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", el);
		
		Thread.sleep(3000);	
		boolean b = driver.findElement(By.cssSelector("[class='btn p-0 ml-1 btn-link']")).isDisplayed();
		System.out.println("Boolean value is : --> " +b);
		
	Thread.sleep(3000);
//		
//		
//List 	<WebElement> list  = driver.findElements(By.cssSelector("span[class='font-weight-light']:nth-child(1)"));
//SoftAssert sf = new SoftAssert();
//int x =2020;
//int y =2022;
//	for (int i= 0;i<list.size();i++) {
//		
//		System.out.println(list.get(i).getText());
//		String newl = list.get(i).getText();
//		String actualYear = newl.substring(newl.length()-4);
//		System.out.println("actualYear after trim is : "+actualYear);
//		if ((Integer.parseInt(actualYear) >= x) && (Integer.parseInt(actualYear)<=y)){
//			System.out.println("Test passed "+actualYear); 
//			sf.assertTrue(true);
//		}else {
//			System.out.println("Test fail : "+actualYear);
//			sf.assertTrue(false);
//		}
//		
//		
//	//	sf.assertTrue((Integer.parseInt(actualYear) >= y) && (Integer.parseInt(actualYear)<=y),"");
//	sf.assertAll();
		
	
	
	driver.quit();
	
	
	
	
	
	
	
	}
		
		//Thread.sleep(2000);
		//driver.quit();
		
		
		
		
		
		
		
		
    	}
	
	
	
	
	
    
	
    
    
	
	
	




