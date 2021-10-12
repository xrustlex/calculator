/**
 * 
 */
package calculator;

/**
 * @author vadim
 *
 */
public abstract class Calculator implements ICalculator {

	public double sum(double a, double b) {

		return a + b;

	}

	public double substract(double a, double b) {

		return a - b;

	}

	public double product(double a, double b) {

		return a * b;

	}

	public double division(double a, double b) {

		return a * b;

	}
}
