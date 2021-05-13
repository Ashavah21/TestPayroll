package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class LoginPage {
	WebDriver driver;
	Elementutil util;
	
//	@FindBy(how=How.XPATH,using="//p[text()='Username cannot be blank.']") private WebElement missUN;
 //   @FindBy(how=How.XPATH,using="//p[text()='Password cannot be blank.']") private WebElement misspwd;
  //  @FindBy(how=How.XPATH,using="//input[@name='LoginForm[password]']//following::p") private WebElement incre;
	
	@FindBy(how=How.NAME,using ="LoginForm[username]")
	private WebElement usernamefld;
	@FindBy(how=How.NAME,using ="LoginForm[password]")
	private WebElement passwordfld;
		
	@FindBy(how=How.XPATH,using ="//button[@name='login-button']")
	private WebElement submitbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		util=new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String username, String password) {
		System.out.println("Fields Verification");
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is "+url);
		boolean f1=usernamefld.isDisplayed(); 		
		 System.out.println("Display status of Username Field is "+f1); 
		 boolean f2=passwordfld.isEnabled();
		 System.out.println("Enable status of Password field is "+f2);
		System.out.println("Please Enter Credentials");
//	usernamefld.sendKeys(username);
//    passwordfld.sendKeys(password);
//    submitbtn.click();
		util.doSendkey(usernamefld, username);
		util.doSendkey(passwordfld, password);
		util.doClick(submitbtn);
		
		
	}

}