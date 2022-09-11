package Selenium;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	
	@BeforeSuite
	public void setup_Before_Suite() {
		System.out.println("inside before suite");
	}
	
	
	
	@BeforeTest
	public void setup_Before_Test() {
		System.out.println("inside before test");
	}
	

	@BeforeClass
	public void setup_Before_Class() {
		System.out.println("inside before class");
	}
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("inside before method");
	}
	
	
	
	@Test
	public void dropDownTest() {
		
		System.out.println("inside test method");
	}
	
	@Test(groups="somke",priority=1)
	public void dropDownTestTwo() {
		
		System.out.println("inside test method  ");
	}
	@Test(groups="somke",dependsOnMethods = "dropDownTestFour")
	public void dropDownTestThree() {
		
		System.out.println("inside test method  #######");
	}
	
	@Test()
	public void dropDownTestFour() {
		
		System.out.println("inside test method @@@@@@ ");
		//Assert.assertTrue(false);
	}
	
	
	@AfterMethod
	public void setup_After() {
		System.out.println("inside after method");
	}
	
	
	@AfterClass
	public void setup_After_Class() {
		System.out.println("inside after class");
	}
	
	@AfterTest
	public void setup_After_Test() {
		System.out.println("inside after test");
	}

	@AfterSuite
	public void setup_After_Suite() {
		System.out.println("inside after suite");
	}


	
	
	
}
