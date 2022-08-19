package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hban {

	@Test

	public void hban() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://smsreceivefree.com/info/19175903978/");
		String s = driver.findElement(By.xpath("(//*[contains(text(),'Valley Bank Access Code')])[1]")).getText();
		// Valley Bank Access Code. Your access code is 241455. Reply HELP for help
		System.out.println("Just Printing AfterGetText Method : "+ s);	
		System.out.println("i am from method : "+givenCode(s));		
		//driver.findElement(By.xpath("")).sendKeys(givenCode(s));
		driver.quit();

	}
	
	
	public String  givenCode (String str ) {
		//str.trim();
		String S[] = str.trim().split("is");
		//String first = S[0];
		String second = S[1];
		//second.trim();
		String secondTrim[] = second.trim().split(" ");
		String sSecond = secondTrim[0];
		String actual = sSecond.trim().substring(0, sSecond.length() - 1);
		return actual ;
		
		
	}
}
