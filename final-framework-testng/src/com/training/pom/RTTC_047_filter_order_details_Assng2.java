package com.training.pom;
import static org.testng.Assert.assertNotNull;


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
	private WebElement dateicon;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/table/thead/tr[1]/th[2]")
	private WebElement month;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/table/tbody/tr[3]/td[3]")
	private WebElement day;
	@FindBy(xpath="/html/body/div[3]/div/div[3]/table/tbody/tr/td/span[10]")
	private WebElement year;
	@FindBy(className="datepicker")
	private WebElement datepicker;
	public String dot="2018-12-11";
	public String dateArray[]=dot.split("-");
	
	
	public String[] YYYY_MM_DD=null;

	public void selectmonth()
	{
		Select month_dec=new Select(month);
		month_dec.selectByValue("12");
	}
	public void selectday()
	{
		
	}
	public void selectyear()
	{
		
		Select year_2018=new Select(year);
		year_2018.selectByVisibleText("2018");
	}
	@FindBy(id="input-customer")
	private WebElement customer;

	public void clickondateicon()
	{
	this.dateicon.click();
	}
	public void Orderstatus()
	{
		orderstatus.click();
	}
	public void selectorderstatus()
	{
		Select order_status = new Select(orderstatus);
		order_status.selectByVisibleText("Pending");
	}
	public void mouseonsalesicon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mo).build().perform();
	}
	public void clickonorderslink() {
		this.orders.click();
	}
	public void sendorderid(String orderid) {
		this.orderid.clear();
		this.orderid.sendKeys(orderid);
	}
	public void clickonfilter() {
		this.filter.click();
	}
	public void sendcustomername(String customer) {
		this.customer.clear();
		this.customer.sendKeys(customer);
	}
	
}
