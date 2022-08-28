package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrickyDom {

	public static void main(String[] args) throws InterruptedException {

		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		List <WebElement>frame = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frame :--> "+frame.size());		
		WebElement scrollview = driver.findElement(By.xpath("//button[text()='Checkout here']"));
		
		JavascriptExecutor	 js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollview);	
		//entering into iframe. 
		driver.switchTo().frame("pact");	

		//Entering First Open Shadow root 
		WebElement elementTea = (WebElement) js
				.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		String elementTeaValue = "arguments[0].setAttribute('value','Love Green Tea')";
		js.executeScript(elementTeaValue, elementTea);
		Thread.sleep(3000);
		// Entering Second Open Shadow root
		WebElement elementLunch = (WebElement) js
				.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\")"
						+ ".shadowRoot.querySelector(\"#pizza\")");
		String lunchItemValue = "arguments[0].setAttribute('value','Chicken Tikka Masala Please')";
		js.executeScript(lunchItemValue, elementLunch);
		//Exit from iframe 
		driver.switchTo().defaultContent();
		//Entering Second Closed Shadow root
		driver.findElement(By.xpath("//div[@id='userPass']")).click();
		Actions ac =  new Actions(driver);
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys("PASSWORD").perform();
		

		Thread.sleep(3000);
		driver.quit();
	}

}
