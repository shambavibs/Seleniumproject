
package com.training.sanity.tests;


import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;

import com.training.pom.RTTC_016_filter_order_details;
import com.training.pom.RTTC_047_filter_order_details_Assng2;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Login_filterdetailsforOrders_RTTC_047 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RTTC_047_filter_order_details_Assng2 dashboard;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		dashboard = new RTTC_047_filter_order_details_Assng2(driver);
		// open the browser 
		driver.get(baseUrl);
	}
	
/*	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    Thread.sleep(100);
	    dashboard.mouseonsalesicon();
	    dashboard.clickonorderslink();
	    dashboard.sendorderid("112");
	    dashboard.clickonfilter();
	    dashboard.selectorderstatus();
	    dashboard.clickonfilter();
	    dashboard.startdate();
	    dashboard.clickonfilter();
	    dashboard.sendcustomername("shambavi bs");
	    dashboard.clickonfilter();
	    dashboard.sendtotal("1030");
	    dashboard.clickonfilter();
	    dashboard.enddate();
	    dashboard.clickonfilter();
	}   
	
	}
	 	