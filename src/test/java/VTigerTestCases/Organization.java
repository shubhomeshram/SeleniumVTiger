package VTigerTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.crm.pom.OrganizationRepo;

import BaseClass.CrossBrowsing;

public class Organization extends CrossBrowsing {

	@Test
	public void main() {
		
		assertEquals("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page", driver.getCurrentUrl());
		OrganizationRepo or = new OrganizationRepo(driver);
		or.organizationLink().click();
		or.addSymbol().click();
		or.accountName().sendKeys("manimanu");
		or.saveButton().click();
		
		
//		String header = or.organizationHeaderVerification().getText();
//		String name = or.OrganizationName().getText();
//		if (header.contains(name)) {
//			System.out.println("It is Verified");
//		}else {
//			System.out.println("It is not verified");
//		}
		
		
	}
}
