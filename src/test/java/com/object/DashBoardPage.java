package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class DashBoardPage extends TestBase{
	
	public DashBoardPage(WebDriver driver) 
	{ 
	PageFactory.initElements(driver,this); 
	} 
	
	@FindBy(xpath="/html/body/aside/ul/li[1]/a/span") 
	WebElement dash_btn; 
	
	public void clickOnDashboard() 
	{ 
	dash_btn.click(); 
	} 

}
