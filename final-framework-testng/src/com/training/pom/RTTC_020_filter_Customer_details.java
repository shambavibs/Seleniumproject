package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_020_filter_Customer_details {
	private WebDriver driver;
	public RTTC_020_filter_Customer_details(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="button-filter")
	private WebElement filter;

	@FindBy(xpath="//i[@class='fa fa-user fw']")
	private WebElement mouseover;
	@FindBy(linkText="Customers")
    private WebElement customers;
	@FindBy(id="input-name")
	private WebElement customername;
	@FindBy(id="input-email")
	private WebElement emailid;

	public void clickonfilter() {
		this.filter.click();
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
