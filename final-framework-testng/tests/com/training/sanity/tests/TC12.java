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
import com.training.pom.TC12POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class TC12 {

	private WebDriver driver;
	private String baseUrl;
	private TC12POM TC12POM;
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
		TC12POM = new TC12POM(driver); 
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
		TC12POM.clicklostpwdlink();
		TC12POM.Sendinputaddress("A@a");
		TC12POM.clickSendmessage();
		TC12POM.getalertmessage();
		
		System.out.println("There is no account with this user and/or e-mail address");
		screenShot.captureScreenShot("First");
	}
}
