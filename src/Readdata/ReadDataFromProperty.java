package Readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("D:\\Property\\rupomaddress.properties");
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		           p.load(fi);
		      String  name=p.getProperty("Name");
		      String  age=p.getProperty("Age");
		      String  address=p.getProperty("address");
		      System.out.println("Name is " +name);
		      System.out.println("Age is " +age);
		      System.out.println("Address is " +address);
 
	}

}
