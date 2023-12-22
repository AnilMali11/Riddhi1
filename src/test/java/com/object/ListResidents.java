package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class ListResidents extends TestBase {
	
	WebDriver driver; 
	 
	 public ListResidents(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver,this); 
	 } 
	  
	 @FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[2]/a") 
	 WebElement list_wbelement; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable_filter\"]/label/input") 
	 WebElement search_resident; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable\"]/tbody/tr/td[7]/a[1]") 
	 WebElement view_resident; 
	  
	 
	 @FindBy(xpath="//*[@id=\"myTab\"]/li[2]/a") 
	 WebElement update_resident; 
	  
	 
	 @FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div/form/div[12]/div/div/button") 
	 WebElement save_resident; 
	  
	 public void clikOnlistResident() 
	 { 
	  list_wbelement.click(); 
	 } 
	  
	 public void clikOnSearchResident(String residentname) 
	 { 
	  search_resident.sendKeys(residentname); 
	 } 
	  
	  
	 public void clikOnViewResident() 
	 { 
	  view_resident.click(); 
	 } 
	  
	 public void clikOnUpdateResident() 
	 { 
	  update_resident.click(); 
	 } 
	public void clikOnSaveResident() 
	{ 
	save_resident.click(); 
	}

}
