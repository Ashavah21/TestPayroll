package com.qa.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Elementutil {
	
	WebDriver driver;
	 
	public Elementutil(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//Value Enter Functionality
	public void doSendkey(WebElement element ,String value)
	{
		element.clear();
		element.sendKeys(value);
	}
	
	//Click Functionality
	public void doClick(WebElement element)
	{
		element.click();
	}
	
	//Wait Visibility functionality
	public void waitvisibility(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver,100); 		//Explicit
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//wait Locator functionality
	public WebElement waitforlocating(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,100); 		//Explicit
			WebElement element =wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return element;
		}
	
	//wait page title functionality
	public void waitforpagetitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver,100); 		//Explicit
			wait.until(ExpectedConditions.titleIs(title));			
		}
	
		
	//mouse scroll down functionality
	public void mousescrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	//Alert handling
		public void alerthandle() {
		Alert al= driver.switchTo().alert();
		 String almessage= al.getText();
		 System.out.println(almessage);
		al.accept();
		}

	
	//Dropdown select by text
	public void dropdowntextselector(WebElement dptext, String string)
	{
		Select dnt = new Select(dptext);
		dnt.selectByVisibleText(string);
	}
	
	//Dropdown select by value
	public void dropdownvalueselector(WebElement dpvalue, String string)
	{
		Select dnv = new Select(dpvalue);
		dnv.selectByValue(string);
	}

	//Dropdown select by index
	public void dropdownindexselector(WebElement dpindex, int index)
	{
		Select dni = new Select(dpindex);
		dni.selectByIndex(index);
	}

	
	
//	//Dropdown current selection display
//	public void dropdownselectiondisplay(WebElement currentoption)
//	{
//		Select cop = new Select(currentoption);
//		WebElement option = cop.getFirstSelectedOption();
//		System.out.println("Selected Option is: "+ option);
//	}
	
	// DropdownList
	// To get the list of all items in the drop down
//	public void dropdownlist(String string) {
//				System.out.println("Dropdown List ");
//				List<WebElement> ls=cwp.wemptype.getOptions();
//				int size=ls.size();
//				for(int i=0 ;i<size;i++)
//				{
//					String val=ls.get(i).getText();
//					System.out.println(val);
//				}}

}
