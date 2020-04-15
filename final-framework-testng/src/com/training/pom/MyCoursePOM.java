package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCoursePOM {
	private WebDriver driver; 
	
	public MyCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[@title='My courses']")
	private WebElement Mycourses; 
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecatalog; 
	
		
	public void clickMycourses() {
		this.Mycourses.click();
	
	}
	
	

	public void clickCoursecatalog() {
		this.Coursecatalog.click();
		
	}
	
	
	
	
	
}
