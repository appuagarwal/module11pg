import static org.junit.Assert.*;
import org.junit.Test;
public class lab9_1testcases 
{
	@Test
	public void testGetFullName()
	{
		System.out.println("from TestPerson2");
		Lab9_1 per = new Lab9_1("Robert","King");
		assertEquals("Robert King",per.getFullName());
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testNullsInName()
		{
		System.out.println("from TestPerson2 testing exceptions");
		Lab9_1 per1 = new Lab9_1(null,null);		
		}
}
