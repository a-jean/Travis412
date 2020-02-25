package travis_ci_tutorial_java;


public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) { return a - b; }
	public int multiply(int a, int b) { return a * b; }


	public boolean dividebyzero(int a, int b) {
		if (b == 0) {
			System.out.println("You cannot divide by zero!");
			return false;
		} else {
			System.out.println(a / b);
			return true;
		}
	}
}