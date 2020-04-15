package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.pom.LoginPOM;
//import com.training.pom.MyCoursePOM;
//import com.training.pom.SearchPOM;
import com.training.pom.TC10POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class TC10 {

	private WebDriver driver;
	private String baseUrl;
	private TC10POM TC10POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TC10POM = new TC10POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void search() {
		TC10POM.sendUserName("admin");
		TC10POM.sendPassword("admin@123");
		TC10POM.clickLoginBtn(); 
		
		TC10POM.clickMycourses();
		TC10POM.clickCoursecatalog();
		
		TC10POM.searchpage("selenium");
		TC10POM.clickSearchicon();
		screenShot.captureScreenShot("First");
	}

}

