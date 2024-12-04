package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElemenets {
	
	public HomePageElemenets( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "searchBox")
	private WebElement SearchBox;
	public void searchBox() {
		SearchBox.click();
	}

	@FindBy(className = "tabSelected")
	private WebElement HomePageLink;
	public void homePageLink() {
		HomePageLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement CalendarLink;
	public void calendarLink() {
		CalendarLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement LeadsLink;
	public void leadsLink() {
		LeadsLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement OrganizationsLink;
	public void organizationLink() {
		OrganizationsLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement ContactsLink;
	public void contactsLink() {
		ContactsLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement OpportunitiesLink;
	public void opportunitiesLink() {
		OpportunitiesLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement ProductLink;
	public void productLink() {
		ProductLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement DocumentLink;
	public void documentLink() {
		DocumentLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement EmailLink;
	public void emailLink(){
		EmailLink.click();
	}
	
	@FindBy(xpath = "//a[text()='Trouble Tickets']")
	private WebElement TroubleTicketLink;
	public void troubleTicketLink() {
		TroubleTicketLink.click();
	}

	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement DashboardLink;
	public void dashboardLink() {
		DashboardLink.click();
	}
}
