
package com.object;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.testbaseriddhi.TestBase;

public class LoginPage extends TestBase {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) throws Exception
	{
		PageFactory.initElements(driver, this);
		
		
	}
    
	@FindBy(xpath="//*[@id=\"col3\"]/form/div[1]/input") 
	WebElement send_uname; 
	
	@FindBy(name="mypassword") 
	WebElement send_pass; 
	
	@FindBy(xpath="//*[@id=\"col3\"]/form/div[3]/button") 
	WebElement clik_signin_btn; 
	
	
	 public void enterUsername(String uname)
	 { 
		 send_uname.sendKeys(uname);
	 } 
	   
	 public void enterPassword(String pass)
	 { 
		 send_pass.sendKeys(pass);
	 } 
	  
	 public void clikOnSignin()
	 { 
		 clik_signin_btn.click();
	 }
	 
	
	 
	 
}
