package lab10;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
public class Lab10_1 
{
	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		Properties myProps=null;
		try 
		{
			fis=new FileInputStream("PersonProps.properties");
			myProps=new Properties();
			myProps.load(fis);
			String unm=myProps.getProperty("Name");
			String pwd=myProps.getProperty("email");
			System.out.println("Credentials:"+unm+":"+pwd+"**************");
			Set ks=myProps.keySet();
			Iterator it=ks.iterator();
			while(it.hasNext())
			{
				System.out.print(":"+it.next());
			}
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}

	}

}
