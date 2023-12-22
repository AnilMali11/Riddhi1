package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class ViewReceipt extends TestBase {
	

	WebDriver driver; 
    public ViewReceipt(WebDriver driver) 
     
    { 
     PageFactory.initElements(driver, this); 
     
    }
    @FindBy(xpath="/html/body/aside/ul/li[4]/a/span")
    WebElement receipts_btn;

    @FindBy(xpath="/html/body/aside/ul/li[4]/ul/li[2]/a")
    WebElement view_btn;
    
    @FindBy(xpath="//*[@id=\"sampleTable_filter\"]/label/input")
    WebElement search_btn;
    
    @FindBy(xpath="//*[@id=\"sampleTable\"]/tbody/tr/td[11]/a")
    WebElement view_receipt;
    
    
    public void clickOnReceipts()
    {
    	receipts_btn.click();
    }
    
    
    public void clickOnViewReceipt()
    {
    	view_btn.click();
    }
    
    
    public void clickOnSearch(String num)
    {
    	search_btn.sendKeys(num);
    }
    
    
    public void clickOnViewReceiptButton()
    {
    	view_receipt.click();
    }
  
}
