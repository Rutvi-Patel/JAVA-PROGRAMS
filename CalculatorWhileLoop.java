package branching;

import java.util.Scanner;

public class CalculatorWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("*********Menu*********\n" + "1 - Addition \r\n" + "2 - Subtraction\r\n"
					+ "3 - Multiplication\r\n" + "4 - Division\r\n" + "5 - Exit");
			String user = sc.next();
			if (!(user.equals("1") || user.equals("2") || user.equals("3") || user.equals("4"))) {
				System.out.println("Goodbye");
				break;
			}
			System.out.println("Enter the first number:");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number:");
			int num2 = sc.nextInt();
			if (user.equals("1")) {
				System.out.println("The result is: " + (num1 + num2));
			} else if (user.equals("2")) {
				System.out.println("The result is: " + (num1 - num2));
			} else if (user.equals("3")) {
				System.out.println("The result is: " + (num1 * num2));
			} else if (user.equals("4")) {
				System.out.println("The result is: " + (num1 / num2));
			} // else if
		} // while
		sc.close();
	}// main

}// class
