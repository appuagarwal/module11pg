package com.cg.eis.service;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

/*interface EmployeeService
{
	public String InsuranceScheme(float empSalary, String empDesignation);
}*/
public class Service
{
	public Service(Employee e)
	{
		
	}

	//String empInsuranceScheme;
	//public Service(Employee e) {
	//}
	/*public String InsuranceScheme(float empSalary, String empDesignation)
	{
		if( (empSalary>5000 && empSalary<20000) && empDesignation.equals("System Associate"))
		{
			empInsuranceScheme="Scheme C";
		}
		else if( (empSalary>=20000 && empSalary<40000) && empDesignation.equals("Programmer"))
		{
			empInsuranceScheme="Scheme B";
		}
		else if(empSalary>=40000 && empDesignation.equals("Manager"))
		{
			empInsuranceScheme="Scheme A";
		}
		else if(empSalary<5000 && empDesignation.equals("Clerk"))
		{
			empInsuranceScheme="No Scheme";
		}
		else
		{
			try 
			{
				throw new EmployeeException("Enter data properly");
			} 
			catch (EmployeeException e)
			{
				e.printStackTrace();
			}
		}
		return empInsuranceScheme;
	}*/
	public void addInFile(Employee obj)
	{
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try
		{
			fos=new FileOutputStream("Employee.obj");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("Employee e1 is written in the file");
		}
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
	}
	
}
