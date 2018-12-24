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

public class RTTC_017_return_delete_details {
	private WebDriver driver;
	public RTTC_017_return_delete_details(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement deletereturn;
	@FindBy(linkText="Returns")
    private WebElement returns;
	@FindBy(id="input-return-id")
	private WebElement returnid;
	@FindBy(linkText="Customers")
    private WebElement customers;
	@FindBy(name="selected[]")
	private List <WebElement> checkbox;


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
	
	public void clickonreturns() {
		this.returns.click();
	}
	public void sendreturnid(String orderid) {
		this.returnid.clear();
		this.returnid.sendKeys(orderid);
	}
	
	public void clickoncustomerslink() {
		this.customers.click(); 
	}
	
}
