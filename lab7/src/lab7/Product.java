package lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of product");
		int pCount=sc.nextInt();
        String pNames[]=new String[pCount];
        for(int i=0;i<pCount;i++)
        {
        	pNames[i]=sc.next();
        }
        Arrays.sort(pNames);
        for(int i=0;i<pCount;i++)
        {
        	System.out.println(pNames[i]);
        }
	}

}
