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
import com.training.pom.Orderlinkpage;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private Orderlinkpage dashboard;


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
		dashboard = new Orderlinkpage(driver);
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException {
			loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    Thread.sleep(100);
	    screenShot.captureScreenShot("1");
	   dashboard.mouseonsalesicon();
	    dashboard.clickonorderslink();
	    screenShot.captureScreenShot("2");
	    dashboard.sendorderid("76");
	    dashboard.clickonfilter();
	    screenShot.captureScreenShot("3");
	    dashboard.sendcustomername("manzoor mehadi");
	    dashboard.clickonfilter();
	}   
	@Test(priority=2)
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
	@Test(priority=3)
	public void customersTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    Thread.sleep(100);
	    dashboard.mouseoncustomericon();
	    dashboard.clickoncustomerslink();
	    screenShot.captureScreenShot("8");
	    dashboard.sendcustomersname("shambavi bs");
	    dashboard.clickonfilter();
	    screenShot.captureScreenShot("9");
	    dashboard.sendcustomeremailid("mail2shambavi@gmail.com");
	    dashboard.clickonfilter();
	    screenShot.captureScreenShot("10");
	  
	}   
	@Test(priority=4)
	public void deleteorder() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    Thread.sleep(100);
	    screenShot.captureScreenShot("11");
	    dashboard.mouseonsalesicon();
	    dashboard.clickonorderslink();
	    dashboard.clickcheckbox();
	    screenShot.captureScreenShot("12");
	    dashboard.clickondeletefororderid();
	    screenShot.captureScreenShot("13");
	    dashboard.alerttoaccept();
	    screenShot.captureScreenShot("14");
   }   
	@Test(priority=5)
	public void deletereturnorders() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn(); 
	    screenShot.captureScreenShot("15");
	    dashboard.mouseonsalesicon();
	    dashboard.clickonreturns();
	    dashboard.clickcheckbox();
	    Thread.sleep(400);
	    screenShot.captureScreenShot("16");
	    dashboard.clickondeleteforreturnid();
	    Thread.sleep(400);
	    screenShot.captureScreenShot("17");
	    dashboard.alerttoaccept();
	    screenShot.captureScreenShot("18");
   }  
	}
	 	