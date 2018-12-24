package com.training.sanity.tests;



import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_018_filter_Return_details;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginforReturns_RTTC_017 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RTTC_018_filter_Return_details dashboard;


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
		dashboard = new RTTC_018_filter_Return_details(driver);
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void returnsTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    Thread.sleep(100);
	    dashboard.mouseonsalesicon();
	    screenShot.captureScreenShot("4");
	    dashboard.mouseonsalesicon();
	    screenShot.captureScreenShot("5");
	    dashboard.clickonreturns();
	    dashboard.sendreturnid("76");
	    dashboard.clickonfilter();
	    screenShot.captureScreenShot("6");
	    dashboard.sendcustomername("manzoor mehadi");
	    dashboard.clickonfilter();
	    screenShot.captureScreenShot("7");
	}
	}
	 	