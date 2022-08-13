package con.QA.SeleniumPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		
		
		
		//WebDriver driver = new FirefoxDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		String actual  = driver.getTitle();//Practice Page
		String expected ="Practice Page";
		Assert.assertEquals(actual, expected);
		
		
		
		driver.findElement(By.id("autocomplete")).clear();
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).clear();
		
		
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		boolean nes= driver.findElement(By.cssSelector("input[value='radio3']")).isSelected();
		Assert.assertTrue(nes);
	
		//Practice Page
		
		Thread.sleep(4000);
		
		
		driver.quit();
		
		
	
	
		
		
		
		
		
		
	}

}
