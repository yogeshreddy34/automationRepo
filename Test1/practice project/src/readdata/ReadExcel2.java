package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	public void Excel() throws IOException {
		String filepath ="E:\\Automation_Concetps\\practice project\\read data\\inputData.xlsx";
		File fi = new File(filepath);
		FileInputStream fis = new FileInputStream(fi);
		
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sh = wb.getSheet("loginData");
		
		String UserName = sh.getRow(0).getCell(2).getStringCellValue();
		String PassWord = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(UserName);
		System.out.println(PassWord);
	}
	public static void main(String[] args) throws IOException {
		ReadExcel2 obj = new ReadExcel2();
		obj.Excel();
	}

}
