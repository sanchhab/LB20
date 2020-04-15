package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC12POM {
	private WebDriver driver; 
	
	public TC12POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//a[contains(text(),' I lost my password')]")
	private WebElement lostpwdlink; 
	
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement inputtext;
	
	
	@FindBy(xpath="//button[@id='lost_password_submit']")
	private WebElement Sendmessage;
	
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement alertmessage;
	
	
	
	public void clicklostpwdlink() {
		this.lostpwdlink.click(); 
	}

	public void Sendinputaddress(String inputtext) {
		this.inputtext.clear();
		this.inputtext.sendKeys(inputtext);
	}
	
	public void clickSendmessage() {
		this.Sendmessage.click();
	}
	
	public void getalertmessage() {
		this.alertmessage.getText();
	}
	
	
}
