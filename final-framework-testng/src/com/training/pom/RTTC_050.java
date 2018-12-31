package com.training.pom;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_050 {
	private WebDriver driver;
	public RTTC_050(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="button-filter")
	private WebElement filter;

	@FindBy(xpath="//i[@class='fa fa-user fw']")
	private WebElement mouseover;
	@FindBy(linkText="Customers")
    private WebElement customers;
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	private WebElement editbtn;
	@FindBy(id="input-firstname")
	private WebElement fname;
//	@FindBy(xpath="//i[@class='fa fa-minus-circle']")
	@FindBy(linkText="Address 1")
	private WebElement addr1;
	@FindBy(id="input-postcode1")
	private WebElement postcode;
	@FindBy(linkText="Reward Points")
	private WebElement reward;
	@FindBy(id="input-reward-description")
	private WebElement description;
	@FindBy(id="input-points")
	private WebElement points;
	@FindBy(id="button-reward")
	private WebElement addrewardpoints;
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement save;
	public void mouseoncustomericon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mouseover).build().perform();
	}
	public void clickoncustomerslink() {
		this.customers.click(); 
	}
	public void clickonedit() {
		// TODO Auto-generated method stub
		this.editbtn.click();
	}
	public void sendfirstname(String firstname) {
		// TODO Auto-generated method stub
		this.fname.clear();
		this.fname.sendKeys(firstname);
		
	}
	public void clickonaddress1() {
		// TODO Auto-generated method stub
		this.addr1.click();
	}
	public void sendpostcode(String pcode) {
		// TODO Auto-generated method stub
		this.postcode.clear();
		this.postcode.sendKeys(pcode);
	}
	public void clickonrewardpoints() {
		// TODO Auto-generated method stub
		this.reward.click();
		
	}
	public void senddescription(String desc) {
		// TODO Auto-generated method stub
		this.description.clear();
		this.description.sendKeys(desc);
	}
	public void sendpoints(String poi) {
		// TODO Auto-generated method stub
		this.points.clear();
		this.points.sendKeys(poi);
		
	}
	public void clickaddrewardpoints() {
		// TODO Auto-generated method stub
		this.addrewardpoints.click();
	}
	public void clickonsave() {
		// TODO Auto-generated method stub
		this.save.click();
	}

}
