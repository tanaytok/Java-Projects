package HesapMakinesiTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HesapMakinesiTest {
	
	private static HesapMakinesi calculator;

	
	@BeforeEach
	void setUp() throws Exception 
	{
		calculator = new HesapMakinesi();
	}

	@Test
	void testSum() 
	{
		int result = calculator.sum(3, 40);
		assertEquals(34,result);
	}
	
	void testSubtraction() 
	{
		int result = calculator.subtraction(34, 4);
		assertEquals(30,result);
	}
	
	void testDivision() 
	{
		try
		{
			int result = calculator.division(10, 2);
			assertEquals(5,result);
		}
		catch (Exception e)
		{
			e.printStackTrace(System.err);
		}
	}
	
	void testEqual() 
	{
		boolean result = calculator.equalIntegers(20, 20);
		assertEquals(true,result);
	}




}
