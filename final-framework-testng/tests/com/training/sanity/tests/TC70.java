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
import com.training.pom.TC70POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class TC70 {

	private WebDriver driver;
	private String baseUrl;
	private TC70POM TC70POM;
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
		TC70POM = new TC70POM(driver); 
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
	public void lostpassword() {
		// function for login credentials 
		
		
		
		// functions for executing of testcase step by step 
		
		TC70POM.clicklostpwdlink();
		TC70POM.Sendinputaddress("A@a");
		TC70POM.clickSendmessage();
		TC70POM.getalertmessage();
		
		
		
		System.out.println("There is no account with this user and/or e-mail address");
		screenShot.captureScreenShot("First");
	}
}
