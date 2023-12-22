package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class Receipt extends TestBase{
	
	WebDriver driver; 
    public Receipt(WebDriver driver) 
     
    { 
     PageFactory.initElements(driver, this); 
    } 
     
    @FindBy(xpath="/html/body/aside/ul/li[4]/a/span") 
    WebElement receipt_btn; 
     
    @FindBy(xpath="/html/body/aside/ul/li[4]/ul/li[1]/a") 
 WebElement add_receipt ; 
  
 @FindBy(xpath="/html/body/main/div/div[1]/div/div[1]/form/div[1]/div/select") 
 WebElement select_resident; 
  
 @FindBy(xpath="/html/body/main/div/div[1]/div/div[1]/form/div[1]/div/select/option[3]") 
 WebElement select_frm; 
  
 @FindBy(name ="payment_desc") 
 WebElement pay_desc; 
  
 @FindBy(name="mode_of_payment") 
 WebElement pay_mode; 
  
 @FindBy(xpath="/html/body/main/div/div[1]/div/div[1]/form/div[3]/div/select/option[7]") 
 WebElement paymodeselect; 
  
 @FindBy(id =("total_amount")) 
 WebElement ttl_amt; 
     
 @FindBy(name="received_amount") 
 WebElement rcd_amt; 
 
 @FindBy(name = "balance_amount") 
 WebElement bal_amt; 
 
 @FindBy(name="payment_note") 
 WebElement pay_note; 
 
 @FindBy(name="submit") 
 WebElement submit_btn; 
  
 
  
    public void clikOnReceipt() 
     { 
     receipt_btn.click(); 
     } 
  
 public void clikkOnAddReceipt() 
 { 
  add_receipt.click(); 
 } 
  
 public void selectResident() 
 { 
  select_resident.click(); 
 } 
  
 public void selectResidentFrom() 
 { 
  select_frm.click(); 
 } 
  
 public void enterPaymentDescription(String amount) 
 { 
  pay_desc.sendKeys(amount); 
 } 
  
 public void selectPaymentMode() 
 { 
  pay_mode.click(); 
 } 
  
 public void selectPayMode() 
 { 
  paymodeselect.click(); 
 } 
  
 public void enterTotalAmount(String totalamount) 
 { 
  ttl_amt.sendKeys(totalamount); 
 } 
  
 public void enterReceivedAmount(String receivedamount) 
 { 
  rcd_amt.sendKeys(receivedamount); 
 } 
  
 public void enterBalanceAmount(String balanceamount) 
 { 
  bal_amt.sendKeys(balanceamount); 
 } 
  
  
public void enterPayDescription(String paymentdescription) 
{ 
bal_amt.sendKeys(paymentdescription); 
}

}
