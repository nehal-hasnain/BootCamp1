package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFCell cell;
	
	public static void fileReader() throws IOException {
		
		File f=new File(userData.excelFile);
		FileInputStream fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		ws=wb.getSheet("Sheet1");
		
	}
	
	public static String sheetReader(int rowCount, int colCount) {
		
		cell=ws.getRow(rowCount).getCell(colCount);
		String cellValue=cell.getStringCellValue();
		return cellValue;
	}

}
