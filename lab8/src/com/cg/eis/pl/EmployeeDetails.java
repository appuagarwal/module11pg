package com.cg.eis.pl;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		String id=sc.next();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your salary"); 
		float sal=sc.nextFloat();
		System.out.println("Enter your designation");
		String desig=sc.next();
		Employee e=new Employee(id,name,sal,desig);
		Service emp=new Service(e);
		emp.addInFile(e);
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try 
		{
			fis=new FileInputStream("Employee.obj");
			ois=new ObjectInputStream(fis);
			Employee ee=(Employee)ois.readObject();
			System.out.println("Employee info from file"+ee);
			
		}
		catch (ClassNotFoundException | IOException e1) 
		{
			e1.printStackTrace();
		}
	}
}
