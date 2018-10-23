package lab6;
import java.util.Scanner;
public class PersonMain 
{
	public static void main(String[] args) throws MyException
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your first name");
			String fname=sc.next();
			System.out.println("Enter your last name");
			String lname=sc.next();
			System.out.println("Enter your gender");
			String gender=sc.next();
			System.out.println("Enter your age");
			int age=sc.nextInt();
            Person p = new Person(fname,lname,gender,age);
            System.out.println("First Name:"+p.getFName());
            System.out.println("Last Name:"+p.getLName());
            System.out.println("Gender:"+p.getGender());
            System.out.println("Age:"+p.getAge());
	}

}
