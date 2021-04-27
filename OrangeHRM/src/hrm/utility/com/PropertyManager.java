package hrm.utility.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager 
{
	public static FileInputStream fis;
	public static String getData(String parameter, String PropertyFileName)
	{
		String data=null;
		File demoFile=new File("D:\\Git_Repository\\OrangeHRM\\PropertyFile\\"+PropertyFileName+".properties");
		try {
			fis=new FileInputStream(demoFile);
			Properties pr=new Properties();
			pr.load(fis);
			data=pr.getProperty(parameter);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return data;		
	}
}
