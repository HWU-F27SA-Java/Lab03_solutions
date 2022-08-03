import java.util.Scanner;

public class Exercise5Factorial {

	public static void main(String[] args) {
		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters a number n
		System.out.print("Enter an integer number ? ");
		int n = keyboard.nextInt(); // read an int and store it into the variable n

		// calculate the factorial of n
		long factorial = 1;
		if (n > 1) {
			for (int f = n; f > 1; f--) {
				factorial *= f;
			}
		}
		System.out.print("Factorial " + n + " = " + factorial);
		keyboard.close();
	}

}
