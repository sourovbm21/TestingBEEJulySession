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
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

	   driver.findElement(By.xpath("//*[contains(text(),'Passengers')]")).click();
	   driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6'])[1]//div[@data-focusable]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6'])[2]//div[@data-focusable]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6'])[3]//div[@data-focusable]")).click();
	    Thread.sleep(4000);
	    driver.quit();
	
	
	
	
	
	
	
	}
	
		
		
		
		
		
		
		
    	}
	
	
	
	
	
    
	
    
    
	
	
	




