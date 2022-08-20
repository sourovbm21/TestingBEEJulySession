package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTwo {

	public static void main(String[] args) throws InterruptedException {
		
		
	     WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//	    WebDriverManager.edgedriver().setup();
//	    WebDriver driver = new EdgeDriver();
		   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);		
		driver.get("https://www.google.co.uk/");
		Thread.sleep(3000);
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
