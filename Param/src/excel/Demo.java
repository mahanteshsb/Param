package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fil=new FileInputStream("C:\\Users\\DELL\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
		Workbook wb=WorkbookFactory.create(fil);
		org.apache.poi.ss.usermodel.Sheet sheet=wb.getSheet("login");
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++) {	
				String us = wb.getSheet("login").getRow(i).getCell(0).toString();	
			//String us=sheet.getRow(i).getCell(0).toString();
			String pw = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(us+" "+pw);
			
		}
		
	}

}
