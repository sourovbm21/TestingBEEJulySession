package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDManager {

	public static void main(String[] args) {


		
		
	
		WebDriverManager.chromedriver().cachePath("/Users/tohidur/Desktop/MyChromeDriver").avoidOutputTree().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/tohidur/Desktop/MyChromeDriver/chromedriver");
		//WebDriverManager.chromedriver().cachePath("/Users/tohidur/Desktop/MyChromeDriver").avoidBrowserDetection().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/tohidur/Desktop/MyChromeDriver/chromedriver/mac64/107.0.5304.62/chromedriver");
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	}

}
