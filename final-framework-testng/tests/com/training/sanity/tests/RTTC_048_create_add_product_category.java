/*Admin to create category & add product on the created category*/
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
import com.training.pom.RTTC_048_create_add_category;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_048_create_add_product_category {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RTTC_048_create_add_category dashboard;


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
		dashboard = new RTTC_048_create_add_category(driver);
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
	   dashboard.mouseoncategoryicon();
	   dashboard.clickcatergorylink();
	   dashboard.clickonaddnewicon();
	   dashboard.sendcategoryname("ORNAMENTS");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   dashboard.senddescription("ornaments for ladies");
	   dashboard.sendMegatagtitle("ORNAMENTS");
	   dashboard.sendMegatagdescription("ornaments for ladies");
	   dashboard.clickondata();
	   Thread.sleep(500);
	   dashboard.clickondesign();
	   Thread.sleep(500);
	   dashboard.clickonsave();
	   dashboard.mouseoncategoryicon();
	   dashboard.clickonProducts();
	   dashboard.clickonaddnewicon();
	   dashboard.sendproductname("Finger Ring");
	   dashboard.sendproductmegatagtitile("Finger Ring for ladies");
	   dashboard.clickonlinkstab();
	   dashboard.clickonlinkcatergories();
	   dashboard.clickonAttritubetab();
	   dashboard.clickonOption();
	   dashboard.clickonRecurring();
	   dashboard.clickonDiscount();
	   dashboard.clickonSpecial();
	   dashboard.clickonImage();
	   dashboard.clickonRewardPoints();
	   dashboard.clickondesign();
	   dashboard.clickondataofprodcts("1234");
	   dashboard.clickonsave();
	   Thread.sleep(1000);	
	}   	
	}