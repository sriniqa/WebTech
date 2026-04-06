package Utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils1 {
	
	public static XSSFSheet getSheet(String filepath, String sheetName)
	{
		try
		{
			FileInputStream fis=new FileInputStream(filepath);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			return workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

		public static Map<String , Integer> getColumnMap(XSSFSheet sheet)
		{
			
			Map<String, Integer> colmap=new HashMap();
			XSSFRow  headerRow=sheet.getRow(0);
			int colCount=headerRow.getPhysicalNumberOfCells();
			
			for(int i=0;i<colCount;i++)
			{
				String colName=headerRow.getCell(i).toString().trim();
				colmap.put(colName, i);
			}
			return colmap;
			
		}
	

}
