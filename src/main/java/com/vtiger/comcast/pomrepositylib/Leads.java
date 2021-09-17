package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads {

	public Leads(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(linkText="Leads")
		private WebElement leadlink;
		
		@FindBy(xpath="//img[@title='Create Lead...']") 
		private WebElement addleadlink;
		
		@FindBy(name="lastname")
		private WebElement lastname;
		
		@FindBy(name="company")
		private WebElement companyname;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveBtn;

		public void  CreateLead(String leadlastname, String Lcompanyname) {
			leadlink.click();
			addleadlink.click();
			lastname.sendKeys(leadlastname);
			companyname.sendKeys(Lcompanyname);
			saveBtn.click();
		}

		public WebElement getLeadlink() {
			return leadlink;
		}

		public WebElement getAddleadlink() {
			return addleadlink;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getCompanyname() {
			return companyname;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		

	}


