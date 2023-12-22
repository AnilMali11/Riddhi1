package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class ListTenant extends TestBase {
	
	WebDriver driver; 
	 
	 public ListTenant(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver,this); 
	 } 
	  
	 @FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[4]/a") 
	 WebElement list_tenant; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable\"]/tbody/tr/td[7]/a[1]") 
	 WebElement view_tenant; 
	  
	 
	 @FindBy(xpath="//*[@id=\"myTab\"]/li[2]/a") 
	 WebElement update_tenant; 
	  
	 
	 @FindBy(name="submit") 
	 WebElement save_tenant; 
	  
	 public void clickOnListTenant() 
	 { 
	  list_tenant.click(); 
	 } 
	  
	 public void clickOnViewTenant() 
	 { 
	  view_tenant.click(); 
	 } 
	  
	 public void clickOnUpdateTenant() 
	 { 
	  update_tenant.click(); 
	 } 
	  
	 public void clickOnSaveTenant() 
	 { 
	  save_tenant.click(); 
	 }

}
