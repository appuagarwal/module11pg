package lab8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab8_2 {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner s =null;
			s=new Scanner(new File("D:\\Apurva Agarwal\\lab8\\Number.txt"));
			s.useDelimiter(",");
			while(s.hasNext())
			{
			 int num=s.nextInt(); 
			 if( num%2 ==0)
			 {
			 System.out.println(num);
			 }
			}
			s.close();
		}

		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
