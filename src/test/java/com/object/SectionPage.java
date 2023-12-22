package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class SectionPage extends TestBase{
	
	WebDriver driver; 
	 
	 public SectionPage(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver,this); 
	 } 
	     
	 @FindBy(xpath="/html/body/aside/ul/li[2]/a/span") 
	 WebElement sect_btn; 
	  
	 @FindBy(name = "sectionname") 
	 WebElement sectname_txt; 
	  
	 @FindBy(name = "submit") 
	 WebElement sub_btn; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable_filter\"]/label/input") 
	 WebElement search_txt; 
	  
	 public void clickOnSection() 
	 { 
	  sect_btn.click(); 
	 } 
	  
	 
	 public void enterSection(String addsection) 
	 { 
	  sectname_txt.sendKeys(addsection); 
	 } 
	  
	 public void clickOnSubmit() 
	 { 
	  sub_btn.click(); 
	 } 
	  
	 public void searchSection(String sectionname) 
	 { 
	  search_txt.sendKeys(sectionname); 
	 } 
	

}
