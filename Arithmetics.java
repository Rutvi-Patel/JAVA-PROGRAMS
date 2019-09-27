import java.util.Scanner;

public class Arithmetics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int number1 = sc.nextInt();
		System.out.println("Enter a second number:");
		int number2 = sc.nextInt();
		int sum = number1 + number2;
		System.out.println("The sum is " + sum);
		int distance = number1 - number2;
		if (distance < 0) {
			distance = distance * -1;
		}
		System.out.println("The sum is " + distance);
		int product = number1 * number2;
		System.out.println("The sum is " + product);

	}
}
