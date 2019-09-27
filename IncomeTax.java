package branching;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the income:");
		double income = sc.nextInt();
		double x = .01 * income;
		double a;
		if (income > 250000) {
			a = (.01 * 50000) + (.02 * (75000 - 50000)) + (.03 * (100000 - 75000)) + (.04 * (250000 - 100000))
					+ (.05 * (income - 250000));
			System.out.println("The tax payable would be $" + a);
		} else if (income > 100000) {
			a = (.01 * 50000) + (.02 * (75000 - 50000)) + (.03 * (100000 - 75000)) + (.04 * (income - 100000));
			System.out.println("The tax payable would be $" + a);
		}

		else if (income >= 75000) {
			a = (.01 * 50000) + (.02 * (75000 - 50000)) + (.03 * (income - 75000));
			System.out.println("The tax payable would be $" + a);
		} else if (income > 50000) {
			a = .02 * (income - 50000);
			System.out.println("The tax payable would be $" + a);
		} else if (income <= 50000) {
			a = .01 * income;
			System.out.println("The tax payable would be $" + a);
		}
		sc.close();
	}// main

}// public
