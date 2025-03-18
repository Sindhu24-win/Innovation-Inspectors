package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
public String[] excelDataRead(String sheetName, int rowNumber) throws IOException {
	String path = System.getProperty("user.dir") + "/src/test/resources/TestData/DsAlgo_TestData.xlsx";
	File excelFile = new File(path);
	
	FileInputStream Fis = new FileInputStream(excelFile);
	XSSFWorkbook workbook = new XSSFWorkbook(Fis);
	XSSFSheet sheet = workbook.getSheet(sheetName);

	Row row = sheet.getRow(rowNumber); 
        
    String username = getCellValue(row, 0);
    String password = getCellValue(row, 1);
    String passwordConfirmation = getCellValue(row, 2);
    
    workbook.close();
    Fis.close();
    
    String[] credentials = new String[3];
    credentials[0] = username;
    credentials[1] = password;
    credentials[2] = passwordConfirmation;

    return credentials;
	}
	
	private String getCellValue(Row row, int cellIndex) {
	    Cell cell = row.getCell(cellIndex);
	    if (cell == null || cell.getCellType() == CellType.BLANK) {
	        return ""; 
	    }
	    if (cell.getCellType() == CellType.NUMERIC) {
	        return String.valueOf(cell.getNumericCellValue());
	    }
	    if (cell.getCellType() == CellType.STRING) {
	        return cell.getStringCellValue();
	    }
	    return "";
	}
}