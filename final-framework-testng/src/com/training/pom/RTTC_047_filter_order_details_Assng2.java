package com.training.pom;
import static org.testng.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_047_filter_order_details_Assng2 {
	private WebDriver driver;
	public RTTC_047_filter_order_details_Assng2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(linkText="Orders")
    private WebElement orders;
	@FindBy(id="input-order-id")
	private WebElement orderid;
	@FindBy(id="button-filter")
	private WebElement filter;
	@FindBy(name="filter_order_status")
	private WebElement orderstatus;
	@FindBy(id="input-date-added")
	private WebElement dateformat;
	@FindBy(xpath="//i[@class='fa fa-calendar']")
	private WebElement dateicon1;
	@FindBy(xpath="/html/body/div[2]/div/div[1]/table/tbody/tr[6]/td[2]")
	private WebElement startdate;
	@FindBy(xpath="//div[@class='col-sm-4']//div[2]//div[1]//span[1]//button[1]")
	private WebElement enddate;
	@FindBy(id="input-total")
	private WebElement total;
	@FindBy(id="input-customer")
	private WebElement customer;
	@FindBy(xpath="//i[@class='fa fa-calendar']")
	private WebElement dateicon2;
	public void sendtotal(String tot)
	{
		this.total.sendKeys(tot);
	}
	//
	public void startdate()
	{	 this.dateicon1.click();
		//get todays date using calender utility
		Calendar calender=Calendar.getInstance();
		Date today=calender.getTime();
		SimpleDateFormat smf=new SimpleDateFormat("YYYY-MM-DD");
		String currentdate=smf.format(today);
		Actions actions = new Actions(driver);
		actions.moveToElement(startdate);
		actions.click();
		actions.sendKeys(currentdate);
		actions.build().perform();	
	}
	//
	public void enddate()
	{
		this.enddate.click();
			//get todays date using calender utility
			Calendar calender=Calendar.getInstance();
			Date today=calender.getTime();
			SimpleDateFormat smf=new SimpleDateFormat("YYYY-MM-DD");
			String currentdate=smf.format(today);
			Actions actions = new Actions(driver);
			actions.moveToElement(enddate);
			actions.click();
			actions.sendKeys(currentdate);
			actions.build().perform();
	}
	// To click on orderstatus
	public void Orderstatus()
	{
		orderstatus.click();
	}
	//Selecting the orderstats
	public void selectorderstatus()
	{
		Select order_status = new Select(orderstatus);
		order_status.selectByVisibleText("Pending");
	}
	//To click on salesicon
	public void mouseonsalesicon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mo).build().perform();
	}
	//To click on orders link
	public void clickonorderslink() {
		this.orders.click();
	}
	//Entering orderid details
	public void sendorderid(String orderid) {
		this.orderid.clear();
		this.orderid.sendKeys(orderid);
	}
	// Click on filter button
	public void clickonfilter() {
		this.filter.click();
	}
	// Pass the customer name
	public void sendcustomername(String customer) {
		this.customer.clear();
		this.customer.sendKeys(customer);
	}
	
}
