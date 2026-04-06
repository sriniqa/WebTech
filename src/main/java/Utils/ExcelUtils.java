package Utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	//test data location  and sheet name

	public static Object[][] getTestData(String filepath, String sheetName)
	{
		Object[][] data=null;
		try {
			FileInputStream fis=new FileInputStream(filepath);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			
			int rows=sheet.getPhysicalNumberOfRows();
			int columns=sheet.getRow(0).getPhysicalNumberOfCells();
			
			data =new Object[rows-1][columns];
			
			for(int i=1;i<rows;i++)
			{
				for(int j=0; j<columns;j++)
				{
					data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				}
				
			}
			
			workbook.close();
			
			}catch(Exception e)
			{
					e.printStackTrace();
			}
		return data;
	}
	
	
}
