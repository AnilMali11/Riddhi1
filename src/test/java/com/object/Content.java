package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbaseriddhi.TestBase;

public class Content extends TestBase{
	
	WebDriver driver; 
	 
	 public Content(WebDriver driver) 
	 { 
	  PageFactory.initElements(driver,this); 
	 } 
	  
	 @FindBy(xpath = "/html/body/aside/ul/li[3]/a/span") 
	 WebElement cont_btn; 
	 @FindBy(xpath = "/html/body/aside/ul/li[3]/ul/li[1]/a") 
	 WebElement addcont_btn; 
	 @FindBy(id="select") 
	 WebElement select_btn; 
	 @FindBy(xpath = "//*[@id=\"select\"]/option[5]") 
	 WebElement select_frm; 
	 @FindBy(id="first-name") 
	 WebElement cnt_title; 
	 @FindBy(name="price") 
	 WebElement cnt_price; 
	 @FindBy(name="sequence") 
	 WebElement cnt_seq; 
	 @FindBy(name="alt_tag") 
	 WebElement cnt_tag; 
	 @FindBy(name="contentdesc") 
	 WebElement cnt_desc; 
	 @FindBy(name="content_date") 
	 WebElement cnt_date; 
	 @FindBy(name="content_location") 
	 WebElement cnt_loc; 
	 @FindBy(name="link") 
	 WebElement cnt_link; 
	 @FindBy(name="image_filename") 
	 WebElement img_file; 
	 @FindBy(xpath="/html/body/main/div/div[1]/div/div[2]/button") 
	 WebElement sub_btn; 
	  
	 public void clickOnContentButton() 
	 { 
	  cont_btn.click(); 
	 } 
	  
	 public void clickAddContent() 
	 { 
	  addcont_btn.click(); 
	 } 
	     
	 public void selectContent() 
	 { 
	  select_btn.click(); 
	 } 
	  
	 public void selectContentFrom() 
	 { 
	  select_frm.click(); 
	 } 
	  
	 public void enterContentTitle(String title) 
	 { 
	  cnt_title.sendKeys(title); 
	 } 
	  
	 public void enterContentPrice(String price) 
	 { 
	  cnt_price.sendKeys(price); 
	 } 
	  
	 public void enterContentSequence(String sequence) 
	 { 
	  cnt_seq.sendKeys(sequence); 
	 } 
	  
	 public void enterContentTag(String tag) 
	 { 
	  cnt_tag.sendKeys(tag); 
	 } 
	  
	 public void enterContentDecription(String decription) 
	 { 
	  cnt_desc.sendKeys(decription); 
	 } 
	  
	 public void enterContentDate(String date) 
	 { 
	  cnt_date.sendKeys(date); 
	 } 
	  
	 public void enterContentLink(String link) 
	 { 
	  cnt_loc.sendKeys(link); 
	 } 
	  
	 public void enterContentLocation(String location) 
	 { 
	  cnt_loc.sendKeys(location); 
	 } 
	  
	 public void enterContentAdd(String addess) 
	 { 
	  cnt_link.sendKeys(addess); 
	 } 
	  
	 
	public void enterContentImage(String imagepath) 
	{ 
	img_file.sendKeys(imagepath); 
	} 
	public void clikSubmitButton() 
	{ 
	sub_btn.click(); 
	}

}
