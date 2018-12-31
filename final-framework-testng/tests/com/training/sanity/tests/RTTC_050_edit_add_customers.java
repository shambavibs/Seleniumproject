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
	import com.training.pom.RTTC_050;
	import com.training.pom.LoginPOM;
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class RTTC_050_edit_add_customers {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private static Properties properties;
		private ScreenShot screenShot;
		private RTTC_050 dashboard;


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
			dashboard = new RTTC_050(driver);
			// open the browser 
			driver.get(baseUrl);
		}
		
	/*	@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		}*/
	  
	
		@Test
		public void customersTest() throws InterruptedException {
			loginPOM.sendUserName("admin");
			loginPOM.sendPassword("admin@123");		
			loginPOM.clickLoginBtn(); 
		    Thread.sleep(100);
		    dashboard.mouseoncustomericon();
		    dashboard.clickoncustomerslink();
		    dashboard.clickonedit();
		    Thread.sleep(1000);
		    dashboard.sendfirstname("Asmita");
		    dashboard.clickonaddress1();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(10000);
		     dashboard.sendpostcode("8796545");
		    dashboard.clickonrewardpoints();
		    Thread.sleep(1000);
		    dashboard.senddescription("review");
		    dashboard.sendpoints("50");
		    dashboard.clickaddrewardpoints();
		    Thread.sleep(1000);
		    dashboard.clickonsave();
		    Thread.sleep(1000);
		   
		  
		} 
	}