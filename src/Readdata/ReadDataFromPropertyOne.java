package Readdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyOne {

	public static String getdatafromproperties(String filepath, String Key)
	{
		String x=null;
	
		try
		{
			File f=new File(filepath);
			FileInputStream fi=new FileInputStream(f);
			Properties p=new Properties();
			p.load(fi);
			x= p.getProperty(Key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
		
	
		
	}

}
