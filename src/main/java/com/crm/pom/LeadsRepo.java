package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsRepo {

public LeadsRepo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Leads")
	private WebElement leads_tab;
	
	public WebElement leadsTab()
	{
		return leads_tab;
	}
	
	
	@FindBy(linkText = "Create a Lead")
	private WebElement create_a_lead;
	
	public WebElement createALead()
	{
		return create_a_lead;
	}
	
	@FindBy(linkText = "Import Leads")
	private WebElement importLeads;
	
	public WebElement importleads()
	{
		return importLeads;
	}
	
}
