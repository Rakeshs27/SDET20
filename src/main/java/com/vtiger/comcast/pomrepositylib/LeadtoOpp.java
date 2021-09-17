package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadtoOpp {
WebElement driver;
	public LeadtoOpp(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	
	//convert lead
	@FindBy(linkText="Convert Lead")
	private WebElement leadtoorglink;
	
	//select opportunity checkbox
	@FindBy(id="select_potential")
	private WebElement selectopertunity;
	
	//click calendar
	@FindBy(xpath="//img[@src='themes/images/miniCalendar.gif']")
	private WebElement calendarclick;
	
	//click date
	@FindBy(xpath="//td[@class='day selected']")
	private WebElement dateclick;
	
	//save
	@FindBy(xpath="//input[@name='Save']")
	private WebElement save;
	
	public WebElement getLeadtoorglink() {
		return leadtoorglink;
	}

	public WebElement getSelectopertunity() {
		return selectopertunity;
	}

	public WebElement getCalendarclick() {
		return calendarclick;
	}

	public WebElement getDateclick() {
		return dateclick;
	}

	public WebElement getSave() {
		return save;
	} 
	
}
