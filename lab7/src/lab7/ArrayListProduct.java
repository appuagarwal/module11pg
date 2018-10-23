package lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> strList=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of product");
		int pCount=sc.nextInt();
	    String str;
	    
        for(int i=0;i<pCount;i++)
        {
        	 str=sc.next();
        	 strList.add(str);
        }
        
        
        Collections.sort(strList);
        
        
        for(String it:strList)
        {
        	System.out.println(it);
        }
	}

}
