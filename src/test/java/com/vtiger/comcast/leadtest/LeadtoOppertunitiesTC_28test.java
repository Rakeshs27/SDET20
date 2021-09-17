package com.vtiger.comcast.leadtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.genricUtility.BaseClass;
import com.vtiger.comcast.pomrepositylib.Leads;
import com.vtiger.comcast.pomrepositylib.LeadtoOpp;

public class LeadtoOppertunitiesTC_28test extends BaseClass {
	
	  /*1st Test case(GiveInvalidDataToExpectedCloseDate)*/
@Test
	public  void LeadtoOppertunitiesTC_31Test() throws Throwable {
		
		String leadlastname = eLib.getDataFromExcel("Sheet1", 1, 1);
		String Lcompanyname = eLib.getDataFromExcel("Sheet1", 1, 2);
		
		Leads createlead = new Leads(driver);
		createlead.CreateLead(leadlastname, Lcompanyname);
		
		LeadtoOpp convertlead = new LeadtoOpp(driver);
		convertlead.getLeadtoorglink().click();
		convertlead.getSelectopertunity().click();
		//convertlead.getCalendarclick().click();
		//convertlead.getDateclick().click();
		convertlead.getSave().click();
		
		
		/*verifying valid msg is displaying or not        */
		String expmsg = "values for Mandatory Fields are missing";
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	
		
		//Assert.assertEquals(actualmsg, expmsg);
		
//		if(actualmsg.equals(expmsg)) {
//			System.out.println("PASS::valid msg is displayed");
//		}
//		else {
//			System.out.println("FAIL::valid msg is not displayed");
//		}
//		
		//wLib.acceptAlert(driver);
		String actualtitle = driver.getTitle();
		wLib.switchToWindow(driver, actualtitle);
		
			
	}
}
