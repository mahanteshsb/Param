package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fil=new FileInputStream("C:\\Users\\DELL\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");;
		Workbook wb = WorkbookFactory.create(fil);
		wb.getSheet("workbook").getRow(2).getCell(2).setCellValue("Selenium");
		//get java file object in the write mode
		FileOutputStream fos =new FileOutputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\New Microsoft Office Excel Worksheet.xlsx");
		//save the work book in write mode
		wb.write(fos);
		//close the excel
		wb.close();	

	}

}
