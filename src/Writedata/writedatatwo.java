package Writedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class writedatatwo {
	public static void storedatatonotepad(String filepath, String key, String value)
	{
		try
		{
			File f=new File(filepath);
			FileInputStream fi=new FileInputStream(f);
			Properties p=new Properties();
			           p.load(fi);
			           p.setProperty(key, value);
			           FileOutputStream fo=new FileOutputStream(f);
			           p.store(fo, "Aaal Baal");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
