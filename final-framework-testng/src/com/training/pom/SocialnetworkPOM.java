package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialnetworkPOM {
	private WebDriver driver; 
	
	public SocialnetworkPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//input[@id='profile_password0']")
	private WebElement Pass; 
	
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement Newpassword;
	
		
	@FindBy (xpath="//input[@name='password2']")
	private WebElement Confirmpassword;
	
	@FindBy (xpath="//button[@name='apply_change']")
	private WebElement SaveSettings;
	
	
	
	public void Sendtext(String Pass) {
	this.Pass.clear();
	this.Pass.sendKeys(Pass);
	}
	
	public void Sendpassword(String Newpassword) {
	this.Newpassword.clear();	
	this.Newpassword.sendKeys(Newpassword);	
	}
	
	
	public void SendConfirmpwd (String Confirmpassword)  {
	this.Confirmpassword.clear();	
	this.Confirmpassword.sendKeys(Confirmpassword);	
		
	}
	
	public void clickSaveSettings() {
		this.SaveSettings.click();
	}
	
			
}
