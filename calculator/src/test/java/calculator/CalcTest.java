/**
 * 
 */
package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author vadim
 *
 */
public class CalcTest {

	@Test
	public void canSumm() {
		
		double a = 3.14;
		double b = 2.73;
		double s = Calc.summ(a, b);
		
		assertTrue(s == a + b);
		
	}
}
