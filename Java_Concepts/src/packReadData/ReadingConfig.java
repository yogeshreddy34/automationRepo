package packReadData;

import java.io.*;
import java.util.Properties;

public class ReadingConfig {
	
	public void readData() throws IOException {
		String filePath="E:\\Automation_Concetps\\Java_Concepts\\Data\\Config.properties";
		File fi=new File(filePath);
		FileInputStream fis=new FileInputStream(fi);
		
		Properties obj=new Properties();
		obj.load(fis);
		
		String uname=obj.getProperty("username");
		
		System.out.println(uname);
	}
	
	public static void main(String[] args) throws IOException {
		ReadingConfig obj=new ReadingConfig();
		obj.readData();
	}

}
