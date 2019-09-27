import java.util.Scanner;

public class assig1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter integer:");
		int number = scnr.nextInt();

		/* Type your code here */
		System.out.println("You entered: " + number);
		int square = number * number;
		System.out.println(number + " squared is " + square);
		int cube = number * number * number;
		System.out.println("And " + number + " cubed is " + cube + " !!");
		System.out.println("Enter another integer:");
		int number2 = scnr.nextInt();
		int sums = number + number2;
		System.out.println(number + " + " + number2 + " is " + sums);
		int times = number * number2;
		System.out.println(number + " * " + number2 + " is " + times);

	}

}
