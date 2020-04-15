package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditprofilePOM {
	private WebDriver driver; 
	
	public EditprofilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	private WebElement Homepage; 
	
	
	@FindBy(xpath="//a[contains(text(),'Edit profile')]")
	private WebElement Editprofile;
	
		
	public void clickHomepage() {
		this.Homepage.click(); 
	}

	public void clickEditprofile() {
		this.Editprofile.click();
	}
	
		
}
