package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class User extends TestBase{
	
	WebDriver driver; 
	  
	 public User(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver, this); 
	 } 
	  
	 @FindBy(xpath="/html/body/aside/ul/li[5]/a/span") 
	 WebElement user_btn; 
	  
	 
	 @FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[1]/a") 
	 WebElement add_user; 
	  
	 
	 @FindBy(id="role") 
	 WebElement clickon_role; 
	  
	 
	 @FindBy(xpath="//*[@id=\"role\"]/option[2]") 
	 WebElement slct_role; 
	  
	 @FindBy(xpath="/html/body/main/div/div[1]/div/div[1]/form/div[3]/div/input") 
	 WebElement enter_name; 
	  
	 @FindBy(name="mobile") 
	 WebElement enter_mobile; 
	  
	 @FindBy(name="password") 
	 WebElement enter_pass; 
	  
	 @FindBy(name="landline") 
	 WebElement enter_lnnum; 
	  
	 @FindBy(name="email") 
	 WebElement enter_email; 
	     
	 @FindBy(name="address") 
	 WebElement enter_add; 
	 
	 @FindBy(name="gender") 
	 WebElement select_gender; 
	      
	 @FindBy(xpath="//*[@id=\"gender\"]/div/select/option[2]") 
	 WebElement select_male; 
	   
	 @FindBy(name="adhar_no") 
	 WebElement enter_adhar; 
	 
	 @FindBy(name="pan_no") 
	 WebElement enter_pan; 
	  
	 @FindBy(name="submit") 
	 WebElement clickon_submit; 
	 
	 
	  
	  
	 public void clikOnUser() 
	 { 
	  user_btn.click(); 
	 } 
	  
	 public void clikOnAdd() 
	 { 
	  add_user.click(); 
	 } 
	  
	 public void clikOnRoleButton() 
	 { 
	  clickon_role.click(); 
	 } 
	 
	 public void selectRole() 
	 { 
	  slct_role.click(); 
	 } 
	  
	 public void enterFullName(String fullname) 
	 { 
	  enter_name.sendKeys(fullname); 
	 } 
	  
	 public void enterMobileNumber(String mobnumber) 
	 { 
	  enter_mobile.sendKeys(mobnumber); 
	 } 
	  
	 public void enterPasswordNumber(String password) 
	 { 
	  enter_pass.sendKeys(password); 
	 } 
	  
	 public void enterLandLinedNumber(String landlinenumber) 
	 { 
	  enter_lnnum.sendKeys(landlinenumber); 
	 } 
	  
	 public void enterEmailId(String emailid) 
	 { 
	enter_email.sendKeys(emailid); 
	} 
	public void clickOnSelectgender() 
	{ 
	select_gender.click(); 
	} 
	public void selectMale() 
	{ 
	select_male.click(); 
	} 
	public void enterAdharNumber(String adhar) 
	{ 
	enter_adhar.sendKeys(adhar); 
	} 
	public void enterPanNumber(String pan) 
	{ 
	enter_pan.sendKeys(pan); 
	} 
	public void clikOnSubButton() 
	{ 
	clickon_submit.click(); 
	}

}
