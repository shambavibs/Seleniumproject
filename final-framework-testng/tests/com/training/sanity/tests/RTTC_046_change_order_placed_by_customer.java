/*Admin to change order placed by the customer*/
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
import com.training.pom.RTTC_046_Remove_add_order;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_046_change_order_placed_by_customer {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	//private ScreenShot screenShot;
	private RTTC_046_Remove_add_order dashboard;


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
		//screenShot = new ScreenShot(driver); 
		dashboard = new RTTC_046_Remove_add_order(driver);
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    Thread.sleep(100);
	    dashboard.mouseonsalesicon();
	    dashboard.clickonorderslink();
	    dashboard.clickoneditbutton();
	    Thread.sleep(1000);
	    dashboard.ContinueClickButton();
	    dashboard.clickonremoveicon();
	    dashboard.sendproductname();
	    dashboard.sendQuantity("1");
	    dashboard.clickonaddproduct();
	    dashboard.clickcontinue();
	    dashboard.clickcontinueonpaymentpage();
	    dashboard.clickoncontinueshipping();
	    dashboard.clickonsave();

	}   
	
	}
	 	