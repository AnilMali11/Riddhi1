package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class ListStaff extends TestBase{
	
	WebDriver driver; 
	public ListStaff(WebDriver driver) 
	{ 
	PageFactory.initElements(driver,this); 
	} 
	@FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[3]/a") 
	WebElement list_Staff; 
	public void clickOnListStaff() 
	{ 
	list_Staff.click(); 
	} 

}
