package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.URI;
import java.util.function.Predicate;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {

	@Test
	public void basicAuth() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
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
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		boolean b = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).isDisplayed();
		Assert.assertTrue(b);
	}

	@Test
	public void basicAuthUsingUriPredicate() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("the-internet.herokuapp.com");
		((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
		driver.get("http://the-internet.herokuapp.com/basic_auth");

	}

}
