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
	
	
	//To click on customer icon
	public void mouseoncustomericon()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mouseover).build().perform();
	}
	//To click on customers link
	public void clickoncustomerslink() {
		this.customers.click(); 
	}
	//To click on edit button
	public void clickonedit() {
		// TODO Auto-generated method stub
		this.editbtn.click();
	}
	//Enter name in firstname textbox
	public void sendfirstname(String firstname) {
		// TODO Auto-generated method stub
		this.fname.clear();
		this.fname.sendKeys(firstname);
		
	}
	//To click on address1 tab
	public void clickonaddress1() {
		// TODO Auto-generated method stub
		this.addr1.click();
	}
	//ENter the postal code value
	public void sendpostcode(String pcode) {
		// TODO Auto-generated method stub
		this.postcode.clear();
		this.postcode.sendKeys(pcode);
	}
	//To click on reward points
	public void clickonrewardpoints() {
		// TODO Auto-generated method stub
		this.reward.click();
		
	}
	//Enter review in description textbox
	public void senddescription(String desc) {
		// TODO Auto-generated method stub
		this.description.clear();
		this.description.sendKeys(desc);
	}
	//Enter valid points in points textbox
	public void sendpoints(String poi) {
		// TODO Auto-generated method stub
		this.points.clear();
		this.points.sendKeys(poi);
		
	}
	//To click on add rewardpoints
	public void clickaddrewardpoints() {
		// TODO Auto-generated method stub
		this.addrewardpoints.click();
	}
	//To click on save button
	public void clickonsave() {
		// TODO Auto-generated method stub
		this.save.click();
	}

}
