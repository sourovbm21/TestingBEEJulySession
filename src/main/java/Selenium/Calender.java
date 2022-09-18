package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	
	
	
	
	
	
	@Test
	public void getCalender() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        
		String actualYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		// September 2022
		System.out.println(actualYear);
		String month = actualYear.split(" ")[0].trim();
		String year = actualYear.split(" ")[1].trim();

		while (!(month.equals("December") && year.equals("2025"))) {// 06/20/2023
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			actualYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = actualYear.split(" ")[0].trim();
			year =   actualYear.split(" ")[1].trim();
    	 
     }
     driver.findElement(By.xpath("//a[text()='31']")).click();
      
        Thread.sleep(4000);
//      List <WebElement> dates =  driver.findElements(By.cssSelector(".ui-state-default"));
//             for(int i=0;i<dates.size();i++) { 
//            	String date =  dates.get(i).getText();
//            	System.out.println(date);
//            	 if (date.equals("3")) {
//            		 dates.get(i).click();
//            		 break;
//            	 }
//             }
//        
//     
	
		Thread.sleep(2000);
	    driver.quit();	
	}
	
	
	

}
