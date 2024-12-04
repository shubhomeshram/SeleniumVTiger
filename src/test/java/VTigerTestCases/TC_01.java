package VTigerTestCases;

import org.testng.annotations.Test;


import com.crm.pom.HomePageElemenets;

import BaseClass.CrossBrowsing;

public class TC_01 extends CrossBrowsing {

//	public static CalendarRepo cr;
	@Test
	public void main() {
//		cr = new CalendarRepo(driver);
//		cr.calendarTab().click();
		
		HomePageElemenets hp = new HomePageElemenets(driver);
		hp.calendarLink();
	}
}
