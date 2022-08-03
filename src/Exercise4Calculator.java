/*
 * This program implement a simple calculator with only four operations +, - , * and /
 * The user selects an operator and enters two numbers
 * the calculator calculates the result and displays it
 */

import java.util.Scanner;

public class Exercise4Calculator {

	public static void main(String[] args) {

		char operator;
		Double operand1, operand2, result;

		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user selects an operator
		System.out.print("Select an operator: +, -, *, / ");
		String line = keyboard.nextLine(); // get the line typed by the user as a String
		operator = line.charAt(0);// get the first character which will be the operator

		// user enters the two numbers
		System.out.print("Enter number 1: ");
		operand1 = keyboard.nextDouble();

		System.out.println("Enter number 2: ");
		operand2 = keyboard.nextDouble();

		switch (operator) {

		case '+': // It is an addition
			result = operand1 + operand2;
			System.out.print(operand1 + "+" + operand2 + " = " + result);
			break;

		case '-': // It is a substraction
			result = operand1 - operand2;
			System.out.print(operand1 + "-" + operand2 + " = " + result);
			break;

		case '*': // It is a multiplication
			result = operand1 * operand2;
			System.out.print(operand1 + "*" + operand2 + " = " + result);
			break;

		case '/': // It is a division
			result = operand1 / operand2;
			System.out.print(operand1 + "/" + operand2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}

		keyboard.close();
	}

}
