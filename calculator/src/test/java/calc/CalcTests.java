package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTests {

	@Test
	public void canSumm() {
		
		double a = 2;
		double b = 3;
		double s = a + b;
		
		assertTrue("summ(a, b) is not equal a + b ", s == Calc.summ(a, b));		
	}
	
	@Test
	public void canSubstract() {
		
		double a = 2;
		double b = 3;
		double r = a - b;
		
		assertTrue("sub(a, b) is not equal a - b ", r == Calc.sub(a, b));
	}
	
}
