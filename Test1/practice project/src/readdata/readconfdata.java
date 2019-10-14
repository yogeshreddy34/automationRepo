package readdata;

//import java.io
import java.io.*;
import java.util.Properties;

//import packReadData.ReadingConfig;

public class readconfdata {
public void data() throws IOException {
	String filepath="E:\\Automation_Concetps\\practice project\\read data\\config";
	File fi=new File(filepath);
	FileInputStream fis=new FileInputStream(fi);
	
	
	Properties obj=new Properties();
	obj.load(fis);
	
	String uname=obj.getProperty("username");
	String pasw=obj.getProperty("password");
	System.out.println(uname);
	System.out.println(pasw);
}
public static void main(String[] args) throws IOException {
	readconfdata obj=new readconfdata();
	obj.data();
}
}
