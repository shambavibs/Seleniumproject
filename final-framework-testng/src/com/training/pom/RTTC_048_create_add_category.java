package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_048_create_add_category {
	private WebDriver driver;
	public RTTC_048_create_add_category(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='fa fa-tags fw']")
	private WebElement mo;
	@FindBy(linkText="Categories")
    private WebElement categories;
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnew;
	@FindBy(id="input-name1")
	private WebElement categoryname;
	@FindBy(xpath ="//div[@class='note-editable panel-body']")
	private WebElement desc;
	@FindBy(id="input-meta-title1")
	private WebElement mtitle;
	@FindBy(id="input-meta-description1")
	private WebElement mdesc;
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement savebtn;
	@FindBy(linkText="Data")
	private WebElement data;
	@FindBy(linkText="Design")
	private WebElement design;
	@FindBy(linkText="Products")
	private WebElement prod;
	@FindBy(id="input-name1")
	private WebElement prodname;
	@FindBy(id="input-meta-title1")
	private WebElement pmegatitle;
	@FindBy(linkText="Links")
	private WebElement links;
	@FindBy(id="input-category")
	private WebElement lcategories;
	@FindBy(linkText="ETHNIC")
	private WebElement collections;
	@FindBy(linkText="Attribute")
	private WebElement attribute;
	@FindBy(linkText="Option")
	private WebElement option;
	@FindBy(linkText="Recurring")
	private WebElement recurring;
	@FindBy(linkText="Discount")
	private WebElement discount;
	@FindBy(linkText="Special")
	private WebElement special;
	@FindBy(linkText="Image")
	private WebElement image;
	@FindBy(linkText="Reward Points")
	private WebElement reward;
	@FindBy(id="input-model")
	private WebElement model;

	// To click on categoryicon
public void mouseoncategoryicon()
{
	Actions action=new Actions(driver);
	action.moveToElement(mo).build().perform();
}
// To click on categorylink
public void clickcatergorylink()
{
	this.categories.click();
}
//To click on addnew icon
public void clickonaddnewicon()
{
	this.addnew.click();
}
//Enter categoryname in text box
public void sendcategoryname(String catname)
{
	this.categoryname.clear();
	this.categoryname.sendKeys(catname);
}
//Enter value in description box
public void senddescription(String description)
{
Actions action=new Actions(driver);
action.moveToElement(desc).click().sendKeys(description).build().perform();
}
//Enter value in megatitle textbox
public void sendMegatagtitle(String megatitle)
{
	this.mtitle.clear();
	this.mtitle.sendKeys(megatitle);
}
//Enter value in mega description
public void sendMegatagdescription(String megadescription)
{
	this.mdesc.clear();
	this.mdesc.sendKeys(megadescription);
}
//To click on save button
public void clickonsave()
{
	this.savebtn.click();
}
// To click on data tab
public void clickondata()
{
	this.data.click();
}
// To click on design tab
public void clickondesign()
{
	this.design.click();
}
//To click on products tab
public void clickonProducts()
{
	this.prod.click();
}
//Enter productname in productname textbox
public void sendproductname(String productname)
{
	this.prodname.clear();
	this.prodname.sendKeys(productname);
}
//Enter vale in productmega title textbox
public void sendproductmegatagtitile(String producttitle)
{
	this.pmegatitle.clear();
	this.pmegatitle.sendKeys(producttitle);
}
//To click on links tab 
public void clickonlinkstab()
{
	this.links.click();
}
//To click on linkcategories tab
public void clickonlinkcatergories()
{
	this.lcategories.click();
	this.collections.click();
}
//To click on Attribte tab
public void clickonAttritubetab()
{
	this.attribute.click();
}
//To click on  Option tab
public void clickonOption()
{
	this.option.click();
}
//To click on Recurring tab
public void clickonRecurring()
{
	this.recurring.click();
}
//To click on discount
public void clickonDiscount()
{
	this.discount.click();
}
//To click on special
public void clickonSpecial()
{
	this.special.click();
}
//To click on Image
public void clickonImage()
{
	this.image.click();
}
//To click on  Reward points
public void clickonRewardPoints()
{
	this.reward.click();
}
//To click on  dataof products
public void clickondataofprodcts(String modelno)
{
	this.data.click();
	this.model.sendKeys(modelno);
}
}
