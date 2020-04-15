package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOM {
	private WebDriver driver; 
	
	public SearchPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement Search; 
	
	@FindBy(xpath="//div[@class='input-group-btn']")
	private WebElement Searchicon; 
	
		
	//public void clickMycourses() {
		//this.Mycourses.click();
	//	}
	
    public void search(String search) {
	     this.Search.clear();
	     this.Search.sendKeys(search);
}

	public void clickSearchicon() {
		this.Searchicon.click();
      }
	
}
