package lab7;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeDetails;
import com.cg.eis.service.Service;

import java.util.*;


public class HashMapEmployee 
{
	
	public static void main(String[] args) 
	{
		HashMap<String,Employee> emp=new HashMap<String,Employee>(4);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of employees");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter your id");
			String id=sc.next();
			System.out.println("Enter your name");
			String name=sc.next();
			System.out.println("Enter your salary"); 
			float sal=sc.nextFloat();
			System.out.println("Enter your designation");
			String desig=sc.next();
			Employee e=new Employee(id,name,sal,desig);
			
			emp.put(id,e);
		}
		System.out.println("enter employee id you want to remove");
		String di=sc.next();
		emp.remove(di);
		//Service s=new Service();
		//String empIS=s.InsuranceScheme(sal,desig);
		/*TreeSet<Employee> empset=new TreeSet<Employee>(emp);
		Iterator<Employee>> it=empSet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Employee> entry=it.next();
			System.out.println("Key: "+entry.getKey()+" Name:"+entry.getValue());
		}
		
		*/
		System.out.println(emp);
		System.out.println("Print Enteries********");
		Set<Map.Entry<String,Employee>> mapSet=emp.entrySet();
		Iterator<Map.Entry<String,Employee>> it=mapSet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Employee> entry=it.next();
			System.out.println("Key: "+entry.getKey()+" Name:"+entry.getValue());
		}
	}

}
