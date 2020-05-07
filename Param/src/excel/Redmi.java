package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Redmi {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fil=new FileInputStream("C:\\Users\\DELL\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");;
	Workbook wb = WorkbookFactory.create(fil);
		
		wb.getSheet("workbook").getRow(2).getCell(1).setCellValue("param12@gmail.com");
		wb.getSheet("workbook").getRow(2).getCell(2).setCellValue("Red mi");
		//get java file object in the write mode
		FileOutputStream fos =new FileOutputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\New Microsoft Office Excel Worksheet.xlsx");
		//save the work book in write mode
		wb.write(fos);
		//close the excel
		wb.close();
	}

}
