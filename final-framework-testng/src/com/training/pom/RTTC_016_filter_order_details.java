package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_016_filter_order_details {
	private WebDriver driver;
	public RTTC_016_filter_order_details(WebDriver driver) {
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
	@FindBy(id="input-customer")
	private WebElement customer;
	
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
