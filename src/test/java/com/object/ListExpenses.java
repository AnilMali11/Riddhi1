package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class ListExpenses extends TestBase{

	WebDriver driver; 
	 
	 public ListExpenses(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver,this); 
	 } 
	 
	 
	 @FindBy(xpath="/html/body/aside/ul/li[6]/a/span") 
	 WebElement expense_click; 
	  
	 @FindBy(xpath="/html/body/aside/ul/li[6]/ul/li[2]/a") 
	 WebElement list_expenses; 
	  
	 
	 @FindBy(xpath="//*[@id=\"sampleTable_wrapper\"]/div[1]/button[3]") 
	 WebElement download_sheet; 
	  
	 public void clikOnExpense() 
	 { 
	  expense_click.click(); 
	 } 
	  
	 public void clikOnListExpenses() 
	 { 
	  list_expenses.click(); 
	 } 
	  
	 public void downloadListExpenses() 
	 { 
	  download_sheet.click(); 
	 }
	
	
}
