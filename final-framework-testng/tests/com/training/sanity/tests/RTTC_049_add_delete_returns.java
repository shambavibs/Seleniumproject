/*Admin to return product of customer & delete from return list*/

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
import com.training.pom.RTTC_049_pom_add_delete_returns;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_049_add_delete_returns {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RTTC_049_pom_add_delete_returns dashboard;


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
		dashboard = new RTTC_049_pom_add_delete_returns(driver);
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
	    dashboard.clickonreturns();
	    dashboard.clickonaddnewicon();
	    dashboard.sendorderid("90");
	    dashboard.sendcustomername("Sooman");
	    dashboard.sendfirstname("Sooman");
	    dashboard.sendlastname("Bose");
	    dashboard.sendemail("sbose@abc.com");
	    dashboard.sendphonenum("9876543210");
	    dashboard.clickonproduct("Integer vitae iaculis massa");
	    dashboard.clickonmodel("SKU-003");
	    dashboard.clickonsave();
	    dashboard.clickcheckbox();
	    dashboard.clickondeleteforreturnid();
	    dashboard.alerttoaccept();
	    
	}
	}
	 	