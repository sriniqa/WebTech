package Utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="logindata")
	public Object[][] getData()
	{
		String path=System.getProperty("user.dir")+"data.xlsx";
		System.out.println(path);
		return ExcelUtils.getTestData(path, "Sheet1");
				
		
	}

}
