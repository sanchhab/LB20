package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC40POM {
	private WebDriver driver; 
	
	public TC40POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
    //xpath for Login credentials
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	//xpath for testcase stepwise
	
	@FindBy(xpath="//*[@title='My courses']")
	private WebElement Mycourses; 
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createAcourse; 
	
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement coursename;
	
	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement createthiscourse; 
	
	@FindBy (xpath="//img[@*='Projects']")
	private WebElement projecticon;
	
	
	@FindBy (xpath="//img[@*='Create a new project']")
	private WebElement Createanewproject;
	
	@FindBy (xpath="//input[@id='add_blog_blog_name']")
	private WebElement title;
	
	
	@FindBy (xpath="//*[@id='add_blog_blog_subtitle']")
	private WebElement subtitle;
	
	@FindBy (xpath="//button[@id='add_blog_submit']")
	private WebElement saveblog;

	//Display the message 
	
	@FindBy (xpath="//div[@class='alert alert-success']")
	private WebElement Projectadded;
		
	
	//click on project icon
	@FindBy (xpath="//img[@title='Trainingday2']")
	private WebElement projectlink;
	
	
	
	//Display welcome message
	@FindBy (xpath="//a[contains(text(),'Welcome !')]")
	private WebElement welcomemessage;
	
	
	@FindBy (xpath="//img[@*='New task']")
	private WebElement newtaskicon;
	
	@FindBy (xpath="//input[@id='add_post_title']")
	private WebElement titlevalue1;
	
	@FindBy (xpath="//button[@id='add_post_save']")
	private WebElement save;
	
	// Display The article has been added
	
	@FindBy (xpath="//div[@class='alert alert-success']")
	private WebElement articleadded;
	
	//Role management icon
	@FindBy (xpath="//img[@title='Roles management']")
	private WebElement rolemanagement;
	
	@FindBy (xpath="//img[@title='Add a new role']")
	private WebElement addnewrole;
	
	@FindBy (xpath="//input[@name='task_name']")
	private WebElement roletitle;
	
	@FindBy (xpath="//button[@name='Submit']")
	private WebElement submit;
	
	//Display role tasked is added
	@FindBy (xpath="//div[@class='alert alert-success']")
	private WebElement rolesaved;
	
	@FindBy (xpath="//img[@title='Assign roles']")
	private WebElement assignrole;
	
    @FindBy (xpath="//span[@class='caret']/ancestor::button[@title='Site Owner']")	
	private WebElement userdropdownicon;
	
    @FindBy (xpath="//span[@class='text' or @class='selected active']")	
	private WebElement userdropdownselected;
	
    @FindBy (xpath="//div[@class='filter-option-inner-inner']/ancestor::button[@title='Site Owner']")	
	private WebElement selecteddisplay;
	
    @FindBy (xpath="//button[@id='assign_task_submit']")	
	private WebElement validate;
	
	//Display The task has been assigned
    
    @FindBy (xpath="//div[@class='alert alert-success']")	
	private WebElement assignedtaskdisplay;
	
    @FindBy (xpath="//img[@title='Users management']")	
	private WebElement usermanagement;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Declaration of methods starts here 
	//Method for login credentials
	
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
	// Method for createAcourse
	
	public void clickMycourses() {
		this.Mycourses.click(); 
	}

	public void clickcreateAcourse() {
		this.createAcourse.click();
	}

	public void entertext(String subjectname) {
		this.coursename.clear();
		this.coursename.sendKeys(subjectname);
	}
		
	public void clickcreatethiscourse() {
		this.createthiscourse.click();

	}
// Click on project icon
	public void clickprojecticon() {
		this.projecticon.click();
	}

	public void clickCreateanewproject() {
		this.Createanewproject.click();
	}
     
	public void title(String title) {
	    this.title.clear();
	    this.title.sendKeys(title);
	}
	
	public void subtitle(String subtitle) {
		this.subtitle.clear();
		this.subtitle.sendKeys(subtitle);
			
	}
	public void clicksaveblog() {
		this.saveblog.click();
	}
    // Display The project has been added.
	
	public void getProjectadded() {
		this.Projectadded.getText();
	}
		
	
	public void clickprojectlink() {
		this.projectlink.click();
		
	}
	// Display Welcome message!
	
	public void getwelcomemessage() {
		this.welcomemessage.getText();
	
	}
	
	public void clicknewtaskicon() {
		this.newtaskicon.click();
		
	}
	
	public void titlevalue1(String titlevalue1) {
		this.titlevalue1.clear();
		this.titlevalue1.sendKeys(titlevalue1);
		
	}
	
	public void clicksave() {
		this.save.click();
	}
	//Display article added
	public void getarticleadded() {
		this.articleadded.getText();
	}
	
	public void clickrolemanagement() {
		this.rolemanagement.click();
	}
	
	public void clickaddnewrole() {
		this.addnewrole.click();
		
	}
	
	public void roletitle(String roletitle) {
		this.roletitle.clear();
		this.roletitle.sendKeys(roletitle);
	}
	
	public void clicksubmit() {
		this.submit.click();
	}
	
	// Display The task has been created

	public void getrolesaved() {
		this.rolesaved.getText();
	}
	
	public void clickassignrole(){
		this.assignrole.click();	
	}
	
	public void clickuserdropdownicon() {
		this.userdropdownicon.click();
	}
	
	public void clickuserdropdownselected() {
		this.userdropdownselected.click();
	}
	public void getselecteddisplay() {
		this.selecteddisplay.getText();
	}
	
	public void clickvalidate() {
		this.validate.click();
	}
	
	public void getassignedtaskdisplay() {
		this.assignedtaskdisplay.getText();
	}
	
	public void clickusermanagement() {
		this.usermanagement.click();
	}
	
	
	
	
	
	
	
	
}