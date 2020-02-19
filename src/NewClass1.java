
 package epam.interest;
import static org.junit.Assert.*;

import org.junit.Test;

public class NewClass1 
{
	@Test
	public void simpleintrerestCal()
	{
		Calculating test=new Calculating();
		double output=test.simpleInterest(100, 5, 10);
		assertEquals(50.0,output,0);
	}
	@Test
	public void CompoundInterestCal()
	{
		Calculating test=new Calculating();
		double output=test.compoundInterest(1200, 2, 5.4);
		assertEquals(1333.0992,output,0);
	}
}
