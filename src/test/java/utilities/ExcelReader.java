package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
//	public static String getCellData(String filePath, String sheetName, int row, int col) {
//		String data ="";
	public static List<Map<String, String>> getData(String sheetName) {

        List<Map<String, String>> dataList = new ArrayList<>();

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/testdata/loginData.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sheetName);
//			Row rowobj = sheet.getRow(row);
//			Cell cell = rowobj.getCell(col);
//
//			data = cell.toString();		the commented part are written for reading a single data from the excel file
			 Row headerRow = sheet.getRow(0);

	            int rowCount = sheet.getPhysicalNumberOfRows();
	            int colCount = headerRow.getLastCellNum();

	            for (int i = 1; i < rowCount; i++) {

	                Row row = sheet.getRow(i);

	                Map<String, String> rowData = new HashMap<>();

	                for (int j = 0; j < colCount; j++) {

	                    String key = headerRow.getCell(j).toString();
	                    String value = row.getCell(j).toString();

	                    rowData.put(key, value);
	                }

	                dataList.add(rowData);
	            }

			workbook.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dataList;
	}

}
