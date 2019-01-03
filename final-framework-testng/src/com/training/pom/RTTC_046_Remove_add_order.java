package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	private WebElement ContinueButtonClick;
	@FindBy(xpath="//i[@class='fa fa-minus-circle']")
	private WebElement clickremovebtn;
	@FindBy(id="input-product")
	private WebElement chooseprod;
	@FindBy(id="input-quantity")
	private WebElement quantity;
	@FindBy(id="button-product-add")
	private WebElement addprodbtn;
	@FindBy(linkText="Finger Ring")
	private WebElement Lprod;
	@FindBy(id="button-cart")
	private WebElement continuebtn;
	@FindBy(id="button-payment-address")
	private WebElement continuepayment;
	@FindBy(id="button-shipping-address")
	private WebElement continueshipping;
	@FindBy(id="button-save")
	private WebElement savebtn;
// Click on Sales icon
	public void mouseonsalesicon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mo).build().perform();
	}
	// Click on orders link
	public void clickonorderslink() {
		this.orders.click();
	}
	// Click on edit button
	public void clickoneditbutton()
	{
		this.editicon.click();
	}
	// click on continue button
	public void ContinueClickButton()
	{
	this.ContinueButtonClick.click();
	}
	// Click on remove icon
	public void clickonremoveicon()
	{
		this.clickremovebtn.click();
	}
	// Send the product name
	public void sendproductname()
	{
		
		this.chooseprod.clear();
		this.chooseprod.click();
		this.Lprod.click();

	}
	//Method to enter valid credentials in Quality text box
	public void sendQuantity(String quantity)
	{
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
		
	}
	//Method to click on add product
	public void clickonaddproduct()
	{
		this.addprodbtn.click();
		
	}
	// To click on continue
	public void clickcontinue()
	{
		this.continuebtn.click();
	}
	//To click on continue of paymentpage
	public void clickcontinueonpaymentpage()
	{
		this.continuepayment.click();
	}
	//To click on continue of shipping page
	public void clickoncontinueshipping()
	{
		this.continueshipping.click();
	}
	// To click on save button
	public void clickonsave()
	{
		this.savebtn.click();
	}

	}
