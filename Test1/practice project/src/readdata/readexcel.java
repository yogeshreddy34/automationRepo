package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readexcel {
	public void ReadData () throws IOException {
		String filepath = "E:\\Automation_Concetps\\practice project\\read data\\inputData.xlsx";
		File fi = new File (filepath);
		FileInputStream fis = new FileInputStream (fi);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("loginData");
		
		String UserName = sh.getRow(1).getCell(0).getStringCellValue();
		String PassWord = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(UserName);
		System.out.println(PassWord);
	}
	public static void main(String[] args) throws IOException {
		readexcel obj=new readexcel();
		obj.ReadData();
	}
}
