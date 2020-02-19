package epam.interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Interest 
{
	@Test
	public void simpleintrerestCal()
	{
		Calculating test=new Calculating();
		double output=test.simpleInterest(500, 10, 20);
		assertEquals(50.0,output,0);
	}
	@Test
	public void CompoundInterestCal()
	{
		Calculating test=new Calculating();
		double output=test.compoundInterest(1250, 20, 8.4);
		assertEquals(1333.0992,output,0);
	}
}