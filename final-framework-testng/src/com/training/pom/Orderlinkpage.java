package com.training.pom;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderlinkpage {
	private WebDriver driver;
	public Orderlinkpage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement deletereturn;
	@FindBy(linkText="Orders")
    private WebElement orders;
	@FindBy(id="input-order-id")
	private WebElement orderid;
	@FindBy(id="button-filter")
	private WebElement filter;
	@FindBy(id="input-customer")
	private WebElement customer;
	@FindBy(linkText="Returns")
    private WebElement returns;
	@FindBy(id="input-return-id")
	private WebElement returnid;
	@FindBy(xpath="//i[@class='fa fa-user fw']")
	private WebElement mouseover;
	@FindBy(linkText="Customers")
    private WebElement customers;
	@FindBy(id="input-name")
	private WebElement customername;
	@FindBy(id="input-email")
	private WebElement emailid;
	@FindBy(name="selected[]")
	private List <WebElement> checkbox;
	@FindBy(id="button-delete")
	private WebElement deleteorder;
	public void clickondeletefororderid()
	{
		this.deleteorder.click();
	}
	public void clickondeleteforreturnid()
	{
		this.deletereturn.click();
	}
	public void alerttoaccept()
	{
	Alert alert=driver.switchTo().alert();
	alert.accept();
	}	
	public void clickcheckbox()
	{
		boolean bvalue=false;
		bvalue=checkbox.get(0).isSelected();
		if(bvalue==true)
		{
			checkbox.get(1).click();
		}
		else
		{
			checkbox.get(0).click();
		}
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
	public void clickonreturns() {
		this.returns.click();
	}
	public void sendreturnid(String orderid) {
		this.returnid.clear();
		this.returnid.sendKeys(orderid);
	}
	public void mouseoncustomericon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mouseover).build().perform();
	}
	public void clickoncustomerslink() {
		this.customers.click(); 
	}
	
	public void sendcustomersname(String customername) {
		this.customername.clear();
		this.customername.sendKeys(customername);
	}

	public void sendcustomeremailid(String emailid) {
		this.emailid.clear();
		this.emailid.sendKeys(emailid);
	}

}
