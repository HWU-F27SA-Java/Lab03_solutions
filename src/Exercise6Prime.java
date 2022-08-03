import java.util.Scanner;

public class Exercise6Prime {

	public static void main(String[] args) {
		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters a number n
		System.out.print("Enter an integer number ? ");
		int n = keyboard.nextInt();

		// check if number is prime
		boolean prime = true;
		int sqrt = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0) {
				// number is perfectly divisible - no prime
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.print(n + " is prime " );
		}else {
			System.out.print(n + " is NOT prime " );
		}
		keyboard.close();
	}

}
