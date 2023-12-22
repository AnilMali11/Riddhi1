package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class Expenses extends TestBase{
	
	WebDriver driver; 
	 
	 public Expenses(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver,this); 
	 } 
	  
	 @FindBy(xpath="/html/body/aside/ul/li[6]/a/span") 
	 WebElement expenses_click; 
	  
	  
	 @FindBy(xpath="/html/body/aside/ul/li[6]/ul/li[1]/a") 
	 WebElement add_expenses; 
	  
	 @FindBy(name="employee_name") 
	 WebElement employee_name; 
	  
	 
	 @FindBy(name="expense_amount") 
	 WebElement expense_amount; 
	  
	 
	 //@FindBy(name="expense_mode") 
	 //WebElement expense_type; 
	  
	 
	 @FindBy(xpath="/html/body/main/div/div[1]/div/div[1]/form/div[3]/div/select/option[1]") 
	 WebElement select_expense_type; 
	  
	 //@FindBy(name="//*[@id=\"select\"]") 
	 //WebElement expense_mode; 
	  
	 @FindBy(name="//*[@id=\"select\"]/option[7]") 
	 WebElement select_expense_mode; 
	 
	 @FindBy(name="expense_date") 
	 WebElement expense_date; 
	  
	 @FindBy(name="expense_note") 
	 WebElement expense_note; 
	  
	 @FindBy(name="submit") 
	 WebElement expense_submit; 
	  
	 
	 
	 public void clickOnExpenses() 
	 { 
	  expenses_click.click(); 
	 } 
	  
	 public void clickOnAddExpenses() 
	 { 
	  add_expenses.click(); 
	 } 
	  
	 public void clickOnNameExpenses(String name) 
	 { 
	  employee_name.sendKeys(name); 
	 } 
	  
	 public void clickOnExpensesAmount(String amount) 
	 { 
	  expense_amount.sendKeys(amount); 
	 } 
	  
	 public void selectExpensesType() 
	 { 
	  //expense_type.click(); 
	 } 
	  
	 public void selectOneExpenses() 
	 { 
	  //select_expense_type.click(); 
	 } 
	  
	  
	 public void clickOnExpensesMode() 
	 { 
	  //expense_mode.click(); 
	 } 
	  
	  
	 public void selectanExpenses() 
	 { 
	  //select_expense_mode.click(); 
	 } 
	 public void clickExpensesDate(String date) 
	 { 
	  expense_date.sendKeys(date); 
	 } 
	  
	 public void enterExpensesNote(String XYZ) 
	 { 
	  expense_note.sendKeys(XYZ); 
	 } 
	  
	 public void submitExpenses() 
	 { 
	  expenses_click.click(); 
	 } 
	
	

}
