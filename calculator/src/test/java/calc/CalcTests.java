package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTests {

	@Test
	public void canSumm() {

		double a = 2;
		double b = 3;
		double s = a + b;

		assertTrue("summ(a, b) is not equal to a + b ", s == Calc.summ(a, b));		
	}

	@Test
	public void canSubstract() {

		double a = 2;
		double b = 3;
		double r = a - b;

		assertTrue("sub(a, b) is not equal to a - b ", r == Calc.sub(a, b));
	}

	@Test
	public void canMultiply() {

		double a = 2;
		double b = 3;
		double p = a * b;

		assertTrue("prod(a, b) is not equal to a * b ", p == Calc.prod(a, b));
	}

	@Test
	public void canDivide() throws Exception {

		double a = 2;
		double b = 3;
		double q = a / b;
		
		assertTrue("div(a, b) is not equal to a / b ", q == Calc.div(a, b));
	}
}
