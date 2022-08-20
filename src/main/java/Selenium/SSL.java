package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSL {

	public static void main(String[] args) {
		
		
		
		ChromeOptions  cop = new ChromeOptions();
		cop.setAcceptInsecureCerts(true);
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cop);
		
//			WebDriverManager.firefoxdriver().setup();
//			WebDriver driver = new FirefoxDriver();
			
//		    WebDriverManager.edgedriver().setup();
//		    WebDriver driver = new EdgeDriver();
			   
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);		
			driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);		
			driver.get("https://expire.badssl.com/");
			
			
		
		
		
	}

}
