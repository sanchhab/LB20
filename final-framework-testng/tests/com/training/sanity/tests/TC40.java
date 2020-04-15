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
import com.training.pom.TC40POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

//The purpose of this testcase is to create a course using teacher credential
//1. login with teacher credentials,then click on create a course under Mycourses
//2. Enter Course name and click on create this course

public class TC40 {

	private WebDriver driver;
	private String baseUrl;
	private TC40POM TC40POM;
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
		TC40POM = new TC40POM(driver); 
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
		TC40POM.sendUserName("admin");
		TC40POM.sendPassword("admin@123");
		TC40POM.clickLoginBtn(); 
		
		TC40POM.clickMycourses();
		TC40POM.clickcreateAcourse();
		
		
		TC40POM.entertext("Autoguide124");
			
		TC40POM.clickcreatethiscourse();
		
		TC40POM.clickprojecticon();
		TC40POM.clickCreateanewproject();
		
		
		TC40POM.title("Trainingday2");
		TC40POM.subtitle ("xpath");
		TC40POM.clicksaveblog();
		TC40POM.getProjectadded();
		System.out.println("The project has been added");
		
		TC40POM.clickprojectlink();
		TC40POM.getwelcomemessage();
		System.out.println("Welcome! ");
		TC40POM.clicknewtaskicon();
		TC40POM.titlevalue1("Automationday1");
		TC40POM.clicksave();
		TC40POM.getarticleadded();
		System.out.println("The article has been added");
		TC40POM.clickrolemanagement();
		TC40POM.clickaddnewrole();
		TC40POM.roletitle("developer");
		TC40POM.clicksubmit();
		TC40POM.getrolesaved();
		System.out.println("The task has been created");
		TC40POM.clickassignrole();
		TC40POM.clickuserdropdownicon();
		TC40POM.clickuserdropdownselected();
		TC40POM.getselecteddisplay();
		TC40POM.clickvalidate();
		TC40POM.getassignedtaskdisplay();
		System.out.println("The task has been assigned");
		TC40POM.clickusermanagement();
		
		
		
		
		
		
		
		
		
		//System.out.println("Your new profile has been saved");
		screenShot.captureScreenShot("First");
	}

}

