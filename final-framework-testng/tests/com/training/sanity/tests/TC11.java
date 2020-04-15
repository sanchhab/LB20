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
import com.training.pom.TC11POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

//The purpose of this testcase is to Edit student profile and save the passwords settings
//1. login with student credentials,then click on Editprofile under homepage
//2. Enter Current password( under pass field), new password and confirm password
//3. Click the save button
public class TC11 {

	private WebDriver driver;
	private String baseUrl;
	private TC11POM TC11POM;
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
		TC11POM = new TC11POM(driver); 
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
//login as a student credentials
	@Test
	public void search() {
		TC11POM.sendUserName("sanmeet");
		TC11POM.sendPassword("Auto@33557782");
		TC11POM.clickLoginBtn(); 
		
		TC11POM.clickHomepage();
		TC11POM.clickEditprofile();
		
		
		TC11POM.Sendcurrentpwd("Auto@33557782");
		TC11POM.Sendnewpassword("Auto@33557783");
		TC11POM.SendConfirmpwd("Auto@33557783");
			
		TC11POM.clickSaveSettings();
		
		System.out.println("Your new profile has been saved");
		screenShot.captureScreenShot("First");
	}

}

