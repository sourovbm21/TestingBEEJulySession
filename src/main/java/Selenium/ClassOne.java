package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Page title test 
		String actual = driver.getTitle();// Practice Page
		String expected = "Practice Page";
		Assert.assertEquals(actual, expected);
		
		//Selecting radio button 
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		boolean nes = driver.findElement(By.cssSelector("input[value='radio3']")).isSelected();
		Assert.assertTrue(nes);

		//Giving Sendkeys to text field 
		driver.findElement(By.id("autocomplete")).clear();
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).clear();

		

		Thread.sleep(3000);

		driver.quit();

	}


}
