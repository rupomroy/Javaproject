package Writedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writedataone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\Property\\rupomaddress.properties");
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		           p.load(fi);
		           p.setProperty("country", "India");
		           FileOutputStream fo=new FileOutputStream(f);
		           p.store(fo, "updated address");

	}

}
