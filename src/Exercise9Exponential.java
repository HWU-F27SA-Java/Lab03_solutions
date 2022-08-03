import java.util.Scanner;

public class Exercise9Exponential {
	static final double EPSILON = 0.1E-14;

	public static void main(String[] args) {
		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters a number d
		System.out.print("Enter an integer number ? ");
		double d = keyboard.nextDouble(); // read a double and store it into the variable d

		//invoke estimateExponential() method
		// calculate the exponential of d

		double q = 0;
		int n = 0;
		double result = 0;

		do {
			// calculate the factorial of n
			long factorial = 1;
			if (n > 1) {
				for (int i = n; i > 1; i--) {
					factorial *= i;
				}
			}

			q = Math.pow(d, n) / factorial; // Math.pow calculates
			result += q;
			n++;
			System.out.print(".");
		} while (q > EPSILON);

		
		System.out.print("\nExponential " + d + " = " + result);
		keyboard.close();
	}

}
