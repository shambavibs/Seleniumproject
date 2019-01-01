package com.training.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_049_pom_add_delete_returns {
	private WebDriver driver;
	public RTTC_049_pom_add_delete_returns(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(linkText="Returns")
    private WebElement returns;
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnew;
	@FindBy(id="input-order-id")
	private WebElement orderid;
	@FindBy(id="input-customer")
	private WebElement customer;
	@FindBy(id="input-firstname")
	private WebElement firstname;
	@FindBy(id="input-lastname")
	private WebElement lastname;
	@FindBy(id="input-email")
	private WebElement email;
	@FindBy(id="input-telephone")
	private WebElement telephone;
	@FindBy(id="input-product")
	private WebElement product;
	@FindBy(id="input-model")
	private WebElement model;
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement save;
	@FindBy(name="selected[]")
	private List <WebElement> checkbox;
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement deletereturn;
	//To click on sales icon
	public void mouseonsalesicon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mo).build().perform();
	}
	//To click on returns
	public void clickonreturns() {
		this.returns.click();
	}
	//To click on addnew icon
	public void clickonaddnewicon()
	{
		this.addnew.click();
	}
	//Enter orderid in the textbox
	public void sendorderid(String oid) {
		this.orderid.clear();
		this.orderid.sendKeys(oid);
		
	}
	//Enter name in customername text box
	public void sendcustomername(String cname) {
		this.customer.clear();
		this.customer.sendKeys(cname);
		
	}
	//Enter given value in firstname textbox 
	public void sendfirstname(String fname) {
		// TODO Auto-generated method stub
		this.firstname.clear();
		this.firstname.sendKeys(fname);
		
	}
	//Enter lastname in the textbox
	public void sendlastname(String lname) {
		// TODO Auto-generated method stub
		this.lastname.clear();
		this.lastname.sendKeys(lname);
		
	}
	//Enter emailid
	public void sendemail(String semail) {
		// TODO Auto-generated method stub
		this.email.clear();
		this.email.sendKeys(semail);
	}
	// Enter phone num
	public void sendphonenum(String pnum) {
		// TODO Auto-generated method stub
		this.telephone.clear();
		this.telephone.sendKeys(pnum);
	}
	//Select the product name
	public void clickonproduct(String prod) {
		// TODO Auto-generated method stub
		this.product.clear();
		this.product.sendKeys(prod);
	}
	//Select the model name
	public void clickonmodel(String mod) {
		// TODO Auto-generated method stub
		this.model.clear();
		this.model.sendKeys(mod);
	}
	//To click on save
	public void clickonsave() {
		// TODO Auto-generated method stub
		this.save.click();
	}	
	//Slecting the first checkbox
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
	//To click on deleteicon
	public void clickondeleteforreturnid()
	{
		this.deletereturn.click();
	}
	//To press on ok button on alerting box
	public void alerttoaccept()
	{
	Alert alert=driver.switchTo().alert();
	alert.accept();
	}
}


