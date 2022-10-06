package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement tillView = driver.findElement(By.id("table02"));
		js.executeScript("arguments[0].scrollIntoView();",tillView);
		List <WebElement> totallist = driver.findElements(By.xpath("//table[@id='table02']//tr//td[2]"));
		
		//js.executeScript("document.querySelector('#table02').scrollTop=200");
		Thread.sleep(3000);
	//	js.executeScript("document.querySelector('#table02').scrollBy(0,400)");
		
		for(WebElement list :totallist ) {
			list.getText();
			//js.executeScript("document.querySelector('#table02').scrollTop=200");		
//			Thread.sleep(2000);
			js.executeScript("document.querySelector('#table02').scrollBy(0,400)");			
//			Thread.sleep(2000);
			System.out.println(list.getText());
			if (list.getText().equals("Senior Marketing Designer")) {
//				Thread.sleep(2000);
				action.moveToElement(list).contextClick().build().perform();
			Thread.sleep(2000);
				System.out.println(" @---->> "+"i am clicking to given element");
				break;
				
			}
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
