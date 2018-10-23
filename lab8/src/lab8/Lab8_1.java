package lab8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab8_1 {

	public static void main(String[] args)
	{
		String reverse="";
		File myFile=new File("D:\\Apurva Agarwal\\lab8\\info.txt");
		FileInputStream in=null;
		FileOutputStream out=null;
 	   try
 	    {
 		     in=new FileInputStream(myFile);
			 out=new FileOutputStream("ReverseInfo.txt");
			 int data=in.read();
			 while(data!=-1)
			 {
				 reverse=(char)data+reverse;
				 data=in.read();
				 
			 }
			 byte[] s=reverse.getBytes();
			 out.write(s);
			 out.flush();
			 out.close();
			 System.out.println("file is reversed and named as ReverseInfo");
		 } 
 	   catch (IOException e)
 	   {
			
			e.printStackTrace();
		}
	}

}
