package calc;

public abstract class Calc {

	public static double summ(double a, double b) {

		return a + b;
		
	}

	public static double sub(double a, double b) {
		
		return a - b;
		
	}

	public static double prod(double a, double b) {
		
		return a * b;
		
	}

	public static double div(double a, double b) throws Exception {

		if (b == 0) throw new RuntimeException();
		return a / b;
	}
}
