package cecs_two_seven_four;

import java.util.Scanner;

public class largestnumber {
	public static void main(String[] args) {
		/* Type your code here. */
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 3 integers");
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int z = scnr.nextInt();
		if (x > y & x > z) {
			System.out.println(x);
		} else if (y > x & y > z) {
			System.out.println(y);
		} else if (z > y & z > x) {
			System.out.println(z);
		} else if (z == y & z == x) {
			System.out.println(z);
		}
	}// main
}// class