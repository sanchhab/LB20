package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC70POM {
	private WebDriver driver; 
	
	public TC70POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
    
	//Declaration of xpath starts here
	// xpath for login credentials
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	//xpath to create a course
	
	@FindBy(xpath="//*[@title='My courses']")
	private WebElement Mycourses; 
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createAcourse; 
	
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement coursename;
	
	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement createthiscourse; 
	
	//xpath as per test case
	
	@FindBy(xpath="//img[@title='Tests']")
	private WebElement testicon; 
	
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement createanewtest; 
	
	@FindBy(xpath="//input[@name='exerciseTitle']")
	private WebElement testname; 
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancesetting; 
	
	// context xpath
	@FindBy(xpath="//div[@id='cke_1_contents']/iframe")
	private WebElement framecontext; 
	
	@FindBy(xpath="//html/body/p")
	private WebElement textbox; 
	
	// xpath of radio button
	@FindBy(xpath="//input[@name='exerciseFeedbackType' and @value='0']")
	private WebElement radioAtendoftest; 
	
	@FindBy(xpath="//input[@name='activate_start_date_check']")
	private WebElement enablecheckbox; 
	
	@FindBy(xpath="//img[@class='ui-datepicker-trigger']/ancestor::div[@id='date_time_wrapper_start_time']")
	private WebElement selectdateicon; 
	
	// xpath for datepicker
	
	//xpath of pass
	@FindBy(xpath="//input[@name='pass_percentage']")
	private WebElement pass; 
	
	@FindBy(xpath="//button[@id='exercise_admin_submitExercise']")
	private WebElement proceedtoquestions; 
	// Display exercise added
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement displaymessage; 
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement multiplechoiceicon; 
	
	@FindBy(xpath="//input[@name='questionName']")
	private WebElement question; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	// Method for execution of test case
	public void clicktesticon() {
		this.testicon.click(); 
	}
	
	public void clickcreateanewtest() {
		this.createanewtest.click(); 
	}
	
	public void sendtestname(String testname) {
		this.testname.clear(); 
		this.testname.sendKeys(testname); 
	}
	
	public void clickadvancesetting() {
		this.advancesetting.click(); 
	}
	
	public void clickframecontext() {
		this.framecontext.click(); 
	}
	public void sendtext(String testing) {
		this.textbox.clear(); 
		this.textbox.sendKeys(testing); 
	}
	public void clickradioAtendoftest() {
		this.radioAtendoftest.click(); 
	}
	public void clickenablecheckbox() {
		this.radioAtendoftest.click(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
