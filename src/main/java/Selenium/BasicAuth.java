package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {
	
	
	
	

	@Test 
	public void basicAuth() {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		boolean b = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).isDisplayed();
        Assert.assertTrue(b);
	}
	
	
	@Test 
	public void basicAuthNotByPass() {
	     WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		boolean b = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).isDisplayed();
        Assert.assertTrue(b);
	}

}
