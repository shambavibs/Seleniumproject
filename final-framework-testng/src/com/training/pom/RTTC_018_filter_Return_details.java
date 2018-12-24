package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_018_filter_Return_details {
	private WebDriver driver;
	public RTTC_018_filter_Return_details(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(id="button-filter")
	private WebElement filter;
	@FindBy(id="input-customer")
	private WebElement customer;
	@FindBy(linkText="Returns")
    private WebElement returns;
	@FindBy(id="input-return-id")
	private WebElement returnid;
	@FindBy(id="input-name")
	private WebElement customername;

	public void mouseonsalesicon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mo).build().perform();
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

	public void sendcustomersname(String customername) {
		this.customername.clear();
		this.customername.sendKeys(customername);
	}

}