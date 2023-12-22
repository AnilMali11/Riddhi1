package com.testbaseriddhi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.configfilereader.ConfigProperty;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	protected WebDriver driver;
	@BeforeTest
	public void beforetest() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		//driver.get("https://tronsoftech.in/projects/riddhi/index.php");
		ConfigProperty cp =new ConfigProperty();
		driver.get(cp.getURL());
		
		driver.manage().window().maximize(); 
	}
	
	@AfterTest 
	public void tearDown() 
	{ 
	driver.close(); 
	driver.quit(); 
	}

}
