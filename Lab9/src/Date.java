
public class Date 
{
	int intMonth;
	int intYear;
	private int intDay;
	// Constructor
	Date(int intDay, int intMonth, int intYear)  	{
		this.intDay = intDay;
		this.intMonth = intMonth;
		this.intYear = intYear;
	}
	// setter and getter methods
	void setDay(int intDay)	
	{
		this.intDay = intDay;
	}
		int getDay( )		
	{
		return  this.intDay;
	}
	
	void setMonth(int intMonth)
	{
		this.intMonth = intMonth;
	}

	int getMonth( )
	{
		return  this.intMonth;
	}

	void setYear(int intYear)
	{
		this.intYear=intYear;
	}



	int getYear( )
	{
		return  this.intYear;
	}
	public String toString() //converts date obj to string.    
	{
		return	("Date is "+intDay+"/"+intMonth+"/"+intYear); 
	}
	
}
