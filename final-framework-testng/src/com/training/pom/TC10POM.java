package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC10POM {
	private WebDriver driver; 
	
	public TC10POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@title='My courses']")
	private WebElement Mycourses; 
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecatalog; 
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement Searchpage; 
	
	@FindBy(xpath="//div[@class='input-group-btn']")
	private WebElement Searchicon; 
	
		
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickMycourses() {
		this.Mycourses.click();
	
	}
	
	public void clickCoursecatalog() {
		this.Coursecatalog.click();
		
	}

	public void searchpage(String search) {
	     this.Searchpage.clear();
	     this.Searchpage.sendKeys(search);
    }

	public void clickSearchicon() {
		this.Searchicon.click();
    }
}





