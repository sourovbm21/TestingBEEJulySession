package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPractice {
	
	
	
   
	
	@Test 
	public void testOne() throws InterruptedException {
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.amazon.co.uk/");
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.id("nav-search-bar-form"));
		action.keyDown(element,Keys.SHIFT).sendKeys("hello").perform();
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
	@Test (priority=0)
	public void testTwo() throws InterruptedException {
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/register.htm");		
		WebElement	Source = driver.findElement(By.id("customer.firstName"));
		Thread.sleep(2000);
		Source.sendKeys("Tohidur Rahman");
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		action.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);
	    WebElement 	terget = driver.findElement(By.id("customer.lastName"));
		action.keyDown(terget,Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	

 }
