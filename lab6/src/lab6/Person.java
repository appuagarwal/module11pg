package lab6;
public class Person
{
	private String first_name;
	private String last_name;
	String gender;
	int age;
	public String getFName()
	{
		if(first_name.equals("")) 
		{
			throw new ArithmeticException("invalid name");
		}
		return first_name;
	}
	public String getLName()
	{
		return last_name;
	}
	public String getGender()
	{
		return gender;
	}
	public int getAge() throws MyException 
	{

		if(age>=15)
		{
			return age;
		}
		else
		{
			
			throw new MyException("Age should be greter than 15");
		}	
	}

	public void setFName(String name)
	{
		first_name=name;
	}
	public void setLName(String name)
	{
		last_name=name;
	}
	public void setGender(String gen)
	{
		gender=gen;
	}
	public void setAge(int age)
	{
	
		this.age = age;
	}
	public Person(String first_name,String last_name,String gender2,int age)
       {
           	this.first_name = first_name;
	        this.last_name = last_name;
	        this.gender = gender2;
	        this.age = age;
       }

}
