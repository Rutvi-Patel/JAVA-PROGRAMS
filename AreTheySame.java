/**
 * 
 */
package branching;

import java.util.Scanner;

/**
 * @author rutvi
 *
 */// 5.11,15 ,,, 6.14.19
public class AreTheySame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 == num2 & num2 == num3) {
			System.out.println("all the same");
		} else if (num1 != num2 & num1 != num3 & num2 != num3) {
			System.out.println("all different");
		} else {
			System.out.println("neither");
		}
		sc.close();
	}// main

}

//6.16 and 7.19
