package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC11POM {
	private WebDriver driver; 
	
	public TC11POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	private WebElement Homepage; 
	
	
	@FindBy(xpath="//a[contains(text(),'Edit profile')]")
	private WebElement Editprofile;
	
	@FindBy(xpath="//input[@id='profile_password0']")
	private WebElement currentpwd; 
	
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement Newpassword;
	
		
	@FindBy (xpath="//input[@name='password2']")
	private WebElement Confirmpassword;
	
	@FindBy (xpath="//button[@name='apply_change']")
	private WebElement SaveSettings;

	
	
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
		
	public void clickHomepage() {
		this.Homepage.click(); 
	}

	public void clickEditprofile() {
		this.Editprofile.click();
	}

	public void Sendcurrentpwd(String currentpwd) {
		this.currentpwd.clear();
		this.currentpwd.sendKeys(currentpwd);
		}
		
		public void Sendnewpassword(String Newpassword) {
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
