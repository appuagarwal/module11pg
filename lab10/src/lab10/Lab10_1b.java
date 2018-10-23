package lab10;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Lab10_1b
{
	public static void main(String[] args)
	{
		FileInputStream fis=null;
		
		try 
		{
			fis=new FileInputStream("PersonProps.properties");
			Properties myProps=new Properties();
			//myProps.load(fis);
			String unm=myProps.getProperty("Name");
			String pwd=myProps.getProperty("email");
			System.out.println("Credentials:"+unm+":"+pwd+"**************");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
