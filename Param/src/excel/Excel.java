package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
Workbook wb=WorkbookFactory.create(fis);
org.apache.poi.ss.usermodel.Sheet sheet=wb.getSheet("workbook");
//org.apache.poi.ss.usermodel.Sheet sheet=wb.getSheet("workbook");
Row row=sheet.getRow(0);
 
Cell cell=row.getCell(2);
String workbook = cell.getStringCellValue();
System.out.println(workbook);

	}

}
