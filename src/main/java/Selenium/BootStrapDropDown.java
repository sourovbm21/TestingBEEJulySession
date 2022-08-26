package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {

		
	     WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);			
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		
	}

}
