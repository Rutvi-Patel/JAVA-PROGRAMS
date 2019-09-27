package branching;

import java.util.Scanner;

public class RemoveSpaceNBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String sent = sc.nextLine();
		String answer = "";
		for (int i = sent.length() - 1; i >= 0; i--) {
			if (sent.charAt(i) != ' ') {
				answer += sent.charAt(i);
			}
		}
		System.out.println(answer);
		sc.close();

	}

}
