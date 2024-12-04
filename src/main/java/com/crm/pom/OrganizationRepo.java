package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationRepo {
	
	public OrganizationRepo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement Organization_Link;
	
	public WebElement organizationLink() {
		return Organization_Link;
	}
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	WebElement Add_Symbol;
	public WebElement addSymbol() {
		return Add_Symbol;
	}
	
	@FindBy(name = "accountname")
	WebElement AccountName;
	public WebElement accountName() {
		return AccountName;
	}
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	WebElement Save_button;
	public WebElement saveButton() {
		return Save_button;
	}
	
	@FindBy(xpath = "//td[@class='showPanelBg']/div/table/tbody/tr/td/span")
	WebElement OrganizationHeaderName;
	public WebElement organizationHeaderVerification() {
		return OrganizationHeaderName;
	}
	
	@FindBy(xpath = "//div[@id='tblOrganizationInformation']/table/tbody/tr/td[2]")
	WebElement OrganizationName;
	public WebElement OrganizationName() {
		return OrganizationName;
	}
}
