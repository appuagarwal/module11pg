package lab10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Lab10_2 
{
	static void insert(Connection con)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");	
		int empId=sc.nextInt();
		System.out.println("Enter employee name:");
		String empName=sc.next();
		System.out.println("Enter employee sal:");
		int empSalary=sc.nextInt();
		System.out.println("Enter employee designation:");
		String empDesignation=sc.next();
		String insertQry="INSERT INTO employee_31 VALUES(?,?,?,?,?)";
		PreparedStatement pst=null;
		try 
		{
			String empInsuranceScheme;
			pst=con.prepareStatement(insertQry);
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setInt(3, empSalary);
			pst.setString(4, empDesignation);
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
				empInsuranceScheme="Enter details correctly";
			}
			pst.setString(5, empInsuranceScheme);
			pst.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	static void search(Connection con)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Insurance Scheme:");
		String empIS=sc.nextLine();
		String insertQry="SELECT * from employee_31 WHERE empInsuranceScheme=?";
		PreparedStatement pst=null;
		try 
		{
		ResultSet rs=null;
		pst=con.prepareStatement(insertQry);
		pst.setString(1, empIS);
		rs=pst.executeQuery();
		while(rs.next())
		{
		System.out.println(":"+rs.getInt("empId")+":"+rs.getString("empName")+":"+rs.getInt("empSalary")+rs.getString("empDesignation")+rs.getString("empInsuranceScheme"));
		}
		}
		 catch (SQLException e) 
		 {
				e.printStackTrace();
		 }
	}
	
	static void delete(Connection con)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id u want to delete:");
		int empId=sc.nextInt();
		String insertQry="DELETE FROM employee_31 where empid=?";
		PreparedStatement pst=null;
		try 
		{
		pst=con.prepareStatement(insertQry);
		pst.setInt(1, empId);
		pst.executeUpdate();
		}
		 catch (SQLException e) 
		 {
				e.printStackTrace();
		 }
	}
	public static void main(String[] args) 
	{
		System.out.println("enter your choice 1:insert 2:search 3:delete ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		Connection con=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:orcl11g","lab1btrg31","lab1boracle");
			switch(ch)
			{
			case 1:insert(con);
			       break;
			case 2:search(con);
			       break;
			case 3:delete(con);
			       break;
		    default:System.out.println("enter choice properly");	
			}
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}	
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
