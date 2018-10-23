import java.util.Scanner;
import java.util.regex.Pattern;

public class TestValidationDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UR Name:");
		String eName=sc.next();
		String namePattern1="[A-Z][a-z]+";
		String namePattern2="[0-9]+";
		System.out.println("U have entered:"+eName);
		if(Pattern.matches(namePattern1, eName))
		{
			System.out.println("valid name");
		}
		else
		{
			System.out.println("invalid name");
		}

	}

}
