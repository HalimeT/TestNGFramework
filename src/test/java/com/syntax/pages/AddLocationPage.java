package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddLocationPage extends BaseClass {
	@FindBy(xpath="//div[contains(@class,'add-btn')]/a/i")
	public WebElement add_btn;
	
	@FindBy(css="input#name")
	public WebElement name;
	
	@FindBy(xpath="//*[@id='countryCode_inputfileddiv']//div//input")
    public WebElement country;
    
    @FindBy(xpath="//*[@id='countryCode_inputfileddiv']//div/ul/li")
    public WebElement listOfCountry;
	
	@FindBy(css="input#province")
	public WebElement state;
	
	@FindBy(css="input#city")
	public WebElement city;
	
	@FindBy(css="input#zipCode")
	public WebElement zipCode;
	
	@FindBy(css="input#phone")
	public WebElement phone;
	
	@FindBy(css="textarea#address")
	public WebElement address;
	
	@FindBy(css="input#fax")
	public WebElement fax;
	
	@FindBy(xpath="//ul[@id='select-options-28dbf8ca-f907-a9ee-4c5a-f0551cf11785']/preceding-sibling::input")//select
	public WebElement timeZoneDD;
	
	@FindBy(xpath="//div[@class='select-wrapper initialized']//ul[@id='select-options-e5fff184-ccd2-7cbc-c2ee-7fed154d8dc8']/li")//select
	public WebElement timeZone;
	
	@FindBy(xpath="//a[text()='Save']")
	public WebElement save_btn;
	
	@FindBy(xpath="//a[text()='Save']/following-sibling::a")
	public WebElement cancel_btn;
	
	
public AddLocationPage() {
		PageFactory.initElements(driver, this);
	}
	

}
