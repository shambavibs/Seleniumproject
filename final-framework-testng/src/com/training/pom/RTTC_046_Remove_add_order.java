package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_046_Remove_add_order {
	private WebDriver driver;
	public RTTC_046_Remove_add_order(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(linkText="Orders")
    private WebElement orders;
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	private WebElement editicon;
	@FindBy(id="button-customer")
	private WebElement clickcontinue;
	@FindBy(xpath="//i[@class='fa fa-minus-circle']")
	private WebElement clickremovebtn;
	@FindBy(id="input-product")
	private WebElement chooseprod;
	@FindBy(id="input-quantity")
	private WebElement quantity;
	@FindBy(id="button-product-add")
	private WebElement addprodbtn;
	@FindBy(linkText="Lorem ipsum dolor sit amet")
	private WebElement Lprod;
	@FindBy(id="button-cart")
	private WebElement continuebtn;
	@FindBy(id="button-payment-address")
	private WebElement continuepayment;
	@FindBy(id="button-shipping-address")
	private WebElement continueshipping;
	@FindBy(id="button-save")
	private WebElement savebtn;
	
	public void mouseonsalesicon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mo).build().perform();
	}
	public void clickonorderslink() {
		this.orders.click();
	}
	public void clickoneditbutton()
	{
		this.editicon.click();
	}
	public void clickoncontinue()
	{
		this.clickcontinue.click();
	}
	public void clickonremoveicon()
	{
		this.clickremovebtn.click();
	}
	public void sendproductname()
	{
		
		this.chooseprod.clear();
		this.chooseprod.click();
		this.Lprod.click();

	}
	public void sendQuantity(String quantity)
	{
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
		
	}
	public void clickonaddproduct()
	{
		this.addprodbtn.click();
		
	}
	public void clickcontinue()
	{
		this.continuebtn.click();
	}
	public void clickcontinueonpaymentpage()
	{
		this.continuepayment.click();
	}
	public void clickoncontinueshipping()
	{
		this.continueshipping.click();
	}

	public void clickonsave()
	{
		this.savebtn.click();
	}

	}
