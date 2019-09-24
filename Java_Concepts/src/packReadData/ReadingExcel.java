package packReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	public void readExcelData() throws IOException {
		
		String filePath="E:\\Automation_Concetps\\Java_Concepts\\Data\\excel.xlsx";
		File fi=new File(filePath);
		FileInputStream fis=new FileInputStream(fi);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("yog");
		
		/*String username=sh.getRow(1).getCell(0).getStringCellValue();
		String password=sh.getRow(1).getCell(1).getStringCellValue();*/
		String user=sh.getRow(1).getCell(0).getStringCellValue();
		String pass=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(user);
		System.out.println(pass);
		
	}
	
	public static void main(String[] args) throws IOException {
		ReadingExcel obj=new ReadingExcel();
		obj.readExcelData();
	}

}
