package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_017_order_delete_details {
	private WebDriver driver;
	public RTTC_017_order_delete_details(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement mo;
	@FindBy(linkText="Orders")
    private WebElement orders;
	@FindBy(name="selected[]")
	private List<WebElement> checkbox;
	@FindBy(id="button-delete")
	private WebElement deleteorder;
	public void clickondeletefororderid()
	{
		this.deleteorder.click();
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

}
