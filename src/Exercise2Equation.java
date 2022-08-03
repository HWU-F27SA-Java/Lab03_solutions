/*
 * This program solve any equation of the form ax2 + bx + c =0
 * The user provides the coefficients a, b, c
 * The program uses global variables x1, x2, numberOfRoots to store results
 * It also uses a separate method for solving the equation
 */

import java.util.Scanner;

public class Exercise2Equation {

	static double x1;
	static double x2;
	static int numberOfRoots = 0;
	
	
	/*
	 * The main method proceeds in three steps:
	 * 1. reads the data from the user,
	 * 2. calls the solve equation to calculate the roots
	 * 3. prints the result
	 */
	public static void main(String[] args) {
		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters a, b, c
		System.out.println("Enter Values for a, b and c ");
		System.out.print("Enter coefficient a? ");
		double a = keyboard.nextDouble(); // read a double and store it into the variable a
		System.out.print("Enter coefficient b? ");
		double b = keyboard.nextDouble(); // read a double and store it into the variable b
		System.out.print("Enter coefficient c? ");
		double c = keyboard.nextDouble(); // read a double and store it into the variable c

		solve(a, b, c); // call the method solve() the equation

		// writes result
		switch (numberOfRoots) {
		case 0: // no roots
			System.out.println("The solution has no real roots");
			break;
		case 1:
			System.out.println("Equation has one root");
			System.out.println("x1 = x2 = " + x1);
			break;
		case 2:
			System.out.println("Equation has two roots");
			System.out.println("x1 = " + x1 + "x2 = " + x2);
			break;
		default:
			System.out.println("All real numbers are roots!");

		}

		keyboard.close();
	}

	/*
	 * this method takes the coefficients a, b , c as input and calculates the roots
	 * of the equation ax2+bx+c=0
	 * 
	 * It first process the degenerate cases where one or many coefficients are 0
	 * 
	 * Then calculates the determinant and check its sign
	 * 
	 * When the determinant is negative, there are no roots When the determinant is
	 * 0, there one root When the determinant is positive, the are two roots
	 * 
	 * The method stores the roots in the variables x1 and x2 and the number of
	 * roots in the variable numberOfRoots
	 */
	public static void solve(double a, double b, double c) {

		// First, process the degenerate cases
		if (a == 0 && b == 0 && c == 0) { // 0 = 0; all real numbers are roots!
			numberOfRoots = 3;
			return;
		}
		if (a == 0 && b == 0 && c != 0) { // c = 0; no root
			numberOfRoots = 0;
			return;
		}
		if (c == 0) { // ax2 + bx = 0; 0 is the only root
			numberOfRoots = 1;
			x1 = x2 = 0;
			return;
		}
		if (a == 0) { // bx + c = 0; -c/b is root
			numberOfRoots = 1;
			x1 = x2 = -c / b;
			return;
		}

		// the equation is regular (not degenerate
		// calculate the determinant
		double delta = b * b - 4 * a * c;

		if (delta < 0) { // no real roots
			numberOfRoots = 0;
			return;
		}

		if (delta == 0) {// one double root
			numberOfRoots = 1;
						x1 = x2 = -b / (2 * a);
			return;

		}

		// standard case with two roots
		numberOfRoots = 2;
		x1 = (-b - Math.sqrt(delta)) / (2 * a);
		x2 = (-b + Math.sqrt(delta)) / (2 * a);
		return;

	}
}
