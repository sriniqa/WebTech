package tests;

import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

import Utils.ExcelUtils1;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest1 extends BaseTest{
	
	@Test
	public void loginTest()
	{
		String path=System.getProperty("user.dir")+"/data.xlsx";
		
		XSSFSheet sheet=ExcelUtils1.getSheet(path, "Sheet1");
		
		Map<String, Integer> colmap=ExcelUtils1.getColumnMap(sheet);
		
		int rows=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rows; i++)
		{
			String username=sheet.getRow(i).getCell(colmap.get("username")).toString();
			String password=sheet.getRow(i).getCell(colmap.get("password")).toString();
			
			LoginPage lp=new LoginPage(driver);
			lp.login(username, password);
		}
		
		
	}
	

}
