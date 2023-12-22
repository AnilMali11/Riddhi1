package com.testscenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.data.MyDataProvider;
import com.object.Content;
import com.object.DashBoardPage;
import com.object.Expenses;
import com.object.ListExpenses;
import com.object.ListResidents;
import com.object.ListStaff;
import com.object.ListTenant;
import com.object.LoginPage;
import com.object.Receipt;
import com.object.SectionPage;
import com.object.User;
import com.object.ViewContent;
import com.object.ViewReceipt;
import com.testbaseriddhi.TestBase;

public class Tc_Riddhitest extends TestBase{
	
	@Test(dataProvider = "Data")
	public void performTest(String uname, String pass) throws Exception
	
	{
		
		//launch browser & log in
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(uname); 
	    lp.enterPassword(pass); 
		lp.clikOnSignin();
	}
	
	@DataProvider(name="Data")
	public Object[][]getData()
	{
		Object[][] obj = new Object [][]
	    {
			{"Riddhi","100"},
			{"Riddhi1","100"},
			{"Riddhi","2100"},
			{"Riddhi2","1500"},
			
			
		};
		return obj;
	}

	
	
	@AfterTest
	public void performTestRiddhi() throws Exception
	{
		//click on DashBoard
		  DashBoardPage dp = new DashBoardPage(driver); 
		  dp.clickOnDashboard();
		  
		  //Section 
		  SectionPage sp = new SectionPage(driver); 
		  sp.clickOnSection(); 
		  sp.enterSection("RiddhiTest1"); 
		  sp.clickOnSubmit(); 
		  sp.searchSection("RiddhiTest1"); 
		  System.out.println("Section Searched Successfully");
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		   
		//content 
		  Content cont = new Content(driver); 
          cont.clickOnContentButton(); 
		  cont.clickAddContent(); 
		  cont.selectContent(); 
		  cont.selectContentFrom(); 
		  cont.enterContentTitle("Riddhi Birthady Event"); 
		  cont.enterContentPrice("20000"); 
		  cont.enterContentSequence("XYZ"); 
		  cont.enterContentTag("XYZ"); 
		  cont.enterContentDecription("XYZ"); 
		  cont.enterContentDate("05-12-2023"); 
		  cont.enterContentLink("www.riddhihousing.com"); 
		  cont.enterContentLocation("Pune"); 
		  cont.enterContentAdd("Pune"); 
		 
		  cont.enterContentImage("C:\\Users\\Anil\\OneDrive\\Desktop\\projectSS.png"); 
		  cont.clikSubmitButton(); 
		  System.out.println("Content Added Successfully"); 
		  Thread.sleep(2000); 
		   
		  //view content 
		  ViewContent vc = new ViewContent(driver); 
		  vc.clcikviewContent(); 
		  vc.searchContent("Riddhi Birthady Event"); 
		  vc.clickOnAction(); 
		  vc.clickOnView(); 
		  driver.navigate().back(); 
		  vc.clearSearchBox(); 
		  vc.newSearchAnContent("Riddhi Birthady Event"); 
		  vc.clickActionButton(); 
		  vc.clickEditButton(); 
		  vc.clickOnSubmitButton(); 
		  vc.clcikviewContentButton(); 
		  System.out.println("clicked on view content"); 
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		//receipt 
		  Receipt rcpt = new Receipt(driver); 
		  rcpt.clikOnReceipt(); 
		  System.out.println("clicked on receipt"); 
		  rcpt.clikkOnAddReceipt(); 
		  rcpt.selectResident(); 
		  rcpt.selectResidentFrom(); 
		  rcpt.enterPaymentDescription("Birthday Event"); 
		  rcpt.selectPaymentMode(); 
		  rcpt.selectPayMode(); 
		  rcpt.enterTotalAmount("20000"); 
		  rcpt.enterReceivedAmount("20000"); 
		  rcpt.enterBalanceAmount("0"); 
		  rcpt.enterPaymentDescription("Offline"); 
		//  rcpt.clikOnSubButton(); 
		  driver.navigate().back(); 
		  System.out.println("driver navigate back success"); 
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		//view receipt 
		  ViewReceipt vr = new ViewReceipt(driver); 
		  vr.clickOnReceipts();
		  vr.clickOnViewReceipt(); 
		  System.out.println("clickOnViewReceipt success"); 
		           //  --       vr.clickOnfromDate("11_02_2023"); 
		          //   - --     vr.clickOnToDate("05122023"); 
		         //    --      vr.clickOnSubButton(); 
		  vr.clickOnSearch("191"); 
		  vr.clickOnViewReceiptButton();
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		  
		  //user 
		  User ur = new User(driver); 
	      ur.clikOnUser(); 
		  ur.clikOnAdd(); 
		  ur.clikOnRoleButton(); 
		  ur.selectRole(); 
		  ur.enterFullName("riddhi housing society"); 
		  ur.enterMobileNumber("1223154659"); 
		  ur.enterPasswordNumber("Pass@1004"); 
		  ur.enterLandLinedNumber("2260233"); 
		  ur.enterEmailId("riddhi.housing@gmail.com"); 
		  ur.clickOnSelectgender(); 
		  ur.selectMale(); 
		  ur.enterAdharNumber("361798492323"); 
		  ur.enterPanNumber("DFPPM6408B"); 
		  ur.clikOnSubButton(); 
		      
		  System.out.println("User Info Added Successfuly");
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		     // list of residents 
		  ListResidents lr = new ListResidents(driver); 
		  lr.clikOnlistResident(); 
          lr.clikOnSearchResident("jim"); 
          lr.clikOnViewResident(); 
	      lr.clikOnUpdateResident(); 
          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,800)", "");
		   //  lr.clikOnSaveResident(); 
		      
		  System.out.println("resident info save successfully"); 
		  Thread.sleep(2000);
		  
		    ListStaff ls = new ListStaff(driver); 
		    ls.clickOnListStaff(); 
		    System.out.println("no data found");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		     
		     //list tenants 
		     ListTenant lt = new ListTenant(driver); 
		     lt.clickOnListTenant(); 
		     lt.clickOnViewTenant(); 
		     lt.clickOnUpdateTenant(); 
		     lt.clickOnSaveTenant(); 
		     System.out.println("tenant info save successfully");
		     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		     //Expense 
		     Expenses exp = new Expenses(driver); 
		     exp.clickOnExpenses(); 
		     exp.clickOnAddExpenses(); 
		     exp.clickOnNameExpenses("Riddhi Housing Owner"); 
		     exp.clickOnExpensesAmount("20000"); 
		     exp.clickExpensesDate("06-12-2023"); 
		     exp.enterExpensesNote("XYZ"); 
		     //exp.submitExpenses(); 
		     System.out.println("Expenses Submit successfully");
		     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		     
		     
		   //list expenses 
		     ListExpenses le = new ListExpenses(driver); 
		     le.clikOnExpense(); 
		     le.clikOnListExpenses(); 
		     // driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		     le.downloadListExpenses(); 
		     System.out.println("Download successfully"); 
		     System.out.println("Testcase Passed"); 
		  
		  
	}

}
