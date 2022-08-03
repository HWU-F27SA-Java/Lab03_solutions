import java.util.Scanner;

public class Exercise7GCdivisor {

	public static void main(String[] args) {
		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters two integer numbers
		System.out.print("Enter the first integer number ? ");
		int p = keyboard.nextInt(); // read an int and store it into the variable n
		System.out.print("Enter the second integer number ? ");
		int q = keyboard.nextInt(); // read an int and store it into the variable n

		// order the numbers from for n to be the smallest
		if (p > q) {
			//swap p and q
			int r = p;
			p = q;
			q = r;
		}

		int n = p; int m = q; //keep p and q untouched to be able to output them with result
		// calculate the GCD of p and q
		while (m != 0) { //loop until m become zero
			int temp = m;
			//update m with the remainder of dividing n by m
			m = n % m;		
			n = temp;
			//continue looping by replacing n by m and m by n%m
		}
		int result = n;
		
		//print result
		System.out.print("\nGCD( " + p + ", " + q + " ) = " + result);
		keyboard.close();

	}

}
