package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class OrganizationExcel {

	public void ReadData() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("./src/main/resources/OrganizationData.xlsx");
	}
}
