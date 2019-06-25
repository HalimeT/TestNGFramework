package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//li[text()='Dashboard']")
	public WebElement dashboardText;

	@FindBy(partialLinkText="PIM")
    public WebElement PIM;

    @FindBy(partialLinkText="Add Employee")
    public WebElement addEmployee;

    @FindBy(xpath="//li[@id='menu_admin_viewAdminModule']/a/span[2]")
	public WebElement admin;
    
    @FindBy(xpath="//li[@id='menu_admin_Organization']/a/span[2]")
	public WebElement organization;
    
    @FindBy(xpath="//a[@id='menu_admin_viewLocations']/span[2]")
   	public WebElement location;
    
    
  
    
    
  
    
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
