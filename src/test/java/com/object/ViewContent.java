package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class ViewContent extends TestBase{

	WebDriver driver; 
	  
	 public ViewContent(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver, this); 
	 } 
	  
	 @FindBy(xpath="/html/body/aside/ul/li[3]/ul/li[2]/a") 
	 WebElement viewcont_btn; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable_filter\"]/label/input") 
	 WebElement searchancont_txt; 
	  
	 @FindBy(id="dropdownMenuButton") 
	 WebElement act_btn; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable\"]/tbody/tr[1]/td[5]/div/div/a[1]") 
	 WebElement view_btn; 
	  
	 /////// 
	 /////// 
	 @FindBy(xpath="//*[@id=\"sampleTable_filter\"]/label/input") 
	 WebElement clearsearchancont_txt; 
	  
	 @FindBy(xpath="//*[@id=\"sampleTable_filter\"]/label/input") 
	 WebElement newsearchancont_txt; 
	  
	 @FindBy(id="dropdownMenuButton") 
	 WebElement clickact_btn; 
	  
	 @FindBy(xpath = 
	"//*[@id=\"sampleTable\"]/tbody/tr[1]/td[5]/div/div/a[2]") 
	    WebElement edit_btn; 
	  
	 @FindBy(xpath="/html/body/main/div/div[1]/div/div[2]/button") 
	 WebElement sub_btn; 
	  
	 @FindBy(xpath = "/html/body/aside/ul/li[3]/a/span") 
	 WebElement cont_btn; 
	  
	 public void clcikviewContent() 
	 { 
	  viewcont_btn.click(); 
	 } 
	  
	 public void searchContent(String content) 
	 { 
	  searchancont_txt.sendKeys(content); 
	 } 
	  
	 public void clickOnAction() 
	 { 
	  act_btn.click(); 
	 } 
	  
	 public void clickOnView() 
	 { 
	  view_btn.click(); 
	 } 
	  
	  
	 public void clearSearchBox() 
	 { 
	  clearsearchancont_txt.clear(); 
	 } 
	  
	 public void newSearchAnContent(String newcont) 
	 { 
	  newsearchancont_txt.sendKeys(newcont); 
	 } 
	  
	 public void clickActionButton() 
	 { 
	  clickact_btn.click(); 
	 } 
	  
	 public void clickEditButton() 
	 { 
	  edit_btn.click(); 
	 } 
	  
	 public void clickOnSubmitButton() 
	 { 
	  sub_btn.click(); 
	 } 
	  
	 
	 public void clcikviewContentButton() 
	 { 
	  cont_btn.click(); 
	 }
	
}
